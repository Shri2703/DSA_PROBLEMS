import java.util.Scanner;
public class Gcd{
    public static int FindGcd(int num1, int num2){
        int gcd = 0;
        for(int i = 1; i <= Math.min(num1,num2);i++){
            if(num1 % i == 0 && num2 % i == 0)
                gcd = i;
        }
        return gcd;
    }

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        int gcd = FindGcd(num1,num2);
        System.out.println("GCD of "+num1+ " and "+ num2+" is "+gcd);

    }
}