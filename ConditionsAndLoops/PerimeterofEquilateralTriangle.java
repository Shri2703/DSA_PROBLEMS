import java.util.Scanner;
public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sideLength = input.nextDouble();
        // Calculate the perimeter of the equilateral triangle
        double perimeter = 3 * sideLength;

        // Print the result
        System.out.println("Perimeter of the equilateral triangle: " + perimeter);
    }
}
