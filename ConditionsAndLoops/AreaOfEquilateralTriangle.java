//AREA OF EQALATERAL TRIANGLE
import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the side:");
        double sideLength = input.nextDouble();

        double area = (Math.sqrt(3) / 4) * Math.pow(sideLength, 2);
        System.out.println("Area of the equilateral triangle: " + area);
    }
}