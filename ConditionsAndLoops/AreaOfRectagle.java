import java.util.Scanner;

public class AOR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length:");
        double length = input.nextDouble();
        System.out.println("Enter the width:");
        double width = input.nextDouble();

        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}
