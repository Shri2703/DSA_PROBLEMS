import java.util.Scanner;

public class PyramidVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter base area and height
        System.out.print("Enter the base area of the pyramid: ");
        double baseArea = scanner.nextDouble();
        System.out.print("Enter the height of the pyramid: ");
        double height = scanner.nextDouble();

        // Calculate the volume of the pyramid
        double volume = (1.0/3.0) * baseArea * height;

        // Print the result
        System.out.println("Volume of the pyramid: " + volume);

        scanner.close();
    }
}
