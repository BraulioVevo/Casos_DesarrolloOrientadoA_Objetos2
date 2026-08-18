package data;

import util.UtilPedido;

/**
 * Representa un pedido de envío de encomienda (documentos o paquetes).
 * Requiere la validación del peso del para su asignación
 */

public class PedidoEncomienda extends PedidoComida{

    private boolean pesoValido;

    /**
     *  Constructor para instanciar pedido de encomienda
     * @param idPedido Identificador unico
     * @param direccionEntrega Dirección de Entrega
     * @param tipoPedido Categoria del pedido.
     * @param pesoValido Verifica si el peso se encuentra en regla
     */

    public PedidoEncomienda(int idPedido, String direccionEntrega, String tipoPedido, boolean pesoValido) {
        super(idPedido, direccionEntrega, tipoPedido,pesoValido);
        this.pesoValido = pesoValido;
    }

    /**
     * Imprime el encabezado especifíco para el proceso de asignación de encomienda
     */
    @Override
    public void asignarRepartidor() {
        System.out.println("\n [Pedido Encomienda]");
        super.asignarRepartidor();
    }

    /**
     *  Valida el peso antes de asignar el repartidor de la encomienda.
     * @param nombreRepartidor Nombre completo del repartidor designado.
     */

    @Override
    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("Verificando peso y embalaje...");
        if(pesoValido){
            System.out.println("OK");
            System.out.println("Asignando a " + nombreRepartidor);
        } else{
            System.out.println("Rechazado (No se ha verificado el peso)");
        }
        UtilPedido.mostrarPedido(nombreRepartidor);
    }

}
