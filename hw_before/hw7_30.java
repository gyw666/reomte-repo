import java.util.Scanner;

public class hw7_30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of values");
        int n=sc.nextInt();
        int[] number=new int[n];
        for (int i = 0; i < number.length; i++) {
            number[i]=sc.nextInt();
        }
        boolean flag=false;
        for (int i = 0; i < number.length-4; i++) {
            if (number[i]==number[i+1]&&number[i]==number[i+2]&&number[i]==number[i+3]&&number[i]==number[i+4]){
                flag=true;
                break;
            }
        }
        if (flag){
            System.out.println("The list has consecutive fours");
        }else {
            System.out.println("The list has no consecutive fours");
        }
    }
}
