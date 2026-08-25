package data;

/**
 * Representa un pedido de la empresa de reparto SpeedFast
 * Sirve como clase BASE/Padre para los tipos especificos de pedido
 */

public abstract class Pedido {

    protected String idPedido;
    protected String direccionEntrega;
    protected double distanciaKm;

    /**
     * Constructor para inicializar un pedido generico
     * @param idPedido Identificador unico del pedido
     * @param direccionEntrega Dirección de entrega del pedido
     * @param distanciaKm Categoria o tipo de servicio del pedido
     */

    public Pedido(String idPedido, String direccionEntrega, double distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
    }

    /**
     * Muestra por consola el inicio del proceso de asignación de repartidor
     */

    public void mostrarResumen(){
        System.out.println("-------------------");
        System.out.println("ID: #" + idPedido);
        System.out.println("Direccion: " + direccionEntrega);
        System.out.println("Distancia Km: " + distanciaKm);
    }

    public abstract int calcularTiempoEntrega();


}
