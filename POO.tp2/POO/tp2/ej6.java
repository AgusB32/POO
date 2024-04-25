package POO.tp2;

public class ej6 {
    private Integer numero;

    // Constructor de la clase Enteros
    public ej6(Integer numero) {
        this.numero = numero;
    }

    // Método para obtener el número
    public Integer getNumero() {
        return numero;
    }

    // Método para establecer el número
    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    // Calcula el cuadrado del número
    public Long cuadrado() {
        return (long) numero * numero;
    }

    // Verifica si el número es par
    public boolean esPar() {
        return numero % 2 == 0;
    }

    // Verifica si el número es impar
    public boolean esImpar() {
        return !esPar();
    }

    // Calcula el factorial del número
    public Long factorial() {
        if (numero < 0) {
            throw new IllegalArgumentException("El factorial no está definido para números negativos.");
        }
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Verifica si el número es primo
    public boolean esPrimo() {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}