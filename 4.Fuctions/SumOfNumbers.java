import java.util.Scanner;

public class SumOfNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        SumOfNum(num1,num2);
    }
    public static void SumOfNum(int num1,int num2){
        int sum=0;
        sum = num1+num2;
        System.out.println("sum of two numbers : " + sum);
    }
}