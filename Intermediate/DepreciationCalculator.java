import java.util.Scanner;

public class DepreciationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the initial cost of the asset
        System.out.print("Enter the initial cost of the asset: ");
        double initialCost = scanner.nextDouble();

        // Input the salvage value (the value of the asset at the end of its useful life)
        System.out.print("Enter the salvage value: ");
        double salvageValue = scanner.nextDouble();
        // Input the useful life of the asset in years
        System.out.print("Enter the useful life of the asset (in years): ");
        int usefulLife = scanner.nextInt();
        // Calculate annual depreciation
        double annualDepreciation = (initialCost - salvageValue) / usefulLife;
        System.out.println("Annual depreciation: $" + annualDepreciation);
        scanner.close();
    }
}
