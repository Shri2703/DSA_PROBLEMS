import java.util.Scanner;
public class VowelOrConsonant{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);
        if(isVowel(ch)){
            System.out.println(ch + "is a vowel");
        }else{
             System.out.println(ch + " is a consonant.");
        }
    }
}