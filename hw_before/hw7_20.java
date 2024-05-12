public class hw7_20 {
    public static void main(String[] args) {
        double[] number={1,2,3,4,5,11,22,0.5,2.6,99};
        for (int i = 0; i < number.length; i++) {
            int index=i;
            double min=number[i];
            for (int j=i;j<number.length;j++){
                if (min>number[j]){
                    min=number[j];
                    index=j;
                }
            }
            double temp=number[index];
            number[index]=number[i];
            number[i]=temp;
        }
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
    }
}
