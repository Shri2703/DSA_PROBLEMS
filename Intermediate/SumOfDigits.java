import java.util.Scanner;

public class SumOfDigits{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum  = calculateSumOfDigit(number);
        System.out.println("Sum of digits of " + number + " is: " + sum);
    }
    public static int calculateSumOfDigit(int number){
        int  sum = 0 ;
        while(number !=0){
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }
}