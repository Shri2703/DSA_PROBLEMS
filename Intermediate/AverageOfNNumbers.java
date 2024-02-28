import java.util.Scanner;

public class AverageOfNNumbers{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the count of numbers (N): ");
        int count = input.nextInt();

        double sum = 0.0;
        double average;

        for(int i = 1; i <= count;i++){
            System.out.println("Enter the number"+ i+";");
            double num = input.nextDouble();
            sum += num;

        }
        average = sum /count;
        System.out.println("Average "+ count+"number are :"+average);
    }
}