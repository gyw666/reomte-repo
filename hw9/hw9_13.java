package hw9;

import java.util.Scanner;

public class hw9_13 {
    public static void main(String[] args) {
        int row;
        int column;
        System.out.println("Enter the number of rows and column in the array ");
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        column = sc.nextInt();
        double [][] arr = new double [row][column];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextDouble();
            }
        }
        Location location=locationLargest(arr);
        System.out.println(location);
    }

    public static Location locationLargest(double[][] a){
        Location loc = new Location();
        int row=0;
        int column=0;
        double max=a[0][0];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (max<a[i][j]){
                    max=a[i][j];
                    row=i;
                    column=j;
                }
            }
        }
        loc.setRow(row);
        loc.setColumn(column);
        loc.setMaxValue(max);
        return loc;
    }

}
class Location{
    private int row;
    private int column;
    private double maxValue;

    public Location() {
    }

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    /**
     * 获取
     * @return row
     */
    public int getRow() {
        return row;
    }

    /**
     * 设置
     * @param row
     */
    public void setRow(int row) {
        this.row = row;
    }

    /**
     * 获取
     * @return column
     */
    public int getColumn() {
        return column;
    }

    /**
     * 设置
     * @param column
     */
    public void setColumn(int column) {
        this.column = column;
    }

    /**
     * 获取
     * @return maxValue
     */
    public double getMaxValue() {
        return maxValue;
    }

    /**
     * 设置
     * @param maxValue
     */
    public void setMaxValue(double maxValue) {
        this.maxValue = maxValue;
    }

    public String toString() {
        return "The location of eht largest element is " + maxValue +" at ("+row+","+column+")";
    }
}
