import java.util.Scanner;
public class Hashing{
//     public static void main(String[] args){
//     Scanner input = new Scanner(System.in);
//     int n = input.nextInt();
//     int[] arr = new int[n];
//     for(int i =0 ; i < n;i++){
//         arr[i] = input.nextInt();
//     }

//     int[] hash = new int[13];
//     for(int i = 0;i < n ;i++){
//         hash[arr[i]] +=1;
//     }
//     int q = input.nextInt();
//     while(q-- != 0){
//         int number = input.nextInt();
//         System.out.print(hash[number ]);

//     }
// } 


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String word = input.next();
        int[] hash = new int[26];
        for(int i = 0; i < word.length();i++){
            hash[word.charAt(i) - 'a']++;
        }
        int q = input.nextInt();
        while(q-- != 0){
            char word2 = input.next().charAt(0);
            System.out.print(hash[word2 - 'a']);
        }
    }


}


