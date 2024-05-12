import java.util.Scanner;

public class hw4_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请依次输入四个城市的经纬度");
        double distance1=distance(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        double distance2=distance(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        double distance3=distance(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        double distance4=distance(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        double distance5=distance(sc.nextDouble(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
        System.out.format("四个城市围起来的面积为%f",area(distance1,distance2,distance5)+area(distance3,distance4,distance5));


    }
    public static double distance(double x1,double y1,double x2,double y2){
        double r=6371.01;
        x1=Math.toRadians(x1);
        x2=Math.toRadians(x2);
        y1=Math.toRadians(y1);
        y2=Math.toRadians(y2);
        return r*Math.acos(Math.sin(x1)*Math.sin(x2)+Math.cos(x1)*Math.cos(x2)*Math.cos(y1-y2));
    }
    public static double area(double a,double b,double c){
        double s=(a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
}
