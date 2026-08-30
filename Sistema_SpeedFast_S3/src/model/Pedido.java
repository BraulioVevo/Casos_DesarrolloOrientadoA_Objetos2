package model;

import strategy.Cancelable;
import strategy.Despachable;

/**
 * Clase base abstracta que representa un pedido generico dentro del sistema
 * SpeedFast.
 */

public abstract class Pedido implements Despachable, Cancelable {

    protected String idPedido;
    protected String direccionEntrega;
    protected double distanciaKm;
    protected String repartidorAsignado;
    protected String estado;


    /**
     * Constructor para inicializar los datos base de un pedido
     * @param idPedido Identificador unico del pedido
     * @param direccionEntrega Destino de entrega
     * @param distanciaKm Distancia de kilometros
     */


    public Pedido(String idPedido, String direccionEntrega, double distanciaKm) {
        this.idPedido = idPedido;
        this.direccionEntrega = direccionEntrega;
        this.distanciaKm = distanciaKm;
        this.repartidorAsignado = "Sin asignar";
        this.estado = "Creado";
    }
    //Sobrecarga: asignación de repartidor (sin parametros)
    public void asignarRepartidor(){
        this.repartidorAsignado = "Asignando repartidor...";
    }

    /**
     * Sobrecarga 2: Asigna manualente un repartidor especifico al pedido
     * @param nombreRepartidor Nombre del repartidor asignado
     */
    public void asignarRepartidor(String nombreRepartidor){
        this.repartidorAsignado = nombreRepartidor;
    }

    /**
     * Muestra en consola la información resumida de los datos del pedido
     */
    public void mostrarResumen(){
        System.out.println("-------------------");
        System.out.println("ID pedido: #" + idPedido);
        System.out.println("Dirección: " + direccionEntrega);
        System.out.println("Distancia Km: " + distanciaKm + " Km");
        System.out.println("Repartidor Asignado: " + repartidorAsignado);
        System.out.println("Estado: " + estado);
    }

    /**
     * Metodo abstracto para calcular el tiempo estimado de entrega
     * @return El tiempo estimado de entrega expresado en minutos
     */

    public abstract int calcularTiempoEntrega();

    /**
     * Cambia el estado del pedido a "Despachado"
     */
    @Override
    public void despachar(){
        this.estado = "Despachado";
        System.out.println("Pedido #" + idPedido + " despachado correctamente");
    }

    /**
     * Cambia el estado de un pedido a "Cancelado"
     */
    @Override
    public void cancelar(){
        this.estado = "Cancelado";
        System.out.println("Pedido #" + idPedido + " ha sido cancelado");
        System.out.println(" El pedido fue cancelado correctamente");
    }

    //Getters y Setters
    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public String getRepartidorAsignado() {
        return repartidorAsignado;
    }

    public void setRepartidorAsignado(String repartidorAsignado) {
        this.repartidorAsignado = repartidorAsignado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Retorna el tipo de pedido en formato legible
     * @return Nombre basico del tipo de pedido
     */
    public String getTipo(){
        return "Pedido";
    }
}
