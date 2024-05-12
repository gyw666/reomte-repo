import java.util.Scanner;

public class hw3_1 {
    public static void main(String[] args) {
        double a,b,c,temp1,x1,x2;
        System.out.println("Enter a,b,c:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        temp1=b*b-4*a*c;
        if (temp1<0){
            System.out.println("The equation has no real roots");
        } else if(temp1==0){
            x1=-b/2*a;
            System.out.format("The equation has one root %f",x1);
        } else {
            temp1=Math.pow(temp1,0.5);
            x1=(-b+temp1)/2*a;
            x2=(-b-temp1)/2*a;
            System.out.format("The equation has two roots %f and %f",x1,x2);
        }


    }
}
