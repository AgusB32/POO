package POO_tp9;

import java.time.LocalDate;
import java.util.List;

public class Compra {
    private Cliente cliente;
    private LocalDate fecha;
    private List<LineaCompra> detalle;

    public Compra(Cliente cliente, List<LineaCompra> detalle) {
        if (cliente == null || detalle == null || detalle.isEmpty())
            throw new IllegalArgumentException("Cliente y detalle no pueden ser nulos o vacíos.");
        this.cliente = cliente;
        this.fecha = LocalDate.now();
        this.detalle = detalle;
    }

    public double getTotal() {
        return detalle.stream().mapToDouble(LineaCompra::getSubTotal).sum();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }
}
