package data;

import util.UtilPedido;

/**
 * Representa un pedido de comida desde un restaurante
 * Requiere la verificación de una mochila térmica para poder asignar un repartidor.
 */

public class PedidoComida extends Pedido{

    private boolean mochilaTermica;

    /**
     *  Constructor para instanciar uun pedido de comida
     * @param idPedido Identificador del pedido
     * @param direccionEntrega Dirección de destino
     * @param tipoPedido Categoria del pedido
     * @param mochilaTermica Verifica si el repartidor cuenta con mochila térmica o no
     */

    public PedidoComida(int idPedido, String direccionEntrega, String tipoPedido, boolean mochilaTermica) {
        super(idPedido, direccionEntrega, tipoPedido);
        this.mochilaTermica = mochilaTermica;
    }

    /**
     * Imprime el encabezado específico de asignación para un pedido de comida
     */

    @Override
    public void asignarRepartidor(){
        System.out.println("\n [Pedido Comida]");
        super.asignarRepartidor();
    }

    /**
     * Valida si el repartidor cuenta con mochila antes de asignar el pedido
     * @param nombreRepartidor Nombre completo del repartidor designado.
     */

    @Override
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("-> Verifiando mochila térmica... ");
        if (this.mochilaTermica){
            System.out.println("OK");
            System.out.println("-> Pedido asignado a " + nombreRepartidor);
        }else {
            System.out.println("Rechazado (Necesita mochila térmica)");
        }
        UtilPedido.mostrarPedido(nombreRepartidor);
    }
}
