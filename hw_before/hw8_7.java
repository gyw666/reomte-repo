public class hw8_7 {
    public static void main(String[] args) {
        double[][] points={{-1,0,3},{-1,-1,-1},{4,1,1},{2,0.5,9},{3.5,2,-1},{3,1.5,3},{-1.5,4,2},{5.5,4,-0.5}};
        int p1=0;
        int p2=0;
        double minDistance=distance(points[p1],points[p2]);
        for (int i = 0; i < 8; i++) {
            for (int j = i;  j< 8; j++) {
                if (minDistance<distance(points[i],points[j])){
                    p1=i;
                    p2=j;
                    minDistance=distance(points[i],points[j]);
                }
            }
        }
        System.out.println(p1);
        System.out.println(p2);
    }

    //传入两个点，也就是第二维数组
    public static double distance(double[] p1,double[] p2){
        double x=p1[0]-p2[0];
        double y=p1[1]-p2[1];
        double z=p1[2]-p2[2];
        return Math.sqrt(x*x+y*y+z*z);
    }
}
