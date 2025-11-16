package oops;
import java.util.*;

class Order {
    final String orderId;
    final String details;
    public Order(String id, String d) { orderId = id; details = d; }
    @Override public boolean equals(Object o) { return o instanceof Order && Objects.equals(orderId, ((Order)o).orderId); }
    @Override public int hashCode() { return Objects.hash(orderId); }
    public String toString() { return orderId + ":" + details; }
}

public class ECommerceSystem {
    public static void main(String[] args) {
        List<Order> allOrders = new ArrayList<>();
        allOrders.add(new Order("O1","itemA"));
        allOrders.add(new Order("O2","itemB"));
        allOrders.add(new Order("O1","itemA-duplicate"));

        Set<Order> unique = new LinkedHashSet<>(allOrders);
   
        Queue<Order> queue = new LinkedList<>(unique);
        // stack for failed
        Deque<Order> failed = new ArrayDeque<>();

        while(!queue.isEmpty()) {
            Order o = queue.remove();
            boolean success = process(o);
            if (!success) failed.push(o);
        }

        while(!failed.isEmpty()) {
            Order r = failed.pop();
            System.out.println("Retrying " + r);
            process(r);
        }
    }

    static boolean process(Order o) {
      
        if (o.orderId.equals("O2")) {
            System.out.println("Failed: " + o);
            return false;
        }
        System.out.println("Processed: " + o);
        return true;
    }
}
