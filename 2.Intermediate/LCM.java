import java.util.Scanner;

public class LCM{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int lcm = calculatelLCM(num1,num2);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }
    public static int calculatelLCM(int a, int b){
        int hcf = calculateHCF(a,b);
      
        return(a*b)/hcf;
    }
    public static int calculateHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}