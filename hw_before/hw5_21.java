import java.util.Scanner;

public class hw5_21 {
    public static void main(String[] args) {
        double r = 1.05;
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        int year = sc.nextInt();
        for (int i = 0; i < 8; i++) {
            r = r + 0.00125 * i;
            for (int i1 = 0; i1 < year; i1++) {
                money *= r;
            }
            double month_money = money / (year * 12);
            System.out.print(((r-1)*100)/100 + "      " + month_money + "        " + money);
            System.out.println();
        }
    }
}
