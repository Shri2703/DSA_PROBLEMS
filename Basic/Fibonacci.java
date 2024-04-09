//To calculate Fibonacci Series up to n numbers.

import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Fibonacci Series up to " + n + " terms:");
        int firstTerm = 0, secondTerm = 1;

        if (n >= 1) {
            System.out.print(firstTerm + " ");
        }
        if (n >= 2) {
            System.out.print(secondTerm + " ");
        }

        for (int i = 3; i <= n; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}