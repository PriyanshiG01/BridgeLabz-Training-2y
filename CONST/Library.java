package priyanshi;

class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    public LibraryBook(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    public void borrowBook() {
        if (available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
    }
}

public class LibraryBookMain {
    public static void main(String[] args) {
        LibraryBook lb1 = new LibraryBook("Java Programming", "Priyanshi", 300.0, true);

        lb1.displayBook();
        lb1.borrowBook();
        lb1.displayBook();
    }
}
