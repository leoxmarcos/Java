public class SavingAccount extends BankAccount {
    final float roi = 3.0f;

    SavingAccount(String accountName, int accountNumber, double balance) {
        super(accountName, accountNumber, balance);
    }

    void display() {
        super.checkBalance();
        System.out.println("ROI=" + roi + "%");
    }
}