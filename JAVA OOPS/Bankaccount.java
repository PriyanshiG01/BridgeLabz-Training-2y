package java_method;
class BankAccount {
    String accountHolder;
    String accountNumber;
    double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountHolder = "John Doe";
        account.accountNumber = "ACC12345";
        account.balance = 1000.0;

        account.displayBalance();
        account.deposit(500.0);
        account.withdraw(300.0);
        account.withdraw(1500.0);
        account.displayBalance();
    }
}
