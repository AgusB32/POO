package POO_tp6;
public class Rectangulo extends Figura {
    private double ladoMenor;
    private double ladoMayor;

    public Rectangulo(String color, Punto centro, String nombre, double ladoMenor, double ladoMayor) {
        super(color, centro, nombre);
        this.ladoMenor = ladoMenor;
        this.ladoMayor = ladoMayor;
    }

    @Override
    public String toString() {
        return super.toString() + ", Lado menor: " + ladoMenor + ", Lado mayor: " + ladoMayor;
    }

    @Override
    public double calcularArea() {
        return ladoMenor * ladoMayor;
    }

    public double calcularPerimetro() {
        return 2 * (ladoMenor + ladoMayor);
    }

    public void cambiarTamano(double factorEscala) {
        ladoMenor *= factorEscala;
        ladoMayor *= factorEscala;
    }

    public double getLadoMenor() {
        return ladoMenor;
    }

    public void setLadoMenor(double ladoMenor) {
        this.ladoMenor = ladoMenor;
    }

    public double getLadoMayor() {
        return ladoMayor;
    }

    public void setLadoMayor(double ladoMayor) {
        this.ladoMayor = ladoMayor;
    }
}
