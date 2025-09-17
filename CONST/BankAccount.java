package priyanshi;
package priyanshi;

class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient funds!");
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    public void displayAccountDetails() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder +
                           ", Balance: " + getBalance() + ", Interest: " + interestRate + "%");
    }
}

public class BankMain {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount("101", "Priyanshi", 5000, 3.5);
        acc.deposit(2000);
        acc.withdraw(1000);
        acc.displayAccountDetails();
    }
}
