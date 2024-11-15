package POO_tp9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class GestorCompras {
    private List<Cliente> clientes = new ArrayList<>();
    private List<Producto> productos = new ArrayList<>();
    private List<Compra> compras = new ArrayList<>();

    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void registrarProducto(Producto producto) {
        productos.add(producto);
    }

    public void registrarCompra(Compra compra) {
        compras.add(compra);
    }

    public List<Producto> consultarProductos() {
        return new ArrayList<>(productos);
    }

    public List<Producto> filtrarProductosPorNombre(String nombre) {
        return productos.stream()
                .filter(p -> p.getNombre().contains(nombre))
                .collect(Collectors.toList());
    }

    public List<Producto> filtrarProductosPorStockMinimo() {
        return productos.stream()
                .filter(p -> p.getStock() < p.getStockMinimo())
                .collect(Collectors.toList());
    }

    public List<Compra> consultarCompras() {
        return new ArrayList<>(compras);
    }

    public List<Compra> filtrarComprasPorCliente(Cliente cliente) {
        return compras.stream()
                .filter(c -> c.getCliente().equals(cliente))
                .collect(Collectors.toList());
    }

    public List<Compra> filtrarComprasPorFecha(LocalDate fecha) {
        return compras.stream()
                .filter(c -> c.getFecha().equals(fecha))
                .collect(Collectors.toList());
    }
}
