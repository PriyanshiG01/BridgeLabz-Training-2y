package oops;
import java.util.*;

class Transaction { String id; String accId; double amount; public Transaction(String i,String a,double amt){id=i;accId=a;amount=amt;} }
class Account { String id; public Account(String id){this.id=id;} }

public class BankSystem {
    public static void main(String[] args) {
        List<Transaction> all = new ArrayList<>();
        Queue<Transaction> pending = new LinkedList<>();
        Set<String> validAccounts = new HashSet<>(Arrays.asList("A1","A2"));
        Deque<Transaction> rollbackStack = new ArrayDeque<>();

        all.add(new Transaction("T1","A1",100));
        all.add(new Transaction("T2","A3",50)); 
        pending.addAll(all);

        while (!pending.isEmpty()) {
            Transaction t = pending.remove();
            if (!validAccounts.contains(t.accId)) {
                System.out.println("Invalid account: " + t.accId);
                continue;
            }
          
            System.out.println("Executing " + t.id);
            rollbackStack.push(t);
       
            if (t.id.equals("T1")) {
                System.out.println("Simulated failure, rolling back " + t.id);
                Transaction r = rollbackStack.pop();
            }
        }
    }
}
