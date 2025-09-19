package priyanshi;
import java.util.*;

class Product {
    String name;
    Product(String name) { this.name = name; }
}

class Order {
    List<Product> products = new ArrayList<>();
    void addProduct(Product p) { products.add(p); }
}

class Customer {
    String name;
    List<Order> orders = new ArrayList<>();

    Customer(String name) { this.name = name; }

    void placeOrder(Order o) {
        orders.add(o);
    }
}

public class Main4 {
    public static void main(String[] args) {
        Customer c1 = new Customer("Bob");
        Order o1 = new Order();
        o1.addProduct(new Product("Laptop"));
        o1.addProduct(new Product("Phone"));

        c1.placeOrder(o1);
        System.out.println(c1.name + " placed an order with " + o1.products.size() + " products.");
    }
}
