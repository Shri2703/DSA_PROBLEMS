import java.util.Scanner;
public class PerfectNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        if(isPerfectNumber(number)){
            System.out.println(number + " is a perfect number.");
        }else{
             System.out.println(number + " is not a perfect number.");
        }

    }
    public static boolean isPerfectNumber(int number){
        if(number <= 1){
            return false;
        }
        int sum = 1;
        for(int i = 2;i*i <= number;i++){
            if(number % i ==0){
                sum +=i;
                if( i * i != number){
                    sum +=number /i;
                }
            }
        }
          return sum == number;
    }
}