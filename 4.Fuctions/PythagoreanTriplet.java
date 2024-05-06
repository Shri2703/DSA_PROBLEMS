import java.util.Scanner;

class PythagoreanTriplet {

    // Returns true if there is a Pythagorean triplet in ar[0..n-1]
    static boolean isTriplet(int ar[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    // Calculate square of array elements
                    int x = ar[i] * ar[i], y = ar[j] * ar[j], z = ar[k] * ar[k];

                    if (x == y + z || y == x + z || z == x + y)
                        return true;
                }
            }
        }

        // If we reach here, no triplet found
        return false;
    }

    // Driver program to test above function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int ar_size = scanner.nextInt();
        int ar[] = new int[ar_size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < ar_size; i++) {
            ar[i] = scanner.nextInt();
        }
        scanner.close();
        if (isTriplet(ar, ar_size))
            System.out.println("Yes, the array contains a Pythagorean triplet.");
        else
            System.out.println("No, the array does not contain a Pythagorean triplet.");
    }
}
