import java.util.Scanner;

public class Factorial{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i,fact =1;
        fact = FactorialNum(num);
        System.out.println("Factorial of" + num +"is :" + fact);  
    }
    public static int FactorialNum(int num){
        if(num ==0){
            return 1;
        }else{
            return (num*FactorialNum(num -1));
        }
    }
}