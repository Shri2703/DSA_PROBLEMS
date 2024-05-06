import java.util.Scanner;
public class EvenOrOdd{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num % 2 ==0){
            System.out.println("its even number");
        }else{
            System.out.println("its odd number");
        }
    }
}