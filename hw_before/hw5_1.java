import java.util.Scanner;

public class hw5_1 {
    public static void main(String[] args) {
        int[] arr=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer,the input end if it is 0:");
        for (int i = 0; i < arr.length; i++) {
            int temp=sc.nextInt();
            if (temp==0){
                break;
            }else {
                arr[i]=temp;
            }
        }
        float sum=sum(arr);
        float aver=sum(arr)/count(arr);
        int zCount=zCount(arr);
        int fCount=fCount(arr);
        if (arr[0]==0){
            System.out.println("No numbers are entered except 0");
        } else {
            System.out.println("The number of positives is "+zCount);
            System.out.println("The number of negatives is "+fCount);
            System.out.println("The total is "+sum);
            System.out.println("The average is "+aver);
        }
    }
    public static float sum(int...arr){
        float sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    public static int count(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
                count++;
            }else {
                break;
            }
        }
        return count;
    }
    public static int zCount(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                count++;
            }
        }
        return count;
    }
    public static int fCount(int[] arr){
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<0){
                count++;
            }
        }
        return count;
    }
}
