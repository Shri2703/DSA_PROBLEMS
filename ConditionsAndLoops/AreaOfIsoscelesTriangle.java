import java.util.Scanner;

public class AOI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the base:");
        double base = input.nextDouble(); 
        System.out.println("Enter the height:");
        double height = input.nextDouble();

        double area = 0.5 * (base * height);
        System.out.println("Area of the isosceles triangle: " + area);
    }
}
