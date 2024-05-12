import java.util.Scanner;

public class hw6_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(sumDigits(sc.nextLong()));
    }
    public static int sumDigits(long n){
        int sum=0;
        while (n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}
