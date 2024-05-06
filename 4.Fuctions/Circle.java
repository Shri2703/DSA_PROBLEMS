import java.util.Scanner;

public class Circle{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Radius of Circle:");
        int radius = input.nextInt();
        double Area = Math.PI*(radius*radius);
        System.out.printf("Area is: %.2f", Area);

        double Cirumference = Math.PI*2*radius;
        System.out.printf("\nCirumference is:%.2f",Cirumference);

    }
}