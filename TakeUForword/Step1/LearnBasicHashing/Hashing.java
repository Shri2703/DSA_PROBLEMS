import java.util.Scanner;
public class Hashing{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int[] arr = new int[n];
    for(int i =0 ; i < n;i++){
        arr[i] = input.nextInt();
    }

    int[] hash = new int[13];
    for(int i = 0;i < n ;i++){
        hash[arr[i]] +=1;
    }
    int q = input.nextInt();
    while(q-- != 0){
        int number = input.nextInt();
        System.out.print(hash[number]);

    }
} 

}


