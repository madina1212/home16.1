public class Circle extends Shapes{
private double PI= 3.14;
private int n;

    public Circle(double PI, int n) {
        this.PI= PI;
        this.n = n;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        this.PI = PI;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "PI=" + PI +
                ", n=" + n +
                '}';
    }

    @Override
    public void findArea() {
        System.out.println(Math.PI*(n*n));
    }
}
