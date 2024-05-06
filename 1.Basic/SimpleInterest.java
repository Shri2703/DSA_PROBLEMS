//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;
public class SimpleInterest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double principal = input.nextDouble();
        double time = input.nextDouble();
        double rate = input.nextDouble();
        double SimpleInterest= (principal*time*rate) /100;
        System.out.println(SimpleInterest);

 
    }
}