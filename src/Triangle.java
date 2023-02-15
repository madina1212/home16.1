public class Triangle extends Shapes{
    private int a;
    private int b;
    public Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public void findArea() {
        System.out.println(a*b/2);
    }
}
