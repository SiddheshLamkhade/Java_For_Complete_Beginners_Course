package Week_3_Assignment1_Solutions.Problem3;

public class BankDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        new DepositThread(account).start();
        new WithdrawThread(account).start();
    }
}
