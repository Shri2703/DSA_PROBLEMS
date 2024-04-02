import java.util.Scanner;


public class AdditionOfTwoNum{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        double number1 = input.nextDouble();
        System.out.println("Enter the Second Number:");
        double number2 = input.nextDouble();

        double Sum = number1 + number2;
        System.out.println("Sum is:" + Sum);
    }
}
