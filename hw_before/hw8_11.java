import java.util.Scanner;

public class hw8_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number between 0 and 511:");
        int number=sc.nextInt();
        while (true){
            if(number<=511&&number>=0) {
                break;
            }else {
                number = sc.nextInt();
            }
        }
        int b=Integer.parseInt(Integer.toBinaryString(number));
        int[][] arr=new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=b%10;
                b/=10;
            }
        }
        for (int i = arr.length-1; i>=0; i--) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]==1){
                    System.out.print("T"+" ");
                }else {
                    System.out.print("H"+" ");
                }
            }
            System.out.println();
        }
    }
}
