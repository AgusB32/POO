package POO.tp2;

import java.util.Scanner;

public class ej2 {
            public static void main(String[] args) {
            Scanner scanner = new Scanner (System.in);
            char continuar = 's';

        do{
            System.out.println("ingrese el primer nùmero");
            double num1 = scanner.nextDouble();

            System.out.println("Ingrese el segundo Nùmero");
            double num2 = scanner.nextDouble();

            System.out.println("Ingrese el segundo nùmero");
            double num3 = scanner.nextDouble();

            if (num1>0) {
                double producto = num2 * num3;
                System.out.println("El producto de los dos ùltimos nùmeros es: " + producto);
            }
                else {
                    double suma = num2 + num3;
                    System.out.println("La suma de los dos ùltimos nùmeros es: " + suma);
                }
            System.out.println("¿Desea realizar otra operaciòn? (s/n) ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');     
        {
            scanner.close();
        }
        
    }

}