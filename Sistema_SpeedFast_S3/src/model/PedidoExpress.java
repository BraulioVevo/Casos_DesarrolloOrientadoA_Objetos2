package model;

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

    public String getTipo() {
        return "PedidoExpress";
    }

    @Override
    public int calcularTiempoEntrega() {
     int tiempo = 10;
     if (distanciaKm > 5){
         tiempo += 5;
     }
     return tiempo;
    }
}
