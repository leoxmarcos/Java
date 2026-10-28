public class CurrentAccount extends BankAccount {
    final float roi = 4.0f;

    CurrentAccount(String accountName, int accountNumber, double balance) {
        super(accountName, accountNumber, balance);
    }

    void display() {
        super.checkBalance();
        System.out.println("ROI=" + roi + "%");
    }
}