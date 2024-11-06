import java.util.Scanner;

public class ForLoop{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Iterations");
        int num = input.nextInt();
        // basic for loop
        for (int i =1; i <= num ;i++){
            System.out.println("The " + i +" Iteration");
        }
        //2d loop
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
                // Nested loop code
            }
        }
    }
}



import java.util.Scanner;

public class ForLoop{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Iterations");
        int num = input.nextInt();
        // basic for loop
        for (int i =1; i <= num ;i++){
            System.out.println("The " + i +" Iteration");
        }
        //2d loop
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
                // Nested loop code
            }
        }
    }
}