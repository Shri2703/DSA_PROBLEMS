import java.util.Scanner;
public class EligibleVote{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        if(age>= 18){
            System.out.println("Eligible to vote");
        }else{
             System.out.println(" Not Eligible to vote");
        }
    }
}