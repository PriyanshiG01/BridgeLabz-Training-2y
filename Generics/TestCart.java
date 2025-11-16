package oops;
import java.util.*;

class Cart<T> {
    List<T> items = new ArrayList<>();

    public void addItem(T item) { items.add(item); }
    public void removeItem(T item) { items.remove(item); }
    public void displayItems() { System.out.println(items); }
}

class Electronics {}
class Clothing {}

class TestCart {
    public static void main(String[] args) {
        Cart<Electronics> electronicCart = new Cart<>();
        electronicCart.addItem(new Electronics());
        electronicCart.displayItems();

        Cart<Clothing> clothingCart = new Cart<>();
        clothingCart.addItem(new Clothing());
        clothingCart.displayItems();
    }
}
