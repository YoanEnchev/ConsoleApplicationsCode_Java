import java.util.Scanner;

public class Problem05_ConcateneteData {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("Name:");
        String name = console.nextLine();

        System.out.print("Surname:");
        String Surname = console.nextLine();

        System.out.print("Age:");
        int age = Integer.parseInt(console.nextLine());

        System.out.print("Town:");
        String town = console.nextLine();

        System.out.printf("You are %s %s, a %d - years old person from %s. ", name, Surname, age, town);
    }
}
