package priyanshi;
class Vehicle {
    String brand;
    String model;
    int year;

    Vehicle(String b, String m, int y) {
        brand = b;
        model = m;
        year = y;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("Honda", "City", 2022);
        v.display();
    }
}

