import java.util.Scanner;

public class hw2_23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        double distance=sc.nextDouble();
        System.out.print("Enter miles per gallon: ");
        double mile=sc.nextDouble();
        System.out.print("Enter price per gallon: ");
        double price=sc.nextDouble();
        double cost=distance/mile*price;
        System.out.format("The cost of driving is $%.2f",cost);
    }
}
