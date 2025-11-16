package oops;
class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

class TestBox {
    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.set(10);

        Box<String> strBox = new Box<>();
        strBox.set("Hello");

        Box<Double> doubleBox = new Box<>();
        doubleBox.set(99.99);

        System.out.println(intBox.get());
        System.out.println(strBox.get());
        System.out.println(doubleBox.get());
    }
}
