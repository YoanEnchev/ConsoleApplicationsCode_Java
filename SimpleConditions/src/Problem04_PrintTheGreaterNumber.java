import java.util.Scanner;

public class Problem04_PrintTheGreaterNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int first = Integer.parseInt(console.nextLine());
        int second = Integer.parseInt(console.nextLine());
        if (first > second) {
            System.out.println(first);
        } else {
            System.out.println(second);
        }
    }
}
