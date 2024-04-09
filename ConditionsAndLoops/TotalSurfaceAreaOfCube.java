import java.util.Scanner;
public class TotalSurfaceAreaOfCube{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double sideLength = input.nextDouble();
        double TotalSurfaceArea = 6 * Math.pow(sideLength, 2);
        System.out.println("TotalSurfaceAreaOfCube:" +TotalSurfaceArea);
        
    }
}