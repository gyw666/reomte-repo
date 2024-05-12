import java.util.Scanner;

public class hw2_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the time zone to GMT:");
        long GMT=sc.nextLong();
        long totalTimeMillisSecond = System.currentTimeMillis();//总毫秒数
        //转化为秒数
        long totalTimeSecond = totalTimeMillisSecond / 1000;
        //获取现在的秒数
        long nowTimeSecond = totalTimeSecond % 60;
        //转化为分钟数
        long totalTimeMinute=totalTimeSecond/60;
        //获取现在的分钟数
        long nowTimeMinute=totalTimeMinute%60;
        //转化为小时数
        long totalTimeHour=totalTimeMinute/60+GMT;
        //获取现在的小时数
        long nowTimeHour=totalTimeHour%24;
        System.out.println("The current time is "+nowTimeHour+":"+nowTimeMinute+":"+nowTimeSecond);
    }
}
