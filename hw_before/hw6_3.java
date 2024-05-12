import java.util.Scanner;

public class hw6_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.println(isPalindrome(number));

    }
    public static int reverse(int number){
        int reverse=0;
        while (number!=0){
            int temp=number%10;
            reverse=reverse*10+temp;
            number/=10;
        }
        return reverse;
    }

    public static boolean isPalindrome(int number){
        if (number==reverse(number)){
            return true;
        }else {
            return false;
        }
    }

}
