package POO_tp6;
public class Main {
    public static void main(String[] args) {
        Punto puntoCentro = new Punto(0, 0);

        Rectangulo rectangulo = new Rectangulo("Rojo", puntoCentro, "Mi Rectangulo", 5, 10);
        Elipse elipse = new Elipse("Azul", puntoCentro, "Mi Elipse", 4, 2);
        Cuadrado cuadrado = new Cuadrado("Verde", puntoCentro, "Mi Cuadrado", 6);
        Circulo circulo = new Circulo("Amarillo", puntoCentro, "Mi Circulo", 3);

        Figura[] figuras = {rectangulo, elipse, cuadrado, circulo};

        for (Figura figura : figuras) {
            System.out.println(figura);
            System.out.println("Área: " + figura.calcularArea() + "\n");
        }

        String nuevoColor = "Negro";
        Punto nuevoCentro = new Punto(10, 10);

        for (Figura figura : figuras) {
            figura.setColor(nuevoColor);
            figura.setCentro(nuevoCentro);
            System.out.println(figura);
        }
    }
}
