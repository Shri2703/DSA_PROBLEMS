import java.util.Scanner;
public class PerimeterofRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sideLength = input.nextDouble(); 


        // Calculate the perimeter of the rhombus
        double perimeter = 4 * sideLength;

        // Print the result
        System.out.println("Perimeter of the rhombus: " + perimeter);
    }
}
