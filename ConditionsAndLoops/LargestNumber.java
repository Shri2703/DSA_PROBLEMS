import java.util.Scanner;

public class LargestNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int largest = integer.MIN_VALUE;
        int number;

        System.out.println("Enter integers(0 to stop):");
        do{
            System.out.print("Enter a number:");
            number = input.nextInt();
            if(number !=0 && number > largest){
                largest = number;
            }
        }while(number !=0);
        if(largest != Integer.MIN_VALUE){
            System.out.println("Largest number entered:" + largest);
        }else{
            System.out.println("No numbers were entered.");
        }
     }
}