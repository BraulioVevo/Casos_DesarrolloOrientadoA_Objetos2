package model;

/**
 * Clase que representa un pedido de tipo encomienda
 */

public class PedidoEncomienda extends Pedido {

    /**
     * Constructor para instancia un PedidoEncomienda
     * @param idPedido Identificador del pedido
     * @param direccionEntrega Dirección de entrega
     */

    public PedidoEncomienda(int idPedido, String direccionEntrega, String tipo) {
        super(idPedido, direccionEntrega, tipo);
    }

    @Override
    public String getTipo(){
        return "Pedido Encomienda";
    }

}
