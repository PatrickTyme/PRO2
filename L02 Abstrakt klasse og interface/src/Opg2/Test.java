package Opg2;

public class Test {
    public static void main(String[] args) {
        Figurer[] figurer = new Figurer[3];
        figurer[0] = new Cirkel("Cirkel", 10, 10, 5);
        figurer[1] = new Rektangel("Rektangel", 10, 10, 5, 10);
        figurer[2] = new Kvadrat("Kvadrat", 10, 10, 5);

        for (Figurer figur : figurer) {
            System.out.println(figur);
            System.out.println("Arealet er: " + figur.area());
        }

        for (Figurer figur : figurer) {
            figur.parallelforskyd(10, 10);
            System.out.println(figur);
            System.out.println("Arealet er: " + figur.area());
        }
    }
}
