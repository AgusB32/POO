package POO_tp9;

public class LineaCompra {
    private Producto producto;
    private int cantidad;

    public LineaCompra(Producto producto, int cantidad) {
        if (producto == null || cantidad <= 0)
            throw new IllegalArgumentException("Producto inválido o cantidad inválida.");
        if (cantidad > producto.getStock())
            throw new IllegalArgumentException("Cantidad excede el stock disponible.");
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public double getSubTotal() {
        return cantidad * producto.getPrecio();
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }
}
