import java.util.Scanner;

public class hw4_13 {
    public static void main(String[] args) {
        String vowel="aeiouAEIOU";
        String zimu="bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";
        System.out.println("Enter a letter:");
        Scanner sc=new Scanner(System.in);
        String letter=sc.next();
        boolean flag1=vowel.contains(letter);
        boolean flag2=zimu.contains(letter);
        if (flag1){
            System.out.format("%c is vowel",letter.charAt(0));
        } else if (flag2){
            System.out.format("%c is consonant",letter.charAt(0));
        } else {
            System.out.format("%c is an invalid input",letter.charAt(0));
        }
    }
}
