package POO_tp9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear algunos productos
        Producto producto1 = new Producto("Laptop", 10, 2, 1500.0);
        Producto producto2 = new Producto("Mouse", 50, 5, 20.0);
        Producto producto3 = new Producto("Teclado", 30, 3, 45.0);

        // Crear un cliente
        Cliente cliente = new Cliente("Juan Pérez", "20-12345678-9", "juan.perez@email.com", "+5491112345678");

        // Crear líneas de compra
        LineaCompra linea1 = new LineaCompra(producto1, 1);
        LineaCompra linea2 = new LineaCompra(producto2, 2);

        // Crear una lista de líneas de compra
        List<LineaCompra> detalleCompra = new ArrayList<>();
        detalleCompra.add(linea1);
        detalleCompra.add(linea2);

        // Crear una compra
        Compra compra = new Compra(cliente, detalleCompra);

        // Crear un gestor de compras y registrar datos
        GestorCompras gestor = new GestorCompras();
        gestor.registrarCliente(cliente);
        gestor.registrarProducto(producto1);
        gestor.registrarProducto(producto2);
        gestor.registrarProducto(producto3);
        gestor.registrarCompra(compra);

        // Mostrar los productos registrados
        System.out.println("Productos registrados:");
        for (Producto p : gestor.consultarProductos()) {
            System.out.println("- " + p.getNombre() + " (Stock: " + p.getStock() + ", Precio: $" + p.getPrecio() + ")");
        }

        // Mostrar el total de la compra
        System.out.println("\nTotal de la compra realizada por " + cliente.getNombre() + ": $" + compra.getTotal());
    }
}

