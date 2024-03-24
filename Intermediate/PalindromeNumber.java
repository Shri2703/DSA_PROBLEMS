import java.util.Scanner;

public class PalindromeNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean isPalindrome = isPalindrome(number);
        if(isPalindrome){
            System.out.println(number +"is a palindrome number.");
        }else{
            System.out.println(number + "is a palindrome number.")
        }
    }
}

public static boolean isPalindrome(int number){
    int reversedNumber = 0;
    int originalNamuber = number;
    while(number != 0){
        int digit = number % 10;
        reversedNumber = reversedNumber * 10 + digit;
        number /= 10;
    }
    return originalNumber == reversedNumber;
}