import java.util.Scanner;
public class HCF{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        int hcf = calculateHCF(num1,num2);
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);

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