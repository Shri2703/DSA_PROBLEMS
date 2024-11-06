import java.util.Scanner;

public class inputOutput{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = input.nextLine();
        System.out.println("Hello " + name + " welcome....");
        System.out.println("Enter you Age:");
        int age = input.nextInt();
        System.out.println("You are " + age + " years old");

    }
}