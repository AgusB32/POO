package POO_tp6;
public abstract class Figura {
    private String color;
    private Punto centro;
    private String nombre;

    public Figura(String color, Punto centro, String nombre) {
        this.color = color;
        this.centro = centro;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Color: " + color + ", Centro: " + centro;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Punto getCentro() {
        return centro;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public abstract double calcularArea();
}
