package oops;
class Fruit {}
class Apple extends Fruit {}
class Mango extends Fruit {}
class Car {}  // non-fruit

class FruitBox<T extends Fruit> {
    private T fruit;

    public void add(T fruit) {
        this.fruit = fruit;
    }

    public void display() {
        System.out.println("Stored: " + fruit.getClass().getSimpleName());
    }
}

class TestFruit {
    public static void main(String[] args) {
        FruitBox<Apple> fb = new FruitBox<>();
        fb.add(new Apple());
        fb.display();

    }
}
