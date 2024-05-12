
import java.util.Scanner;

public class hw5_25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        double sum=0;
        for (int j=1;j<=i;j++){
            sum+= Math.pow(-1,j+1)/(2*j-1);
        }
        System.out.println(4*sum);
    }
}
