import java.util.Scanner;

public class ElectricityBillCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        final double RATE_1 = 5.0; // Rate for first 100 units
        final double RATE_2 = 7.0; // Rate for next 200 units
        final double RATE_3 = 9.0; // Rate for units above 300
        final double MIN_CHARGE = 50.0; // Minimum charge

        System.out.println("Enter the unit comsumed:");
        int unitConsumed = input.nextInt();

        double billamount = 0.0;

        if(unitConsumed  <=100){
            billamount = unitConsumed* RATE_1;
        }else if(unitConsumed <=300){
            billamount = 100* RATE_1 + (unitConsumed - 100)*RATE_2;
        }else{
            billamount = 100*RATE_1 + 200*RATE_2 + (unitConsumed-300) *RATE_3;
        }

        billamount = Math.max(billamount,MIN_CHARGE);
        System.out.println("Electricity bill amount: $" + billamount);
        input.close();

    }
}

