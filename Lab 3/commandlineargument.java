//commandline argument
import java.util.Scanner;

public class CommandLineArgument {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first argument: ");
        String first = sc.nextLine();

        System.out.print("Enter second argument: ");
        String second = sc.nextLine();

        System.out.print("Enter third argument: ");
        String third = sc.nextLine();

        System.out.println("First Argument: " + first);
        System.out.println("Second Argument: " + second);
        System.out.println("Third Argument: " + third);

        sc.close();
    }
}
