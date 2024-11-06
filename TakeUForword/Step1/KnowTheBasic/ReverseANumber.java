import java.util.Scanner;
public class ReverseANumber{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int revnum = 0;
        int dup = number;
        while(number > 0){
            int rev = number % 10;
            revnum = (revnum*10)+rev;
            number = number /10;
        }
        System.out.println(revnum);
        if (dup == revnum) System.out.println("its true");
        else System.out.println("False");
    }
}