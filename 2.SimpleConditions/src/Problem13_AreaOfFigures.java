import java.util.Scanner;

public class Problem13_AreaOfFigures {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();

        if (text.equals("square")) {
            double side = Double.parseDouble(console.nextLine());
            double area = side * side;
            System.out.printf("%.3f", area);
        }
        if (text.equals("rectangle")) {
            double side = Double.parseDouble(console.nextLine());
            double otherSide = Double.parseDouble(console.nextLine());
            double area = side * otherSide;
            System.out.printf("%.3f", area);
        }
        if (text.equals("circle")) {
            double radius = Double.parseDouble(console.nextLine());
            double area = Math.PI * radius * radius;
            System.out.printf("%.3f", area);

        }
        if (text.equals("triangle")) {
            double side = Double.parseDouble(console.nextLine());
            double heightTowardTheSide = Double.parseDouble(console.nextLine());
            double area = side * heightTowardTheSide * 0.5;
            System.out.printf("%.3f", area);
        }
    }
}
