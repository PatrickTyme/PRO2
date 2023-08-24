package Opg2;

public class Ellipse extends Figurer {

    private int storakse;
    private int lilleakse;

    public Ellipse(String name, int x, int y) {
        super(name, x, y);
    }

    @Override
    public double area() {
        return (Math.PI * storakse * lilleakse);
    }

    @Override
    public String toString() {
        return super.toString() + " storakse=" + storakse + " lilleakse=" + lilleakse;
    }
}
