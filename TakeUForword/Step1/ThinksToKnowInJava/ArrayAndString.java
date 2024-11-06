import java.util.Scanner;

public class ArrayAndString{
    public static void main(String[] args){

        //arrays
        int[] arr = {10,20,30,40,50};
        System.out.println("Elements in the array are :");
        for (int i = 0;i < arr.length;i++){
            System.out.println(arr[i] +" ");
        }

        //strings
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name  =  input.nextLine();
        System.out.println("Hello " + name);
        System.out.println("count "+ name.length());
        System.out.println("index char "+ name.charAt(4));
        
    }
}