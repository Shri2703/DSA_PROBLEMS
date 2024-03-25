import java.util.Scanner;

public class FutureInvestmentValue{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double inverstmentAmount= input.nextDouble();
        double annualInterestRate= input.nextDouble();
        double monthlyInterestRate = annualInterestRate /100/12;
        int numberOfYears = input.nextInt();
        double futureValue = calculateFutureValue(investmentAmount, monthlyInterestRate, numberOfYears);
        System.out.println("Future Investment Value: $" + futureValue);
   }
   public static double calculateFutureValue(double investmentAmount, double monthlyInterestRate, int numberOfYears) {
        return investmentAmount * Math.pow(1 + monthlyInterestRate, numberOfYears * 12);
    }
}