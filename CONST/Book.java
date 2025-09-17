package priyanshi;
class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Book {
    private double fileSize;

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void displayEBook() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title +
                           ", Author: " + getAuthor() + ", File Size: " + fileSize + "MB");
    }
}

public class Book {
    public static void main(String[] args) {
        EBook ebook = new EBook("123-456", "Java Basics", "Priyanshi", 5.6);
        ebook.displayEBook();
    }
}
