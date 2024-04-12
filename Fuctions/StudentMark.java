import java.util.Scanner;

public class StudentMark{
    public static void main(String[] args){
        int count,i;
        Scanner input = new Scanner(System.in);
        float totalMarks = 0,percentage,average;
        System.out.println("Enter Number of Subject");
        count = input.nextInt();

        System.out.println("Enter Marks "+count+" Subject");
        for(i =0;i<count;i++){
            totalMarks +=input.nextInt();
        }
        System.out.println("Total MArks : " + totalMarks);
        percentage = (totalMarks /(count * 100)) *100;

       switch ((int) percentage / 10) {
        case 9:
            System.out.println("Grade : A+");
            break;
        case 8:
        case 7:
            System.out.println("Grade : A");
            break;
        case 6:
            System.out.println("Grade : B");
            break;
        case 5:
            System.out.println("Grade : C");
            break;
        default:
            System.out.println("Grade : D");
            break;
       }
    }
}