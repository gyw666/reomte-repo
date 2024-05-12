import java.util.Scanner;

public class hw6_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        displayPattern(sc.nextInt());
    }

    public static void displayPattern(int number) {
        for (int i = 1; i <= number; i++) {   //控制行数  一共有7行
            //i为行数
            //打印空格
            for (int z = 2 * (number - i); z > 0; z--) {
                System.out.print(" ");
            }
            //打印左边
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");

            }
            System.out.println();
        }
    }
}




