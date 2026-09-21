package model;



/**
 * Clase base abstracta que representa un pedido generico dentro del sistema
 * SpeedFast.
 */

public class Pedido{

    protected int idPedido;
    protected String direccionEntrega;
    protected String tipo;
    protected EstadoPedido estado;

    public Pedido(int idPedido, String direccionEntrega, String tipo) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo != null ? tipo : "Pedido Generico";
    }

    public void setTipo(String tipo) {
    this.tipo = tipo;
    }
}


