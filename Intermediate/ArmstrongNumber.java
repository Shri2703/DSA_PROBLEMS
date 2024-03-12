import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number to check
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate the number of digits
        int originalNumber = number;
        int numberOfDigits = 0;
        while (originalNumber != 0) {
            originalNumber /= 10;
            numberOfDigits++;
        }

        // Calculate the sum of digits raised to the power of the number of digits 
        int sum = 0; 
        originalNumber = number;
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += Math.pow(digit, numberOfDigits);
            originalNumber /= 10;
        }

        // Check if the number is an Armstrong number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scanner.close();
    }
}
