import java.util.Scanner;

public class hw4_23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee's name:");
        String name=sc.next();
        System.out.println("Enter number of hours worked in a week:");
        double time=sc.nextDouble();
        System.out.println("Enter hourly pay rate:");
        double rate=sc.nextDouble();
        System.out.println("Enter federal tax withholding rate:");
        double t1=sc.nextDouble();
        System.out.println("Enter state tax withholding rate:");
        double t2=sc.nextDouble();
        double sum=time*rate;
        double r1=sum*t1;
        double r2=sum*t2;
        double total_r=r1+r2;
        double money=sum-total_r;
        System.out.format("Employee Name: %s\n",name);
        System.out.format("Hours Worked: %f\n",time);
        System.out.format("Pay Rate: %f\n",rate);
        System.out.format("Gross Pay: %f\n",sum);
        System.out.println("Deductions:");
        System.out.format("  Federal Withholding(20.0%%)\n：: $%f",r1);
        System.out.format("  State Withholding(20.0/n%%)\n：: $%f",r2);
        System.out.format("  Total Deduction: $%.2f\n",total_r);
        System.out.format("Net Pay: $%.2f\n",money);
    }
}
