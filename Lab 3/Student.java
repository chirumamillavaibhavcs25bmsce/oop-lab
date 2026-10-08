class Student {
    int usn;
    String name;

    // Constructor
    Student(int usn, String name) {
        this.usn = usn;
        this.name = name;
    }

    // Method to display details
    void display() {
        System.out.println("USN  : " + this.usn);
        System.out.println("Name : " + this.name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(101, "Anu");
        Student s2 = new Student(102, "Ravi");

        s1.display();
        s2.display();
    }
}