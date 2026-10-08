class Book1 {
    int price;
    String title;

    Book(int price, String title) {
        this.price = price;
        this.title = title;
    }

    Book getBook() {
        Book b = new Book(500, "Java Programming");
        return b;
    }

    void display() {
        System.out.println("Price : " + price);
        System.out.println("Title : " + title);
    }

    public static void main(String[] args) {
        Book b1 = new Book(300, "C Programming");

        Book b2 = b1.getBook();

        b2.display();
    }
}
