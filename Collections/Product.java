package oops;
import java.util.*;

class Product { String name; double price; int stock; public Product(String n,double p,int s){name=n;price=p;stock=s;} public String toString(){return name+"["+stock+"]";} }

public class Inventory {
    public static void main(String[] args) {
        Set<String> productNames = new HashSet<>();
        List<Product> products = new ArrayList<>();
        Queue<Product> restockQueue = new LinkedList<>();
        Deque<Product> restockedStack = new ArrayDeque<>();

        Product p = new Product("Milk",40.0,2);
        if (productNames.add(p.name)) products.add(p);

    
        for (Product prod : products) if (prod.stock < 5) restockQueue.add(prod);

    
        while (!restockQueue.isEmpty()) {
            Product r = restockQueue.remove();
            r.stock += 20;
            restockedStack.push(r);
        }

        if (!restockedStack.isEmpty()) {
            Product last = restockedStack.pop();
            last.stock -= 20;
        }
    }
}
