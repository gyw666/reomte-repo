import java.util.Scanner;

public class hw3_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = sc.nextInt();
        System.out.println("请输入月份");
        int month = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {  //闰年
            switch (month) {
                case 1:
                    System.out.format("January %d has 31 days", year);
                    break;
                case 2:
                    System.out.format("February %d has 29 days", year);
                    break;
                case 3:
                    System.out.format("March %d has 31 days", year);
                    break;
                case 4:
                    System.out.format("April %d has 30 days", year);
                    break;
                case 5:
                    System.out.format("May %d has 31 days", year);
                    break;
                case 6:
                    System.out.format("June %d has 30 days", year);
                    break;
                case 7:
                    System.out.format("July %d has 31 days", year);
                    break;
                case 8:
                    System.out.format("August %d has 31 days", year);
                    break;
                case 9:
                    System.out.format("September %d has 30 days", year);
                    break;
                case 10:
                    System.out.format("October %d has 31 days", year);
                    break;
                case 11:
                    System.out.format("November %d has 30 days", year);
                    break;
                case 12:
                    System.out.format("December %d has 31 days", year);
                    break;
            }
        } else {
            switch (month) {
                case 1:
                    System.out.format("January %d has 31 days", year);
                    break;
                case 2:
                    System.out.format("February %d has 29 days", year);
                    break;
                case 3:
                    System.out.format("March %d has 31 days", year);
                    break;
                case 4:
                    System.out.format("April %d has 30 days", year);
                    break;
                case 5:
                    System.out.format("May %d has 31 days", year);
                    break;
                case 6:
                    System.out.format("June %d has 30 days", year);
                    break;
                case 7:
                    System.out.format("July %d has 31 days", year);
                    break;
                case 8:
                    System.out.format("August %d has 31 days", year);
                    break;
                case 9:
                    System.out.format("September %d has 30 days", year);
                    break;
                case 10:
                    System.out.format("October %d has 31 days", year);
                    break;
                case 11:
                    System.out.format("November %d has 30 days", year);
                    break;
                case 12:
                    System.out.format("December %d has 31 days", year);
                    break;
            }
        }
    }
}