import java.util.Scanner;

public class hw2_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1, y1, x2, y2, x3, y3;
        System.out.print("Enter three points for a triangle:");
        x1=sc.nextDouble();
        y1=sc.nextDouble();
        x2=sc.nextDouble();
        y2=sc.nextDouble();
        x3=sc.nextDouble();
        y3=sc.nextDouble();

        double temp1 = x1 - x2;
        double temp2 = y1 - y2;

        temp1 = Math.pow(temp1, 2);

        temp2 = Math.pow(temp2, 2);
        double a = Math.pow(temp1 + temp2, 0.5);
        temp1 = x1 - x3;
        temp2 = y1 - y3;
        temp1 = Math.pow(temp1, 2);
        temp2 = Math.pow(temp2, 2);
        double b = Math.pow(temp1 + temp2, 0.5);
        temp1 = x2 - x3;
        temp2 = y2 - y3;
        temp1 = Math.pow(temp1, 2);
        temp2 = Math.pow(temp2, 2);
        double c = Math.pow(temp1 + temp2, 0.5);
        double s = (a + b + c)/2;
        double area = Math.pow(s * (s - a) * (s - b) * (s - c), 0.5);
        System.out.format("The area of the triangle is %.1f",area);
    }
}
