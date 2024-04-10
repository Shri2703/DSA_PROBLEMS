import java.util.Scanner;

public class ProductOfNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the Second number: ");
        int num2 = input.nextInt();
        ProductOfNum(num1,num2);
    }
    public static void ProductOfNum(int num1,int num2){
        int Product = 0;
        Product = num1*num2;
        System.out.println("Product of two numbers: "+Product);
    }
}