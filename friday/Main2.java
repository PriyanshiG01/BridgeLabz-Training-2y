package priyanshi;
class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    void viewBalance(BankAccount acc) {
        System.out.println(name + " balance: " + acc.balance);
    }
}

class BankAccount {
    Customer owner;
    double balance;

    BankAccount(Customer owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Customer c1 = new Customer("Alice");
        BankAccount acc1 = new BankAccount(c1, 1000);

        c1.viewBalance(acc1);
        acc1.deposit(500);
        c1.viewBalance(acc1);
    }
}
