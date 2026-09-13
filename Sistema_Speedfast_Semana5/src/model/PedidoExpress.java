package model;

/**
 * Clase que representa un pedido de tipo Express
 */
public class PedidoExpress extends Pedido {

    /**
     * Constructor para instanciar un pedidoExpress
     * @param idPedido Identificador del Pedido
     * @param direccionEntrega Dirección de destino
     */

    public PedidoExpress(int idPedido, String direccionEntrega) {
        super(idPedido, direccionEntrega);
    }

    @Override
    public String getTipo(){
        return "Pedido Express";
    }


}
