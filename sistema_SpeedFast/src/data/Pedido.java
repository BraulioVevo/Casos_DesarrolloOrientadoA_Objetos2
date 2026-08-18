package data;

/**
 * Representa un pedido de la empresa de reparto SpeedFast
 * Sirve como clase BASE/Padre para los tipos especificos de pedido
 */

public class Pedido {

    protected int idPedido;
    protected String direccionEntrega;
    protected String tipoPedido;

    /**
     * Constructor para inicializar un pedido generico
     * @param idPedido Identificador unico del pedido
     * @param direccionEntrega Dirección de entrega del pedido
     * @param tipoPedido Categoria o tipo de servicio del pedido
     */

    public Pedido(int idPedido, String direccionEntrega, String tipoPedido) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.tipoPedido = tipoPedido;
    }

    /**
     * Muestra por consola el inicio del proceso de asignación de repartidor
     */

    public void asignarRepartidor(){
        System.out.println("Asignando repartidor...");
    }

    /**
     * Asigna uun repartidor de forma genérica imprimiendo su nombre
     * @param nombreRepartidor Nombre completo del repartidor designado.
     */

    public void asignarRepartidor(String nombreRepartidor){
        System.out.println("Asignado a " + nombreRepartidor);
    }

    /**
     *  Getters y Setters de los atributos
     */

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getDireccionEntrega() {
        return direccionEntrega;
    }

    public void setDireccionEntrega(String direccionEntrega) {
        this.direccionEntrega = direccionEntrega;
    }

    public String getTipoPedido() {
        return tipoPedido;
    }

    public void setTipoPedido(String tipoPedido) {
        this.tipoPedido = tipoPedido;
    }
}
