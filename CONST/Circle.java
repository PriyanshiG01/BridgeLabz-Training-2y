package priyanshi;

class Circle {
    double radius;

    public Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void displayRadius() {
        System.out.println("Radius: " + radius);
    }
}

public class Circle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.5);

        c1.displayRadius();
        c2.displayRadius();
    }
}
