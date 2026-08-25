package data;

import util.UtilPedido;

/**
 * Representa un pedido express de compras de supermercado o farmacias.
 * Requiere verificar la disponibilidad inmediata de un repartidor
 */

public class PedidoExpress extends Pedido {

    /**
     *
     * @param idPedido
     * @param direccionEntrega
     * @param distanciaKm
     */

    public PedidoExpress(String idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    /**
     * Imprime el encabezado para la asignación express.
     */

    @Override
    public int calcularTiempoEntrega()
    {
        int tiempo = 10;
        if (distanciaKm > 5){
            tiempo += 5;
        }
        return tiempo;
    }
}
