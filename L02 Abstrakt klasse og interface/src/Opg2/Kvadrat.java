package Opg2;

public class Kvadrat extends Figurer {
    int sidelængde;
    public Kvadrat(String name, int x, int y, int sidelængde) {
        super(name, x, y);
        this.sidelængde = sidelængde;
    }
    @Override
    public double area() {
        return sidelængde * sidelængde;
    }


    @Override
    public String toString() {
        return super.toString() + " sidelængde=" + sidelængde;
    }
}
