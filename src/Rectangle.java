public class Rectangle extends Shapes{
    private int d;
    private int i;


    public Rectangle(int d, int i) {
        this.d = d;
        this.i = i;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "d=" + d +
                ", i=" + i +
                '}';
    }

    @Override
    public void findArea() {
        System.out.println(d*i);
    }
}
