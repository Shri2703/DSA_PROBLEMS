import java.util.Scanner;

public class NumberSums{
    public static void main(String[],args){
        Scanner input = new Scanner(System.in);
        int negativeSum = 0;
        int positiveEvenSum =0;
        int positiveOddSum = 0;
        System.out.println("Enter number (enter 0 to terminate):");
        while(true){
            int num = input.nextInt();

            if(num ==0){
                break;
            }else if(num < 0){
                negativeSum += num;
            }else if(num % 2 == 0){
                positiveEvenSum += num;
            }else{
                positiveOddSum += num;
            }
        }
         System.out.println("Sum of negative numbers: " + negativeSum);
        System.out.println("Sum of positive even numbers: " + positiveEvenSum);
        System.out.println("Sum of positive odd numbers: " + positiveOddSum);

    }
}