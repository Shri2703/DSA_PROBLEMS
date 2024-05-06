import java.util.Scanner;

public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter base area and height
        System.out.print("Enter the base area of the prism: ");
        double baseArea = scanner.nextDouble();
        System.out.print("Enter the height of the prism: ");
        double height = scanner.nextDouble();

        // Calculate the volume of the prism
        double volume = baseArea * height;

        // Print the result
        System.out.println("Volume of the prism: " + volume);

        scanner.close();
    }
}
