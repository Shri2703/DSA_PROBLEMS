import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the first diagonal:");
        double diagonal1 = input.nextDouble();

        System.out.println("Enter the length of the second diagonal:");
        double diagonal2 = input.nextDouble();

        double area = 0.5 * diagonal1 * diagonal2;
        System.out.println("Area of the rhombus: " + area);
    }
}
