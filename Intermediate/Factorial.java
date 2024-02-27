import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter a non-negative integer
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        // Calculate the factorial of the input number
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        // Print the factorial
        System.out.println("Factorial of " + n + " is: " + factorial);

        scanner.close();
    }
}
