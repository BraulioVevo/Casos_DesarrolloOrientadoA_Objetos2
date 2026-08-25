package data;

import util.UtilPedido;

/**
 * Representa un pedido de comida desde un restaurante
 * Requiere la verificación de una mochila térmica para poder asignar un repartidor.
 */

public class PedidoComida extends Pedido{

    /**
     *  Constructor para instanciar uun pedido de comida
     * @param idPedido Identificador del pedido
     * @param direccionEntrega Dirección de destino
     * @param distanciaKm Categoria del pedido
     */

    public PedidoComida(String idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    /**
     * Imprime el encabezado específico de asignación para un pedido de comida
     */

    @Override
    public int calcularTiempoEntrega() {
        return (int)(15 + (2 * distanciaKm));
    }
}
