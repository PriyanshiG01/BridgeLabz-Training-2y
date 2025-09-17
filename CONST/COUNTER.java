package priyanshi;
class Counter {
    static int count = 0;

    public Counter() {
        count++;
    }

    public static void displayCount() {
        System.out.println("Number of objects created: " + count);
    }
}

public class COUNTER {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();
        Counter.displayCount();
    }
}
