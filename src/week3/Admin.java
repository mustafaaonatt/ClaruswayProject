package week3;

public class Admin {
    public static void main(String[] args) {
        AccountInfo accountInfo = new AccountInfo();

        accountInfo.getInfo();
        System.out.println("We got info from the patient and we are going to print his/her info now. ");
        accountInfo.printInfo();

        AccountInfo accountInfo1 = new AccountInfo("Adam", "John",1234567890, "male");
        System.out.println("Name : " + accountInfo1.name);
        System.out.println("Surname : " + accountInfo1.surname);
        System.out.println("Phone number : " + accountInfo1.phoneNumber);
        System.out.println("Gender : " + accountInfo1.gender);



    }
}
