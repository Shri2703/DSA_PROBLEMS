import java.util.Scanner;

public class FibonacciSeries{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numTerms = input.nextInt();

        int firstTerm = 0, secondTerm = 1;
        for (int i = 0 ; i < numTerms;i++){
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = firstTerm+secondTerm;
            secondTerm = nextTerm;
        }
    }
}