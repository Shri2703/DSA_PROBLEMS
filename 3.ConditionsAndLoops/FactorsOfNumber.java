import java.util.Scanner;

public class FactorsOfNumber{
    public static void main(Strings[] args){

        Scanner input = new Scanner(System.in);
        int number = input.Scanner;
        System.out.println("Factors of"+number+":");
        for(int i = 1;i <= number;i++){
            if(number % i ==0){
                System.out.print(i +" ");
            }
        }
        input.close();
    }
}