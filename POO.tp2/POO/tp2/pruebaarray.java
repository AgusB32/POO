package POO.tp2; 

import java.util.Scanner;

public class pruebaarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir un número al usuario
        System.out.println("Ingrese un número entero:");
        int num = scanner.nextInt();

        // Crear un objeto Entero
        ej6 e = new ej6(num);

        // Mostrar el número ingresado
        System.out.println("El número ingresado es: " + e.getNumero());

        // Mostrar el cuadrado del número
        System.out.println("El cuadrado de " + e.getNumero() + " es: " + e.cuadrado());

        // Verificar si el número es par o impar
        if (e.esPar()) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        // Calcular y mostrar el factorial del número
        System.out.println("El factorial de " + e.getNumero() + " es: " + e.factorial());

        // Verificar si el número es primo
        if (e.esPrimo()) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número no es primo");
        }

        // Cerrar el escáner
        scanner.close();
    }
}