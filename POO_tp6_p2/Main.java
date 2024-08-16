package POO_tp6_p2;

public class Main {
    public static void main(String[] args) {
        Figura Rectangulo = new Rectangulo("Rojo", new Punto(1, 1), "Rectángulo", 4, 6);
        Figura Cuadrado = new Cuadrado("Azul", new Punto(2, 2), "Cuadrado", 5);
        Figura Elipse = new Elipse("Verde", new Punto(3, 3), "Elipse", 7, 4);
        Figura Circulo = new Circulo("Amarillo", new Punto(4, 4), "Círculo", 3);

        Figura[] figuras = {Rectangulo, Cuadrado, Elipse, Circulo};

        for (Figura figura : figuras) {
            figura.setColor("Negro");
            figura.mover(10, 10);
            System.out.println(figura);
        }

        for (Figura figura : figuras) {
            System.out.println("Área de " + figura.getNombre() + ": " + figura.calcularArea());
        }
    }
}