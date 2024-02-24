//To find Armstrong Number between two given number

import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int lower = input.nextInt();
        int upper = input.nextInt();
        System.out.println("Armstrong number between"+lower+"and"+upper+"are:");
        for(int i = lower;i <= upper;i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
    }import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lower = input.nextInt();
        int upper = input.nextInt();
        System.out.println("Armstrong numbers between " + lower + " and " + upper + " are:");
        for (int i = lower; i <= upper; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber, remainder, result = 0, n = 0;
        originalNumber = number;

        // Calculating the number of digits
        while (originalNumber != 0) {
            originalNumber /= 10;
            ++n;
        }

        originalNumber = number;

        // Finding the sum of digits raised to the power n
        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, n);
            originalNumber /= 10;
        }

        return result == number;
    }
}

}
public static boolean isArmstrong(int number){
    int orNu,rem,res = 0,n = 0;
    orNu = number;
    while (orNu !=0){
        orNu /= 10;
        ++n;
    }
    orNu = number;
    while (orNu !=0){
        rem = orNu % 10;
        res += Math.pow(rem,n);
        orNu /= 10;
    }
    return res == number;
}