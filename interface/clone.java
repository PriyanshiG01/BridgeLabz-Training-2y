package functional_interface;
	class Student implements Cloneable {
	    int id;
	    String name;

	    Student(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    public Object clone() throws CloneNotSupportedException {
	        return super.clone(); // calls Object class's clone() method
	    }
	}

public class clone {
	    public static void main(String[] args) {
	        try {
	            Student s1 = new Student(101, "Priya");

	            // Step 4: Clone it
	            Student s2 = (Student) s1.clone();

	            // Step 5: Print both
	            System.out.println("Original Object: " + s1.id + " " + s1.name);
	            System.out.println("Cloned Object: " + s2.id + " " + s2.name);

	            // Check if they are different objects
	            System.out.println("Are they same object? " + (s1 == s2));

	        } catch (CloneNotSupportedException e) {
	            e.printStackTrace();
	        }
	    }
	}


