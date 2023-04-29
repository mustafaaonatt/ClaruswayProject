package week12.App;

import model.Student;
import service.DatabaseService;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static String input = "";
    /* C-reate R-ead U-pdate D-elete */
    private static boolean mainMenu = true;
    private static boolean stdMenu = false;
    private static boolean crMenu = false;
    private static boolean tcMenu = false;
    private static boolean isNew = false;
    private static boolean islist = false;
    private static boolean isUpdate = false;
    private static boolean isDelete = false;
    private static DatabaseService dbs = new DatabaseService();

    public static void main(String[] args) {
        try {


            while (input.compareTo("P") != 0) {
                System.out.println("\n\n");
                if (mainMenu) {
                    displayMainMenu();
                } else if (stdMenu) {
                    displayStdMenu();
                } else if (crMenu) {
                    displayCourseMenu();
                } else if (tcMenu) {
                    displayTCMenu();
                }
            }
        } catch (SQLException e) {
            System.out.println("We have DB issue, please reach to help desk");
        }
    }

    private static void displayMainMenu() {
        System.out.println("--------------------------EDUCATION APPLICATION------------------------------");
        System.out.println("--------------------------MAIN MENU------------------------------------------");
        System.out.println("(S)tudent");
        System.out.println("(C)ourses");
        System.out.println("(T)aken Courses");
        System.out.println("(P)ower off");
        System.out.print("----------------------------------------------------------------------------->  ");
        input = scan.next().toUpperCase().substring(0, 1);
        if (input.compareTo("S") == 0) {
            mainMenu = false;
            stdMenu = true;
        } else if (input.compareTo("C") == 0) {
            mainMenu = false;
            crMenu = true;
        } else if (input.compareTo("T") == 0) {
            mainMenu = false;
            tcMenu = true;
        }
    }

    private static void displayStdMenu() throws SQLException {
        System.out.println("--------------------------EDUCATION APPLICATION------------------------------");
        System.out.println("--------------------------STUDENT MENU---------------------------------------");
        System.out.println("(A)dd new student");
        System.out.println("(L)ist of student");
        System.out.println("(U)pdate a student detail");
        System.out.println("(D)elete a student detail");
        System.out.println("(M)ain Menu");
        System.out.println("(P)ower off");
        System.out.print("-------------------------------------------------------------------------->  ");
        input = scan.next().toUpperCase().substring(0, 1);
        if (input.compareTo("A") == 0) {
            System.out.println("\n\n-------------------------- ADD A NEW STUDENT ________________________________");
            System.out.print("First Name : ");
            String fName = scan.next().trim().toUpperCase();
            System.out.print("Last Name : ");
            String lName = scan.next().trim().toUpperCase();
            System.out.print("Gender (F/M) : ");
            String gender = scan.next().trim().toUpperCase();
            System.out.print("Date of Birth (yyyy-mm-dd) : ");
            String dob = scan.next().trim();
            dbs.addStd(new Student(fName, lName, gender, Date.valueOf(dob)));
        } else if (input.compareTo("L") == 0) {
            System.out.println("\n\n--------------------------STUDENT LIST---------------------------------------");
            dbs.allStdList();
        } else if (input.compareTo("U") == 0) {
            System.out.println("\n\n--------------------------STUDENT LIST---------------------------------------");
            dbs.allStdList();
            System.out.print("Enter Student ID > ");
            int id = scan.nextInt();
            Student std = dbs.theStd(id);
            if (std != null) {
                System.out.println("\n\nSelect one detail to update;");
                System.out.println("1. First Name -> " + std.getfName());
                System.out.println("2. Last Name -> " + std.getlName());
                System.out.println("3. Gender -> " + std.getGender());
                System.out.println("4. Date of birth -> " + std.getDob());
                System.out.println("--------------------------------------");
                int detail = scan.nextInt();
                String strInput = null;
                Date dateInput = null;

                switch (detail) {
                    case 1:
                        System.out.println("Please write First Name > ");
                        strInput = scan.next().trim().toUpperCase();
                        break;
                    case 2:
                        System.out.println("Please enter Last Name > ");
                        strInput = scan.next().trim().toUpperCase();
                        break;
                    case 3:
                        System.out.println("Please enter Gender (F/M) > ");
                        strInput = scan.next().trim().toUpperCase().substring(0, 1);
                        break;
                    case 4:
                        System.out.println("Please enter Date of birth (yyyy-mm-dd) > ");
                        dateInput = Date.valueOf(scan.next().trim().toUpperCase());
                        break;
                }
                if (strInput != null || dateInput != null) {
                    dbs.updateStd(id, detail, strInput, dateInput);
                } else {
                    System.out.println("Please enter a valid detail.");
                }
            }
            } else if (input.compareTo("D") == 0) {
                System.out.println("\n\n--------------------------STUDENT LIST---------------------------------------");
                dbs.allStdList();
                System.out.print("Enter Student ID > ");
                int stdID = scan.nextInt();
                System.out.print("Please type \"DeleTe\" to validate the action > ");
                String confirm = scan.next();
                if (stdID > 0 && confirm.compareTo("DeleTe") == 0) {
                    dbs.deleteStd(stdID);
                } else {
                    System.out.println("Delete validation failed...");
                }
            } else if (input.compareTo("M") == 0) {
                stdMenu = false;
                mainMenu = true;
            }
        }


    private static void displayCourseMenu() {
        System.out.println("Course menu under development");
        crMenu = false;
        mainMenu = true;
    }

    private static void displayTCMenu() throws SQLException {
        System.out.println("--------------------------EDUCATION APPLICATION------------------------------");
        System.out.println("--------------------------TAKEN COURSES MENU---------------------------------");
        System.out.println("List by (C)ourse ");
        System.out.println("List by (S)tudent");
        System.out.println("(L)ist failed and passed courses");
        System.out.println("(M)ain Menu");
        System.out.println("(P)ower off");
        System.out.print("-------------------------------------------------------------------------->  ");
        input = scan.next().toUpperCase().substring(0, 1);
        if (input.compareTo("C") == 0) {
            System.out.println("HERE WW WILL DISPLAY BASED ON COURSES");
        } else if (input.compareTo("S") == 0) {
            System.out.println("\n\n----------- STUDENTS WHO TOOK COURSE-------------------------------");
            dbs.stdListTC();
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("Please enter student ID >      ");
            int stdId = scan.nextInt();
            dbs.stdCourseTc(stdId);
        }if (input.compareTo("L") == 0) {
            System.out.println("\n\n--------------------------Failed / Passed Courses");
            System.out.println("Select (F)ail or (P)assed > ");
            String fp = scan.next().trim().toUpperCase().substring(0,1);
            System.out.println("\n\n--------------------------BELOW ARE THE "+ (fp.compareTo("P") == 0  ? "PASSED" : "FAILED")+
                                                "COURSE -------------------");
            dbs.fpTC(fp.compareTo("P") == 0);
        }if (input.compareTo("M") == 0) {
            tcMenu = false;
            mainMenu = true;

        }
    }
}