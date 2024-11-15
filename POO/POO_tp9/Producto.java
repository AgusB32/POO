package POO_tp9;

public class Producto {
    private String nombre;
    private int stock;
    private int stockMinimo;
    private double precio;

    public Producto(String nombre, int stock, int stockMinimo, double precio) {
        if (nombre == null || nombre.length() < 2)
            throw new IllegalArgumentException("El nombre debe tener al menos 2 caracteres.");
        if (stock < 0)
            throw new IllegalArgumentException("El stock debe ser >= 0.");
        if (stockMinimo < 0)
            throw new IllegalArgumentException("El stock mínimo debe ser >= 0.");
        if (precio < 0)
            throw new IllegalArgumentException("El precio debe ser positivo.");
        this.nombre = nombre;
        this.stock = stock;
        this.stockMinimo = stockMinimo;
        this.precio = precio;
    }

    public void actualizarStock(int cantidad) {
        if (cantidad <= 0 || stock - cantidad < 0)
            throw new IllegalArgumentException("Cantidad inválida o stock insuficiente.");
        this.stock -= cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public double getPrecio() {
        return precio;
    }
}
