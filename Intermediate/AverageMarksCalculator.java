import java.util.Scanner;

public class AverageMarksCalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int numofSubjects = input.nextInt();

        int totalMarks = 0;
        for(int i = 1;i<= numofSubjects;i++){
            System.out.print("Enter marks for Subject " + i + ": ");
            int marks = input.nextInt();
            totalMarks +=marks
        }
        double averageMarks = (double)  totalMarks / numofSubjects;
        System.out.println("Average marks: " + averageMarks);

       input.close();
    }
}