class Book {
    int bookID;
    String title;
    String author;
    double price;

    // Static member
    static int count = 0;

    // Constructor
    Book(int bookID, String title, String author, double price) {
        this.bookID = bookID;
        this.title = title;
        this.author = author;
        this.price = price;
        count++;
    }

    // Display book information
    void display() {
        System.out.println("Book ID : " + bookID);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.println("Price   : " + price);
        System.out.println();
    }

    // Search by Book ID
    void search(int id) {
        if (bookID == id)
            System.out.println("Book Found: " + title);
        else
            System.out.println("Book Not Found");
    }

    // Overloaded search by Title
    void search(String title) {
        if (this.title.equalsIgnoreCase(title))
            System.out.println("Book Found: " + this.title);
        else
            System.out.println("Book Not Found");
    }

    // Compare price with another Book
    Book costlier(Book b) {
        if (this.price > b.price)
            return this;
        else
            return b;
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating multiple Book objects
        Book b1 = new Book(101, "Java", "James Gosling", 500);
        Book b2 = new Book(102, "Python", "Guido van Rossum", 700);
        Book b3 = new Book(103, "C Programming", "Dennis Ritchie", 400);

        // Display books
        System.out.println("BOOK 1");
        b1.display();

        System.out.println("BOOK 2");
        b2.display();

        System.out.println("BOOK 3");
        b3.display();

        // Search by Book ID
        System.out.println("Search by ID:");
        b1.search(101);

        // Search by Title
        System.out.println("\nSearch by Title:");
        b2.search("Python");

        // Find costlier book
        Book costly = b1.costlier(b2);

        System.out.println("\nCostlier Book:");
        costly.display();

        // Display total number of books
        System.out.println("Total Books Created: " + Book.count);
    }
}