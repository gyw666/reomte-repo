import java.util.Scanner;

public class hw7_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number fof students:");
        int n=sc.nextInt();
        int[] stu=new int[n];
        System.out.println("Enter 4 scores:");
        for (int i = 0; i < stu.length; i++) {
            stu[i]=sc.nextInt();
        }
        char[] score=new char[n];
        int best=max(stu);
        for (int i = 0; i < score.length; i++) {
            if (stu[i]>=best-10){
                score[i]='A';
            }else if (stu[i]>=best-20){
                score[i]='B';
            }else if (stu[i]>=best-30){
                score[i]='C';
            }else if (stu[i]>=best-40){
                score[i]='D';
            }else {
                score[i]='F';
            }
        }
        for (int i = 0; i < stu.length; i++) {
            System.out.format("Student %d score is %d and grade is %c\n",i,stu[i],score[i]);
        }
     }
     public static int max(int... score){
        int max=score[0];
         for (int i = 1; i < score.length; i++) {
             if (max<score[i]){
                 max=score[i];
             }
         }
         return max;
     }
}
