package model;

/**
 * Clase que representa un pedido de tipo encomienda
 */

public class PedidoEncomienda extends Pedido {

    /**
     * Constructor para instancia un PedidoEncomienda
     * @param idPedido Identificador del pedido
     * @param direccionEntrega Dirección de entrega
     * @param distanciaKm Distancia en kilometros
     */

    public PedidoEncomienda(String idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    /**
     * Retorna el nombre de la clase/tipo de pedido
     * @return "Pedido Encomienda"
     */

    public String getTipo() {
        return "PedidoEncomienda";
    }

    /**
     * Calcula el tiempo de entrega para una encomienda
     * la formula:
     * 20 muntos de base + 1.5 por kilometro
     * Math.round, es para redondear el resultado
     * @return Tiempo estimado en minutos.
     */

    @Override
    public int calcularTiempoEntrega() {
        return (int) Math.round(20 + (1.5 * distanciaKm));
    }

}
