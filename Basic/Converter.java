//Input currency in rupees and output in USD
import java.util.Scanner;

public class Converter{
    public static void main(String[] args){
        //1 IND = 0.014USD
        double exchage = 0.014;
        Scanner input = new Scanner(System.in);
        double indamount = input.nextDouble();
        double indToUsd = indamount * exchage;
        System.out.println("the Usd AMount $:" + indToUsd);
    }
}