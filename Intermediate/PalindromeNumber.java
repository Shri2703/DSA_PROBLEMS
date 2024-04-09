import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is palindrome
        boolean isPalindrome = isPalindrome(number);

        // Print the result
        if (isPalindrome) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }

        scanner.close();
    }

    // Method to check if a number is palindrome
    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int originalNumber = number;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Check if the original number is equal to its reverse
        return originalNumber == reversedNumber;
    }
}
