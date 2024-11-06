import java.util.Scanner;

public class ifElseStatement{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //if else 
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        if (age >= 18){
            System.out.println("your'e adult");
        }else{
            System.out.println("your'e not a adult");
        }
        //if else if 
        System.out.println("Enter your mark");
        int mark = input.nextInt();
        if (mark >= 90){
            System.out.println("A");
        }else if (mark >= 70 && mark <= 89 ){
            System.out.println("B");
        }else if (mark >= 50 && mark <= 79){
            System.out.println("C");
        }else if (mark >= 35 && mark <= 49){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}