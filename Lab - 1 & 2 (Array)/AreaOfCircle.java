import java.util.Scanner;

public class AreaOfCircle {

    public static double areaOfCircle(double radius){
        return 3.14*radius*radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius : ");
        double radius = sc.nextDouble();
        double area = areaOfCircle(radius);
        System.out.printf("Area of circle is "+area);
    }
}
