package priyanshi;
import java.util.*;
class Book {
 String title;
 String author;

 Book(String title, String author) {
     this.title = title;
     this.author = author;
 }
}
class Library {
 List<Book> books = new ArrayList<>();

 void addBook(Book book) {
     books.add(book);
 }

 void showBooks() {
     for (Book b : books) {
         System.out.println(b.title + " by " + b.author);
     }
 }
}

public class LibraryMain {
 public static void main(String[] args) {
     Book b1 = new Book("Java Basics", "James");
     Book b2 = new Book("Python Guide", "Guido");

     Library lib = new Library();
     lib.addBook(b1);
     lib.addBook(b2);

     lib.showBooks();
 }
}
