import java.util.Scanner;

public class Problem02_AreaOfSquare {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("a = ");
        int a = Integer.parseInt(console.nextLine());
        int area = a * a;
        System.out.println("Area = " + area);
    }
}
