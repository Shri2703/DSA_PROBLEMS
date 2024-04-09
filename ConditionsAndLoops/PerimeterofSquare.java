import java.util.Scanner;
public class PerimeterofSquare {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        double sideLength =  input.nextDouble();  

        // Calculate the perimeter of the square
        double perimeter = 4 * sideLength;

        // Print the result
        System.out.println("Perimeter of the square: " + perimeter);
    }
}
