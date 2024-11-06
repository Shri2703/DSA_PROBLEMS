import java.util.Scanner;
public class WhileLoop{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = input.nextInt();
        int fact = 1;

        while(num >0){
            fact *= num;
            num--;
        }
        System.out.println("factorial of "+ num + "is :" +fact);
    }
}