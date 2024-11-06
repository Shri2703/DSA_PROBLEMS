import java.util.Scanner;

public class CountDigits{
    public static int countDigit(int num){
        int count = 0;
        while(num > 0){
            count = count + 1;
            num = num/10;
        }
        return count;
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number for count:");
        int num = input.nextInt();
        int noc = countDigit(num);
        System.out.println("no of digit in input :" + noc);
    }
}