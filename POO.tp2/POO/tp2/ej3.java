package POO.tp2;

import java.util.Scanner;

public class ej3 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la palabra");
        String palabra = scanner.nextLine();
        palabra = palabra.toLowerCase().replaceAll("//s+","");
        String reverso = new StringBuilder(palabra).reverse().toString();
        if (palabra.equals(reverso)) {
            System.out.println("La palabra '" + palabra + "' es un palìndromo. ");
        }
        else {
            System.out.println("La palabra '"+ palabra + "' No es un palìndromo. ");
        }
        scanner.close();
    }
}
