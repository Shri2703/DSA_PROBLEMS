

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

public class Basic{
    public static int factorial(int number){
        int ans = 1;
        for (int i = 1;i <= number;i++){
            ans = ans * i;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int number = sc.nextInt();
        int fact = factorial(number);
        System.out.println("The factorial of " + number+ " is " + fact);
    }
}