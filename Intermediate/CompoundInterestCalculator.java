import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal amount
        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        // Input annual interest rate
        System.out.print("Enter annual interest rate (in percentage): ");
        double rate = scanner.nextDouble();

        // Input time period in years
        System.out.print("Enter time period in years: ");
        double time = scanner.nextDouble();

        // Input number of times interest is compounded per year
        System.out.print("Enter number of times interest is compounded per year: ");
        int n = scanner.nextInt();

        // Calculate compound interest
        double amount = principal * Math.pow(1 + (rate / (n * 100)), n * time);

        // Calculate interest earned
        double interest = amount - principal;

        // Print the compound interest
        System.out.println("Compound interest: " + interest);

        scanner.close();
    }
}
