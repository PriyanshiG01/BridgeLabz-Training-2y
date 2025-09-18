package priyanshi;
class Product {
    int productId;
    String productName;
    double price;

    Product(int id, String name, double p) {
        productId = id;
        productName = name;
        price = p;
    }

    void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Product p = new Product(301, "Laptop", 60000);
        p.display();
    }
}
