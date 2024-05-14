package hw9;

public class hw9_10 {
    public static void main(String[] args) {
        QuadraticEquation q = new QuadraticEquation(1, 4, 1);
        System.out.println(q.getRoot2());
    }
}

class QuadraticEquation {
    int a, b, c;
    int discriminant;
    double root1, root2;

    public QuadraticEquation() {
    }

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.discriminant = this.b * this.b - 4 * a * c;
        if (this.discriminant >= 0) {
            this.root1 = (-b + Math.sqrt(discriminant)) / 2 * a;
            this.root2 = (-b - Math.sqrt(discriminant)) / 2 * a;
        } else {
            this.root1 = 0;
            this.root2 = 0;
        }

    }

    /**
     * 获取
     *
     * @return a
     */
    public int getA() {
        return a;
    }

    /**
     * 设置
     *
     * @param a
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * 获取
     *
     * @return b
     */
    public int getB() {
        return b;
    }

    /**
     * 设置
     *
     * @param b
     */
    public void setB(int b) {
        this.b = b;
    }

    /**
     * 获取
     *
     * @return c
     */
    public int getC() {
        return c;
    }

    /**
     * 设置
     *
     * @param c
     */
    public void setC(int c) {
        this.c = c;
    }

    /**
     * 获取
     *
     * @return discriminant
     */
    public int getDiscriminant() {
        return discriminant;
    }


    public void setRoot1() {
        this.root1 = (-b + Math.sqrt(discriminant)) / 2 * a;
    }

    public void setRoot2() {
        this.root2 = (-b - Math.sqrt(discriminant)) / 2 * a;
    }

    public double getRoot1() {
        return root1;
    }

    public double getRoot2() {
        return root2;

    }

    public String toString() {
        return "QuadraticEquation{a = " + a + ", b = " + b + ", c = " + c + ", discriminant = " + discriminant + "}";
    }
}
