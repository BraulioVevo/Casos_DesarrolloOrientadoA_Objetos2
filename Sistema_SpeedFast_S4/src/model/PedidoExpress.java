package model;

/**
 * Clase que representa un pedido de tipo Express
 */
public class PedidoExpress extends Pedido {

    /**
     * Constructor para instanciar un pedidoExpress
     * @param idPedido Identificador del Pedido
     * @param direccionEntrega Dirección de destino
     * @param distanciaKm Distancia en kilometros
     */

    public PedidoExpress(String idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    /**
     * Retorna el nombre del tipo de pedido.
     * @return "PedidoExpress"
     */

    public String getTipo() {
        return "PedidoExpress";
    }

    /**
     * Calcula el timepo estimado de entrega de un pedido express
     * Base de 10 minutos: Agrega 5 minutos extra si la distancia supera  los 5km
     * @return Tiempo estimado en minutos.
     */

    @Override
    public int calcularTiempoEntrega() {
     int tiempo = 10;
     if (distanciaKm > 5){
         tiempo += 5;
     }
     return tiempo;
    }
}
