//private access specifier
class LibraryCard {
    private int cardNo;
    private String holderName;

    void setDetails(int c, String n) {
        cardNo = c;
        holderName = n;
    }

    void display() {
        System.out.println("Card Number : " + cardNo);
        System.out.println("Holder Name : " + holderName);
    }

    public static void main(String[] args) {
        LibraryCard l = new LibraryCard();

        l.setDetails(501, "Kiran");
        l.display();
    }
}
