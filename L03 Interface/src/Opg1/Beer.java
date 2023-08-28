package Opg1;

public class Beer implements Measurable {
    private String navn;
    private double alkoholProcent;

    public Beer(String navn, double alkoholProcent) {
        this.navn = navn;
        this.alkoholProcent = alkoholProcent;
    }

    public double getMeasure() {
        return alkoholProcent;
    }

    public String getNavn() {
        return navn;
    }

    public double getAlkoholProcent() {
        return alkoholProcent;
    }


}
