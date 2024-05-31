package POO_tp6;
public class Elipse extends Figura {
    private double radioMayor;
    private double radioMenor;

    public Elipse(String color, Punto centro, String nombre, double radioMayor, double radioMenor) {
        super(color, centro, nombre);
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Radio mayor: " + radioMayor + ", Radio menor: " + radioMenor;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radioMayor * radioMenor;
    }

    public void cambiarTamano(double factorEscala) {
        radioMayor *= factorEscala;
        radioMenor *= factorEscala;
    }

    public double getRadioMayor() {
        return radioMayor;
    }

    public void setRadioMayor(double radioMayor) {
        this.radioMayor = radioMayor;
    }

    public double getRadioMenor() {
        return radioMenor;
    }

    public void setRadioMenor(double radioMenor) {
        this.radioMenor = radioMenor;
    }
}
