public class hw1_11 {
    public static void main(String[] args) {
        double count=312032486;
        double seconds=365*24*69*60;
        double born=seconds/7;
        double death=seconds/13;
        double in=seconds/45;
        for (int i = 1; i <+ 5; i++) {
            count=count+i*(born+in-death);
            int n=(int)count;
            System.out.println(i+"年后美国人口为"+n);
        }
        
    }
}
