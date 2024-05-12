public class hw6_26 {
    public static void main(String[] args) {
        for (int i = 2, j = 0; j < 100; i++) {
            if (isHui(i) && isSu(i)) {
                System.out.format("\t%d", i);
                j++;
                if (j % 10 == 0) {
                    System.out.println();
                }
            }


        }

    }

    public static boolean isSu(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isHui(int number) {
        int keep = number;
        int reverse = 0;
        while (number != 0) {
            int temp = number % 10;
            reverse = reverse * 10 + temp;
            number /= 10;
        }
        return keep == reverse;
    }
}
