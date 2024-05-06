import java.util.Scanner;
public class PerimeterOfRectangle{
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        double length =input.nextDouble(); 
        double width = input.nextDouble(); 

        // Calculate the perimeter of the rectangle
        double perimeter = 2 * (length + width);

        // Print the result
        System.out.println("Perimeter of the rectangle: " + perimeter);
    }
}
