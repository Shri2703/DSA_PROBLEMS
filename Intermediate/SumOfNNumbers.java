import java.util.Scanner;

public class SumOfNNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int sum = 0;

        System.out.println("enter" + N +"numbers:");
        for(int i =0; i<= N;i++){
            int num = input.nextInt();
            sum +=num;
        }
        System.out.println("sum of"+ N+"numbers is :"+sum);
        input.close();
    }
}