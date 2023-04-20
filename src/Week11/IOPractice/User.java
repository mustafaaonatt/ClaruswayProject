package Week11.IOPractice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class User {
    private static int managerId = 0;
    private static int userId = 0;
    private static String location ="/Users/mustafaonat/User/";

    private String uName;
    private String fName;
    private String lName;
    private String uId;
    private int pass;
    private int numMist;
    private boolean isManager;

    public static int getManagerId() {
        return managerId;
    }

    public static void setManagerId(int managerId) {
        User.managerId = managerId;
    }

    public static int getUserID() {
        return userId;
    }

    public static void setUserID(int userID) {
        User.userId = userID;
    }

    public static String getLocation() {
        return location;
    }

    public User(String uName, String fName, String lName, int pass, boolean isManager) {
        boolean isExists = false;

        File files = new File(location);

        for (File file : files.listFiles()){
            String filename = file.getName();
            if(filename.toUpperCase().contains("_"+uName.toUpperCase()+".TXT"));{
                isExists = true;
                break;
            }
        }
        if(isExists){
            System.out.println("!!! This username is already present please change the user name ");
        }

        this.uName = uName;
        this.fName = fName;
        this.lName = lName;
        this.pass = pass;
        this.isManager = isManager;
        this.numMist = 0;
        System.out.println("\t User account was generated. ");
        userToFile();
    }

    private void userToFile(){
        File loc = new File(location);

        if (!loc.exists()) {
            loc.mkdirs();
        }
        try {
            String fileName =this.isManager ? "M_" + ++managerId : "U_" + ++userId;
            fileName = fileName.concat("_"+this.uName.toUpperCase());
            File userTxt = new File(location + fileName + ".txt");
            if (!userTxt.exists()) {
                userTxt.createNewFile();
            }
            FileOutputStream fos = new FileOutputStream(userTxt);
            String details ="";
            details = details.concat("User Name : " + this.uName + "*** \n");
            details = details.concat("First Name : " + this.fName + "*** \n");
            details = details.concat("Last Name : " + this.lName + "*** \n");
            details = details.concat("Password : " + this.pass + "*** \n");
            details = details.concat("IsManager : " + this.isManager + "*** \n");
            details = details.concat("NumOfMistake : " + this.numMist + "*** \n");
            details = details.concat("Logins :*** \n");

            fos.write(details.getBytes());
            fos.flush();
            fos.close();
            System.out.println("\t User file was generated and saved");
        }catch (IOException e){
            System.out.println("Please reach help desk about File was not created error");
        }



    }
}
