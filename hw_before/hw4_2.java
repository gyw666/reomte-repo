import java.util.Scanner;

public class hw4_2 {
    public static void main(String[] args) {
        System.out.println("Enter point(latitude and longitude) in degrees");
        double x1,y1,x2,y2;
        Scanner sc=new Scanner(System.in);
        x1=sc.nextDouble();
        y1=sc.nextDouble();
        System.out.println("Enter point(latitude and longitude) in degrees");
        x2=sc.nextDouble();
        y2=sc.nextDouble();
        double r=6371.01;
        x1=Math.toRadians(x1);
        x2=Math.toRadians(x2);
        y1=Math.toRadians(y1);
        y2=Math.toRadians(y2);
        double d=r*Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
        System.out.format("The distance between the two points is %f km",d);
    }
}
