package model;

public class PedidoEncomienda extends Pedido {

    /**
     *
     * @param idPedido
     * @param direccionEntrega
     * @param distanciaKm
     */

    public PedidoEncomienda(String idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    public String getTipo() {
        return "PedidoEncomienda";
    }
    @Override
    public int calcularTiempoEntrega() {
        return (int) Math.round(20 + (1.5 * distanciaKm));
    }

}
