

// import java.util.Scanner;

// public class Basic {

//     static void func(String name, int i, int n) {

//         // Base Condition.
//         if (i > n) return;

//         // Print the user's name.
//         System.out.println(name+"eruma");

//         // Recursive function call.
//         func(name, i + 1, n);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your name:");
//         String name = sc.nextLine();

//         // Set the value of n to 4.
//         int n = 4;

//         // Call the function, passing the name, starting value for i, and n.
//         func(name, 1, n);

//         sc.close();
//     }
// }




// import java.util.Scanner;

// public class Basic {

//     static void func( int i, int number) {

//         // Base Condition.
//         if (i > number) return;

//         // Print the user's name.
//         System.out.println(i);

//         // Recursive function call.
//         func( i + 1, number);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your number:");
//         int number = sc.nextInt();

//         // Call the function, passing the name, starting value for i, and n.
//         func( 1,number);

//         sc.close();
//     }
// }
// 1
// 2
// 3
// 4
// 5
// 6
import java.util.Scanner;

// public class Basic {

//     static void func( int i, int number) {

//         // Base Condition.
//         if (i > number) return;

//         // Print the user's name.
//         System.out.println(i);

//         // Recursive function call.
//         func( i + 1, number);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your number:");
//         int number = sc.nextInt();

//         // Call the function, passing the name, starting value for i, and n.
//         func( 1,number);

//         sc.close();
//     }
// }

// public class Basic{
//     public static int factorial(int number){
//         int ans = 1;
//         for (int i = 1;i <= number;i++){
//             ans = ans * i;
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your number:");
//         int number = sc.nextInt();
//         int fact = factorial(number);
//         System.out.println("The factorial of " + number+ " is " + fact);
//     }
// }

// Enter your number:
// 5
// The factorial of 5 is 120

// public class Basic{
//     static void printarray(int ans[],int num){
//         System.out.print("Resver array is :");
//         for(int i =0; i< num; i++){
//             System.out.print(ans[i] + " ");
//         }

//     }
//     static void reversearray(int arr[],int num){
//         int ans[] = new int[num];
//         for(int i  = num -1;i>=0;i--){
//             ans[num-i-1] = arr[i];
//         }
//         printarray(ans,num);
//     }
//     public static void main(String [] args){
//         int[] arr ={2,4,6,8,10};
//         int num = 5;
//         reversearray(arr,num);
//     }
// }

//Resver array is :10 8 6 4 2

// public class Basic {
//     public static void main(String[] args) {
//         String str = "ABCBA"; // Change this to test other strings
//         String rev = new StringBuilder(str).reverse().toString();
        
//         System.out.println("Original String: " + str);
//         System.out.println("Reversed String: " + rev);
        
//         // Check if the string is a palindrome
//         if (str.equals(rev)) {
//             System.out.println("The string is a palindrome.");
//         } else {
//             System.out.println("The string is not a palindrome.");
//         }
//     }
// }
// Original String: ABCBA
// Reversed String: ABCBA
// The string is a palindrome


public class Basic{
    public static void main(String... args){
        int num = 8;
        if(num == 0) System.out.println(0);
        else{
            int fib[] = new int[num+1];
            fib[0] = 0;
            fib[1] = 1;
            for(int i = 2;i<num;i++){
                fib[i] = fib[i-1]+fib[i-2];
            }
            System.out.println("The Fibonacci Series up to "+num+"th term:");
            for(int i =0;i<= num;i++){
                System.out.print(fib[i] +" ");
            }
        }
    }
}
The Fibonacci Series up to 8th term:
0 1 1 2 3 5 8 13 0