import java.util.Scanner;

public class hw8_1 {
    public static void main(String[] args) {
        System.out.println("Enter a 3-by-4 matrix row by row");
        double[][] arr=new double[3][4];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.format("Sum of the elements at column %d is %f\n",i,sumColumn(arr,i));
        }
    }
    public static double sumColumn(double[][] m,int columnIndex){
        double sum=0;
        for (double v : m[columnIndex]) {
            sum+=v;
        }
        return sum;
    }
}
