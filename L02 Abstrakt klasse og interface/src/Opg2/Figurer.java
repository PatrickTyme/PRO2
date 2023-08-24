package Opg2;

public abstract class Figurer {
    private int x;
    private int y;
    private String name;

    public Figurer(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;

    }

    public abstract double area();

    @Override
    public String toString() {
        return "Figurer: " +
                "x=" + x +
                ", y=" + y +
                ", name='" + name + '\'';
    }

    public void parallelforskyd(int i, int j) {
        this.x += i;
        this.y += j;
    }

}
