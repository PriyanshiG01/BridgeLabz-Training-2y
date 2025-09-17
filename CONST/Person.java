package priyanshi;

class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    public void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class PersonMain {
    public static void main(String[] args) {
        Person p1 = new Person("Priyanshi", 20);
        Person p2 = new Person(p1);

        p1.displayPerson();
        p2.displayPerson();
    }
}
