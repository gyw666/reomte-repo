import java.util.Scanner;

public class hw4_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ed = sc.next();
        switch (ed.charAt(0)) {
            case 'M':
                switch (ed.charAt(1)) {
                    case '1':
                        System.out.println("Mathematics Freshman");
                        break;
                    case '2':
                        System.out.println("Mathematics Sophomore");
                        break;
                    case '3':
                        System.out.println("Mathematics Junior");
                        break;
                    case '4':
                        System.out.println("Mathematics Senior");
                        break;
                }
                break;
            case 'C':
                switch (ed.charAt(1)) {
                    case '1':
                        System.out.println("Computer Science Freshman");
                        break;
                    case '2':
                        System.out.println("Computer Science Sophomore");
                        break;
                    case '3':
                        System.out.println("Computer Science Junior");
                        break;
                    case '4':
                        System.out.println("Computer Science Senior");
                        break;
                }
                break;
            case 'I':
                switch (ed.charAt(1)) {
                    case '1':
                        System.out.println("Information Technology Freshman");
                        break;
                    case '2':
                        System.out.println("Information Technology Sophomore");
                        break;
                    case '3':
                        System.out.println("Information Technology Junior");
                        break;
                    case '4':
                        System.out.println("Information Technology Senior");
                        break;
                }
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
