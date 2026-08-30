package model;

public class PedidoComida extends Pedido{


    /**
     *
     * @param idPedido
     * @param direccionEntrega
     * @param distanciaKm
     */

    public PedidoComida(String idPedido, String direccionEntrega, double distanciaKm) {
        super(idPedido, direccionEntrega, distanciaKm);
    }

    public String getTipo() {
        return "PedidoComida";
    }
    @Override
    public int calcularTiempoEntrega() {
        return (int) (15 + (2 * distanciaKm));
    }
}
