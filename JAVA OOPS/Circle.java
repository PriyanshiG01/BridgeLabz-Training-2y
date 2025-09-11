package java_method;
class Circle {
    double radius;

    public void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the circle: " + area);
    }

    public void calculateCircumference() {
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference of the circle: " + circumference);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 5.0; 
        circle.calculateArea();
        circle.calculateCircumference();
    }
}
