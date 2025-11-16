package oops;
import java.util.*;

class Book { String id; String title; public Book(String id,String t){this.id=id;this.title=t;} public String toString(){return title;} }

public class Libraryy {
    public static void main(String[] args) {
        List<Book> allBooks = new ArrayList<>();
        Set<String> members = new HashSet<>();
        Queue<Book> issueQueue = new LinkedList<>();
        Deque<Book> returnedStack = new ArrayDeque<>();

        Book b = new Book("B1","Java");
        allBooks.add(b);
        members.add("M1");

        issueQueue.add(b);
        Book issued = issueQueue.remove();
      
        returnedStack.push(issued);

        if (!returnedStack.isEmpty()) System.out.println("Re-issuing " + returnedStack.peek());
    }
}
