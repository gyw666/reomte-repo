public class hw5_7 {
    public static void main(String[] args) {
        float money=10000;
        float money_10=10000;
        for (int i = 0; i < 10; i++) {
            money_10*=1.05;
        }
        System.out.println("十年后的学费为："+money_10);
        float sum=0;
        for (int i = 0; i < 4; i++) {
            sum+=money_10;
            money_10*=1.05;
        }
        System.out.println("四年内总学费为:"+sum);
    }
}
