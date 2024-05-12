import java.util.Scanner;

public class hw6_18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if (isEight(s)&&isEM(s)&&isM2(s)){
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    public static boolean isEight(String s) {
        return s.length() >= 8;
    }

    public static boolean isEM(String s) {
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) < 'a' && s.charAt(i) > 'z') || (s.charAt(i) < '0' && s.charAt(i) > '9')) {
                return false;
            }
        }
        return true;
    }

    public static boolean isM2(String s){
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)>'0'&&s.charAt(i)<'9'){
                count++;
            }
        }
        return count>=2;
    }


}
