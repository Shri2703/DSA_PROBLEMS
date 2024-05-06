import java.util.Scanner;

public class SumOfNnumber{
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        
        System.out.println("Enter the number:");
        int number = input.nextInt();
        System.out.println(findSum(number));

    }
    public static int findSum(int number){
        int sum = 0;
        for(int i = 1;i <= number;i++){
            sum += i;
        }
        return sum;
    }
}