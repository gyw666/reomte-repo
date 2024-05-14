package hw9;

public class hw9_9 {
    public static void main(String[] args) {
        RegularPolygon regularPolygon = new RegularPolygon();
        System.out.println(regularPolygon.getPerimeter());
    }

}
class RegularPolygon{
    private int n;
    private double side;
    private double x;
    private double y;
    private double perimeter;
    private double area;


    public RegularPolygon() {
        n=3;
        side=1;
        x=0;
        y=0;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    /**
     * 获取
     * @return n
     */
    public int getN() {
        return n;
    }

    /**
     * 设置
     * @param n
     */
    public void setN(int n) {
        this.n = n;
    }

    /**
     * 获取
     * @return side
     */
    public double getSide() {
        return side;
    }

    /**
     * 设置
     * @param side
     */
    public void setSide(double side) {
        this.side = side;
    }

    /**
     * 获取
     * @return x
     */
    public double getX() {
        return x;
    }

    /**
     * 设置
     * @param x
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * 获取
     * @return y
     */
    public double getY() {
        return y;
    }

    /**
     * 设置
     * @param y
     */
    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return n*side;
    }

    public double getArea(){
        return n*side*side/(4*Math.tan(Math.PI/n));
    }

    public String toString() {
        return "RegularPolygon{n = " + n + ", side = " + side + ", x = " + x + ", y = " + y + "}";
    }
}
