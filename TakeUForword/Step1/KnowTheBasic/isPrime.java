import java.util.Scanner;

public class isPrime{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = input.nextInt();
        boolean isPrimeNumber= isPrimeNum(num);

        // Print the result
        if (isPrimeNumber) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
    public static boolean isPrimeNum(int num){
        if(num <= 1){
           return false;
        }
        for (int i = 2; i <=  Math.sqrt(num);i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}