package priyanshi;
class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accNo, String name, double bal) {
        accountNumber = accNo;
        accountHolderName = name;
        balance = bal;
    }

    void display() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(101, "Priya", 5000);
        b1.display();
    }
}
