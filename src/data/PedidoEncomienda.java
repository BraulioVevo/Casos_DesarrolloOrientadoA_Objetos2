package data;

import util.UtilPedido;

/**
 * Representa un pedido de envío de encomienda (documentos o paquetes).
 * Requiere la validación del peso del para su asignación
 */

public class PedidoEncomienda extends Pedido{


    /**
     *
     * @param idPedido
     * @param direccionEntrega
     * @param distanciaKm

     */
    public PedidoEncomienda(String idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }


    @Override
    public int calcularTiempoEntrega() {
        return (int) Math.round(20 +(1.5 * distanciaKm));
    }
}
