//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class LargestNumber{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(num1 > num2){
            System.out.println(num1+" Number 1 is Greater");
        }
        else{
            System.out.println(num2+" Number 2 is greater");
        }
    }
}