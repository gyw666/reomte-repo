import java.util.Scanner;

public class hw7_5 {
    public static void main(String[] args) {
        int[] number=new int[10];
        Scanner sc=new Scanner(System.in);
        int count=0;
        System.out.println("Enter ten numbers:");
        for (int i = 0; i < number.length; i++) {
            int temp=sc.nextInt();
            boolean flag=true;
            for (int j=0;j<i;j++){
                if (number[j]==temp){
                    flag=false;
                    break;
                }
            }
            if (flag){
                number[i]=temp;
                count++;
            }
        }
        System.out.println("The number of distinct number is "+count);
        System.out.print("THe distinct numbers are:");
        for (int i = 0; i < count; i++) {
            System.out.print(number[i]+" ");
        }
        System.out.println();
    }
}
