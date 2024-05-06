import java.util.Scanner;
public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble(); 

        // Calculate the perimeter (circumference) of the circle
        double perimeter = 2 * Math.PI * radius;

        // Print the result
        System.out.println("Perimeter of the circle: " + perimeter);
    }
}
