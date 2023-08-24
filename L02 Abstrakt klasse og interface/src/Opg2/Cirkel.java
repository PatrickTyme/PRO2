package Opg2;

public class Cirkel extends Figurer {
    private double radius;
    public Cirkel(String name, int x, int y, double radius) {
        super(name, x, y);
        this.radius = radius;
    }

    @Override
    public double area() {
        return (Math.PI * radius * radius);
    }

    @Override
    public String toString() {
        return super.toString() + " radius=" + radius;
    }
}
