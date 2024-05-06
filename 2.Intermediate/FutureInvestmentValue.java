import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the investment amount
        System.out.print("Enter the investment amount: ");
        double investmentAmount = scanner.nextDouble();

        // Input the annual interest rate (in percentage)
        System.out.print("Enter the annual interest rate (in percentage): ");
        double annualInterestRate = scanner.nextDouble();

        // Convert annual interest rate to monthly interest rate (in decimal)
        double monthlyInterestRate = annualInterestRate / 100 / 12;

        // Input the number of years
        System.out.print("Enter the number of years: ");
        int numberOfYears = scanner.nextInt();

        // Calculate and print future investment value
        double futureValue = calculateFutureValue(investmentAmount, monthlyInterestRate, numberOfYears);
        System.out.println("Future Investment Value: $" + futureValue);

        scanner.close();
    }

    // Method to calculate future investment value
    public static double calculateFutureValue(double investmentAmount, double monthlyInterestRate, int numberOfYears) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
    }
}
