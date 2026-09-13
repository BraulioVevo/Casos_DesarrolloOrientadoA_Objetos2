package model;



/**
 * Clase base abstracta que representa un pedido generico dentro del sistema
 * SpeedFast.
 */

public class Pedido{

    protected int idPedido;
    protected String direccionEntrega;
    protected EstadoPedido estado;

    public Pedido(int idPedido, String direccionEntrega) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.estado = EstadoPedido.PENDIENTE;
    }

    public String getTipo() {
        return "Pedido Generico";
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Pedido id" + getIdPedido() +
                "Direccion: " + direccionEntrega +
                "Estado: " + estado;
    }
}

