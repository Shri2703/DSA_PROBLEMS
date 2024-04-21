import java.util.Scanner;

public class PalindromeNumber{
    public static boolean isPalindrome(int num){
        int reversedNum = reversedNumber(num);
        return num == reversedNum;
    }
    public static int reversedNumber(int num){
        int reversedNum =0;
        while(num !=0){
            int digit = num % 10;
            reversedNum = reversedNum * 10+digit;
            num /= 10;
        }
        return reversedNum;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt();
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}