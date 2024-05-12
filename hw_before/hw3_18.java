import java.util.Scanner;

public class hw3_18 {
    public static void main(String[] args) {
        System.out.println("请输入包裹重量");
        Scanner sc=new Scanner(System.in);
        double weight=sc.nextDouble();
        double money;
        if (weight>0&&weight<=1){
            money=weight*3.5;
            System.out.println(money);
        } else if (weight>1&&weight<=3){
            money=3.5+(weight-1)*5.5;
            System.out.println(money);
        } else if (weight>3&&weight<=10){
            money=3.5+2*5.5+(weight-3)*8.5;
            System.out.println(money);
        } else if (weight>10&&weight<=20){
            money=3.5+2*5.5+7*8.5+(weight-10)*10.5;
            System.out.println(money);
        } else {
            System.out.println("the package cannot be shipped");
        }
    }
}
