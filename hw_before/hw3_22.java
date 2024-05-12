import java.util.Scanner;

public class hw3_22 {
    public static void main(String[] args) {
        double x,y,length;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a point with two coordinates:");
        x=sc.nextDouble();
        y=sc.nextDouble();
        length=Math.pow((x*x+y*y),0.5);
        if (length<=10){
            System.out.format("Point (%.1f,%.1f) is in the circle",x,y);
        } else {
            System.out.format("Point (%.1f,%.1f) is not in the circle",x,y);
        }

    }
}
