package Opg2;

public class Rektangel extends Figurer {
    private int s1;
    private int s2;
    public Rektangel(String name, int x, int y, int s1, int s2) {
        super(name, x, y);
        this.s1 = s1;
        this.s2 = s2;
    }

    @Override
    public double area() {
        return s1 * s2;
    }

    @Override
    public String toString() {
        return super.toString() + " s1=" + s1 + " s2=" + s2;
    }
}
