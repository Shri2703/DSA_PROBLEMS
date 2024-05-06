public class CommissionCalculator {
    
    // Calculate commission percentage
    public static double calculateCommissionPercentage(double commissionAmount, double totalSaleAmount) {
        return (commissionAmount / totalSaleAmount) * 100.0;
    }
    
    // Calculate commission amount
    public static double calculateCommissionAmount(double totalSaleAmount, double commissionPercentage) {
        return (totalSaleAmount * (commissionPercentage / 100.0));
    }
    
    // Calculate total sale amount
    public static double calculateTotalSaleAmount(double commissionAmount, double commissionPercentage) {
        return (commissionAmount / (commissionPercentage / 100.0));
    }

    public static void main(String[] args) {
        double commissionAmount = 500.0;
        double totalSaleAmount = 10000.0;
        double commissionPercentage = 0.0;

        // Calculate commission percentage
        commissionPercentage = calculateCommissionPercentage(commissionAmount, totalSaleAmount);
        System.out.println("Commission Percentage: " + commissionPercentage + "%");

        // Calculate commission amount
        double calculatedCommissionAmount = calculateCommissionAmount(totalSaleAmount, commissionPercentage);
        System.out.println("Calculated Commission Amount: $" + calculatedCommissionAmount);

        // Calculate total sale amount
        double calculatedTotalSaleAmount = calculateTotalSaleAmount(commissionAmount, commissionPercentage);
        System.out.println("Calculated Total Sale Amount: $" + calculatedTotalSaleAmount);
    }
}
