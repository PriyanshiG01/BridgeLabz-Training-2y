package oops;
import java.util.*;

class Product {
    double price;
    public Product(double price) { this.price = price; }
    public double getPrice() { return price; }
}

class Mobile extends Product {
    public Mobile(double price) { super(price); }
}

class Laptop extends Product {
    public Laptop(double price) { super(price); }
}

class PriceCalc {
    public static double calculateTotal(List<? extends Product> items) {
        double total = 0;
        for (Product p : items) total += p.getPrice();
        return total;
    }

    public static void main(String[] args) {
        List<Mobile> mobiles = Arrays.asList(new Mobile(10000), new Mobile(12000));
        System.out.println(calculateTotal(mobiles));
    }
}
