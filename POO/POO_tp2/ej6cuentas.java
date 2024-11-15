package POO_tp2;

public class ej6cuentas {
    private Integer numero;

    public ej6cuentas(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Long cuadrado() {
        return (long) numero * numero;
    }

    public boolean esPar() {
        return numero % 2 == 0;
    }

    public boolean esImpar() {
        return !esPar();
    }

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