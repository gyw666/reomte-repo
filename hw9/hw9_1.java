package hw9;

public class hw9_1{
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle();
        System.out.println(rectangle.getArea());
    }


}
class Rectangle{
    private double width;
    private double height;
    private double area;
    private double perimeter;


    public Rectangle() {
        width=1;
        height=1;
    }



    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, double area) {
        this.width = width;
        this.height = height;
        this.area = area;
    }

    public Rectangle(double width, double height, double area, double perimeter) {
        this.width = width;
        this.height = height;
        this.area = area;
        this.perimeter = perimeter;
    }

    /**
     * 获取
     * @return width
     */
    public double getWidth() {
        return width;
    }

    /**
     * 设置
     * @param width
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * 获取
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * 设置
     * @param height
     */
    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return "Rectangle{width = " + width + ", height = " + height + "}";
    }


    public double getArea() {
        return width*height;
    }

    /**
     * 设置
     * @param area
     */


    /**
     * 获取
     * @return perimeter
     */
    public double getPerimeter() {
        return (width+height)*2;
    }


}
