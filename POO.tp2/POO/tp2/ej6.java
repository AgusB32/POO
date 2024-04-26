package POO.tp2; 

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero:");
        int num = scanner.nextInt();

        ej6cuentas e = new ej6cuentas(num);

        System.out.println("El número ingresado es: " + e.getNumero());

        System.out.println("El cuadrado de " + e.getNumero() + " es: " + e.cuadrado());

        if (e.esPar()) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        System.out.println("El factorial de " + e.getNumero() + " es: " + e.factorial());

        if (e.esPrimo()) {
            System.out.println("El número es primo");
        } else {
            System.out.println("El número no es primo");
        }

        scanner.close();
    }
}