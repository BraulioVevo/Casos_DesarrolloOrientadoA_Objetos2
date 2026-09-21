package model;

/**
 * Clase que representa un pedido del tipo Comida
 */

public class PedidoComida extends Pedido {


    /**
     *
     * @param idPedido         Identificador del pedido
     * @param direccionEntrega Dirección de destino del pedido
     */

    public PedidoComida(int idPedido, String direccionEntrega, String tipo) {
        super(idPedido, direccionEntrega,tipo);
    }

    @Override
    public String getTipo(){
        return "Pedido Comida";
    }

}
