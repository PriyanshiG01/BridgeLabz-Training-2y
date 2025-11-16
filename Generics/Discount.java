package oops;
interface Category {}
class BookCategory implements Category {}
class ClothingCategory implements Category {}
class GadgetCategory implements Category {}

class Product<T extends Category> {
    double price;
    T category;

    public Product(double price, T category) {
        this.price = price;
        this.category = category;
    }

    public double getPrice() { return price; }
}

class Discount {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discount = product.getPrice() * (percentage / 100);
        System.out.println("Discount applied: " + discount);
    }
}
