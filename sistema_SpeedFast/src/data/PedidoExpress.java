package data;

import util.UtilPedido;

/**
 * Representa un pedido express de compras de supermercado o farmacias.
 * Requiere verificar la disponibilidad inmediata de un repartidor
 */

public class PedidoExpress extends Pedido {

    private boolean disponibilidadInmediata;

    /**
     *  Constructor para instanciar un pedido express
     * @param idPedido Identificador del pedido
     * @param direccionEntrega Dirección de entrega
     * @param tipoPedido Categoria del pedido.
     * @param disponibilidadInmediata Verifica si hay un repartidor cercano y con disponibilidad.
     */

    public PedidoExpress(int idPedido, String direccionEntrega, String tipoPedido, boolean disponibilidadInmediata) {
        super(idPedido, direccionEntrega, tipoPedido);
        this.disponibilidadInmediata = disponibilidadInmediata;
    }

    /**
     * Imprime el encabezado para la asignación express.
     */

    @Override
    public void asignarRepartidor() {
        System.out.println("\n [Pedido Express]");
        super.asignarRepartidor();
    }

    /**
     * Asigna un repartidor si se cuenta con disponibilidad inmediata.
     *
     * @param nombreRepartidor Nombre completo del repartidor designado.
     */

    @Override
    public void asignarRepartidor(String nombreRepartidor){
        if(disponibilidadInmediata){
            System.out.println("Repartidor más cercano con disponibilidad inmediata encontrado");
            System.out.println("Asignando a " + nombreRepartidor);
        } else {
            System.out.println("No se pudo encontrar un repartidor");
        }
        UtilPedido.mostrarPedido(nombreRepartidor);
    }
}
