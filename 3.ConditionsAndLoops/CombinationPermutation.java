import java.util.Scanner;

public class CombinationPermutation {
    // Method to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    // Method to calculate nCr (combinations)
    public static long nCr(int n, int r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    // Method to calculate nPr (permutations)
    public static long nPr(int n, int r) {
        return factorial(n) / factorial(n - r);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input values of n and r
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of r: ");
        int r = scanner.nextInt();

        // Calculate and print nCr and nPr
        System.out.println("nCr (Combinations): " + nCr(n, r));
        System.out.println("nPr (Permutations): " + nPr(n, r));

        scanner.close();
    }
}
