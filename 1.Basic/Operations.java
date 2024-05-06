import java.util.Scanner;

public class Operations{}
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1 = input.nextFloat();
        float num2 = input.nextFloat();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = input.next().charAt(0); // Fixed line
        double result = 0;

        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error! Division by zero is not allowed.");
                return;
            }
        } else {
            System.out.println("Error! Invalid operator.");
            return;
        }
        System.out.println("Result: " + result);
    }
}
