import java.util.Scanner;

public class SphereVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter radius
        System.out.print("Enter the radius of the sphere: ");
        double radius = scanner.nextDouble();

        // Calculate the volume of the sphere
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);

        // Print the result
        System.out.println("Volume of the sphere: " + volume);

        scanner.close();
    }
}
