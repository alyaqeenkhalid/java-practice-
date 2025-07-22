// Book.java
public class Book {
    // Instance variables
    String title;
    String author;
    double price;

    // Constructor with all three parameters
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Constructor with only title and author, price is set to 100
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 100; // default price
    }

    // Method to display book information
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    // Main method to test both constructors
    public static void main(String[] args) {
        // Using constructor with 3 parameters
        Book b1 = new Book("Java Programming", "John Smith", 150.0);

        // Using constructor with 2 parameters (price defaults to 100)
        Book b2 = new Book("Python Basics", "Alice Doe");

        // Display book info
        b1.displayInfo();
        System.out.println(); // blank line for clarity
        b2.displayInfo();
    }
}
