import java.util.Scanner;

public class hw8_13 {
    public static void main(String[] args) {
        int p1=0;
        int p2=0;
        System.out.println("Enter the number of rows and columns of the array:");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        double[][] arr=new double[row][column];
        System.out.println("Enter the array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        double max=arr[p1][p2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max<arr[i][j]){
                    max=arr[i][j];
                    p1=i;
                    p2=j;
                }
            }
        }
        System.out.format("The location of the largest element is at (%d,%d)\n",p1,p2);
    }
}
