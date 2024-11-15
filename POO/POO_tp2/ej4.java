package POO_tp2;

import java.util.Arrays;

public class ej4 {
        public static void main(String[] args) {
            int[] numeros = {4, 2, 3, 8, 1};
    
            imprimirInformacion(numeros);
        }
    
        public static void imprimirInformacion(int[] array) {
            System.out.println("Cantidad de números el array: " + array.length);
    
            int mayor = array[0];
            for (int num : array) {
                if (num > mayor) {
                    mayor = num;
                }
            }
            System.out.println("El mayor número en el array: " + mayor);
    
            double suma = 0;
            for (int num : array) {
                suma += num;
            }
            double promedio = suma / array.length;
            System.out.println("El promedio de los números en el array: " + promedio);
    
            Arrays.sort(array);
            System.out.println("Números ordenados de menor a mayor: " + Arrays.toString(array));
    
            int[] arrayInverso = Arrays.copyOf(array, array.length);
            for (int i = 0; i < arrayInverso.length / 2; i++) {
                int temp = arrayInverso[i];
                arrayInverso[i] = arrayInverso[arrayInverso.length - 1 - i];
                arrayInverso[arrayInverso.length - 1 - i] = temp;
            }
            System.out.println("Números ordenados de mayor a menor: " + Arrays.toString(arrayInverso));
        }
    }