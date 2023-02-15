public class Square extends Shapes{
    private int e;
    private int z;

    public Square(int e, int z) {
        this.e = e;
        this.z = z;
    }

    public int getE() {
        return e;
    }

    public void setE(int e) {
        this.e = e;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Square{" +
                "e=" + e +
                ", z=" + z +
                '}';
    }

    @Override
    public void findArea() {
        System.out.println(e*z);
    }
}
