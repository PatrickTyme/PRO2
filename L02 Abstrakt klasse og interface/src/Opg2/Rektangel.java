package Opg2;

public class Rektangel extends Figurer {
    private int s1;
    private int s2;
    public Rektangel(String name, int x, int y) {
        super(name, x, y);
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
