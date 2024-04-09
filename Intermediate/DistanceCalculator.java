import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the coordinates of the first point
        System.out.println("Enter the coordinates of the first point:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();

        // Ask the user to enter the coordinates of the second point
        System.out.println("Enter the coordinates of the second point:");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();

        // Calculate the distance between the two points
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Print the distance
        System.out.println("Distance between the two points: " + distance);

        scanner.close();
    }
}
