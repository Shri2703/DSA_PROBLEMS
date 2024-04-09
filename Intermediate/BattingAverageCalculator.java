import java.util.Scanner;

public class BattingAverageCalculator{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Input total runs scored
        System.out.print("Enter total runs scored: ");
        int runsScored = scanner.nextInt();

        // Input total number of times dismissed (outs)
        System.out.print("Enter total number of times dismissed (outs): ");
        int timesDismissed = scanner.nextInt();

        // Calculate batting average
        double battingAverage = (double) runsScored / timesDismissed;

        // Print the batting average
        System.out.println("Batting average: " + battingAverage);

        scanner.close();
    }
}