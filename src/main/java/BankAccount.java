public class BankAccount {
    protected String accountName;
    protected int accountNumber;
    protected double balance;

    BankAccount(String accountName, int accountNumber, double balance) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdraw=" + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposit=" + amount);
        }
    }

    void checkBalance() {
        System.out.println("Account Name=" + accountName);
        System.out.println("Account Number=" + accountNumber);
        System.out.println("Balance=" + balance);
    }
}
