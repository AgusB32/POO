package POO_tp6_p2;

public abstract class Figura {
    private String color;
    private Punto centro;
    private String nombre;

    public Figura(String color, Punto centro, String nombre) {
        this.color = color;
        this.centro = centro;
        this.nombre = nombre;
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

    public String getNombre() {
        return nombre;
    }

    public void mover(int nuevoX, int nuevoY) {
        centro.setX(nuevoX);
        centro.setY(nuevoY);
    }

    @Override
    public String toString() {
        return "Figura: " + nombre + ", Color: " + color + ", Centro: " + centro.toString();
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}