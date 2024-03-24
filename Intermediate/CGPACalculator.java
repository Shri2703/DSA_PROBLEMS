import java.util.Scanner;

public class CGPACalculator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter total number of courses:");
        int totalCourses = input.nextInt();

        double totalCredits = 0;
        double totalGradePoints = 0;

        for(int i = 1;i<=totalCourses;i++){
            System.out.println("Enter details for Course " + i + ":");  
            System.out.print("Credit hours: ");
 
            double creditHours = input.nextDouble();
            System.out.print("Grate points:");
            double gradePoints = input.nextDouble();

            totalCredits += creditHours;
            totalGradePoints += (creditHours * gradePoints);
        }
        double cgpa = totalGradePoints / totalCredits;

        System.out.println("CGPA: " + cgpa);
        input.close();

    }
}
