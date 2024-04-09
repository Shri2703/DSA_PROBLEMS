//To find out whether the given String is Palindrome or not
import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String word =input.nextLine();
        if(isPanlindrome(word)){
            System.out.println(word+"is is Palindrome");
        }else{
            System.out.println(word+ "is not a palindrome ");
        }
    }
    public static boolean isPanlindrome(String word){
        word = word.toLowerCase();
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false; // If characters at symmetric positions don't match, it's not a palindrome
            }
        }
        return true;
    }
}