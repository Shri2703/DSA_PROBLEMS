import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the original price and discount rate
        System.out.print("Enter the original price: $");
        double originalPrice = scanner.nextDouble();
        System.out.print("Enter the discount rate (%): ");
        double discountRate = scanner.nextDouble();

        // Calculate the discount amount
        double discount = (originalPrice * discountRate) / 100;

        // Print the discount amount
        System.out.println("Discount amount: $" + discount);

        scanner.close();
    }
}
