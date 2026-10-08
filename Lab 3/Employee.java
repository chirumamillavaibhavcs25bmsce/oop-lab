//nested constructer
class Employee {
    int id;
    String name;

    // Default constructor
    Employee() {
        this(101, "Anu");
    }

    // Parameterized constructor
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID   : " + id);
        System.out.println("Name : " + name);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();

        e1.display();
    }
}
