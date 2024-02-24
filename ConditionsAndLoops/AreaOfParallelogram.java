import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the base:");
        double base = input.nextDouble();

        System.out.println("Enter the height:");
        double height = input.nextDouble();

        double area = base * height;
        System.out.println("Area of the parallelogram: " + area);
    }
}