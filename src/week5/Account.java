package week5;

public class Account {
   private int accountBalance = 600;

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance += accountBalance;
    }

    public static void main(String[] args) {
        Account account = new Account();
        System.out.println("Get the accountBalance through getter method : " + account.getAccountBalance());
        account.setAccountBalance(200);
        int return1 = account.getAccountBalance();
        System.out.println("Set the AccountBalance through setter method :  " + return1);

    }
}
