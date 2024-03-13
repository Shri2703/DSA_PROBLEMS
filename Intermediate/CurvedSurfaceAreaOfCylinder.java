import java.util.Scanner;

public class CurvedSurfaceAreaOfCylinder{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double height = input.nextDouble();
        double CurvedSurfaceArea = 2 * Math.PI * radius *height;
        System.out.println("Curved Surface Area Of Cylinder:" + CurvedSurfaceArea);
        input.close();
    }
}