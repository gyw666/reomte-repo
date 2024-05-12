import java.util.Scanner;

public class hw2_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the monthly saving amount:");
        double money=sc.nextDouble();
        double sum=0;
        double rate_month=1.00417;
        for (int i = 0; i < 6; i++) {
            sum=(sum+money)*rate_month;
        }
        System.out.format("After the sixth month. the account value is $%.2f",sum);
    }
}
