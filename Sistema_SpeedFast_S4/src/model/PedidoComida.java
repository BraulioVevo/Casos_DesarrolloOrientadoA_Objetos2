package model;

/**
 * Clase que representa un pedido del tipo Comida
 */

public class PedidoComida extends Pedido{


    /**
     *
     * @param idPedido Identificador del pedido
     * @param direccionEntrega Dirección de destino del pedido
     * @param distanciaKm Distancia en kilometros
     */

    public PedidoComida(String idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    /**
     * Retorna el nombre de la clase
     * @return
     */

    public String getTipo() {
        return "PedidoComida";
    }

    /**
     * Calcula el tiempo estimado para un pedido de comida
     * la formula es:
     *  15 minutos base + 2 minutos x kilometro
     * @return Tiempo estimado
     */

    @Override
    public int calcularTiempoEntrega() {
        return (int) (15 + (2 * distanciaKm));
    }
}
