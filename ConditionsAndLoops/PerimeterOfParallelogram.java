import java.util.Scanner;
public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sideLengthA =  input.nextDouble(); 
        double sideLengthB =  input.nextDouble(); 
        // Calculate the perimeter of the parallelogram
        double perimeter = 2 * (sideLengthA + sideLengthB);

        // Print the result
        System.out.println("Perimeter of the parallelogram: " + perimeter);
    }
}
