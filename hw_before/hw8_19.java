import java.util.Scanner;

public class hw8_19 {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows and columns of the array:");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        int[][] values=new int[row][column];
        System.out.println("Enter the array:");
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                values[i][j]=sc.nextInt();
            }
        }
        System.out.println(isConsecutiveFour(values));
    }
    public static boolean heng(int[][] values){
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length-4; j++) {
                if (values[i][j]==values[i][j+1]&&values[i][j]==values[i][j+2]&&values[i][j]==values[i][j+3]&&values[i][j]==values[i][j+4]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean shu(int[][] values){
        //i当列，j当行
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length-4; j++) {
                if (values[j][i]==values[j+1][i]&&values[j][i]==values[j+2][i]&&values[j][i]==values[j+3][i]&&values[j][i]==values[j+4][i]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean youXiaXie(int[][] values){
        for (int i = 0; i < values.length-4; i++) {
            for (int j = 0; j < values[i].length-4; j++) {
                if (values[j][i]==values[j+1][i+1]&&values[j][i]==values[j+2][i+2]&&values[j][i]==values[j+3][i+3]&&values[j][i]==values[j+4][i+4]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean youShangXie(int[][] values){
        for (int i=4;i<values.length;i++){
            for (int j = 0; j < values[i].length-4; j++) {
                if (values[i][j]==values[i-1][j+1]&&values[i][j]==values[i-2][j+2]&&values[i][j]==values[i-3][j+3]&&values[i][j]==values[i-4][j+4]){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isConsecutiveFour(int[][] values){
        return heng(values)&&shu(values)&&youShangXie(values)&&youXiaXie(values);
    }
}
