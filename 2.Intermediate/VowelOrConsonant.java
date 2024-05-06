import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check each character of the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (isLetter(ch)) {
                if (isVowel(ch)) {
                    System.out.println(ch + " is a vowel.");
                } else {
                    System.out.println(ch + " is a consonant.");
                }
            } else {
                System.out.println(ch + " is not a letter.");
            }
        }

        scanner.close();
    }

    // Method to check if a character is a vowel
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    // Method to check if a character is a letter
    public static boolean isLetter(char ch) {
        return Character.isLetter(ch);
    }
}
