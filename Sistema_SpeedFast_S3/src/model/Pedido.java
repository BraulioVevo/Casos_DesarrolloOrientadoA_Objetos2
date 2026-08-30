package model;

import strategy.Cancelable;
import strategy.Despachable;

public abstract class Pedido implements Despachable, Cancelable {

    protected String idPedido;
    protected String direccionEntrega;
    protected double distanciaKm;
    protected String repartidorAsignado;
    protected String estado;


    /**
     *
     * @param idPedido
     * @param direccionEntrega
     * @param distanciaKm
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

    public void asignarRepartidor(String nombreRepartidor){
        this.repartidorAsignado = nombreRepartidor;
    }

    public void mostrarResumen(){
        System.out.println("-------------------");
        System.out.println("ID pedido: #" + idPedido);
        System.out.println("Dirección: " + direccionEntrega);
        System.out.println("Distancia Km: " + distanciaKm + " Km");
        System.out.println("Repartidor Asignado: " + repartidorAsignado);
        System.out.println("Estado: " + estado);
    }

    public abstract int calcularTiempoEntrega();

    @Override
    public void despachar(){
        this.estado = "Despachado";
        System.out.println("Pedido #" + idPedido + " despachado correctamente");
    }

    @Override
    public void cancelar(){
        this.estado = "Cancelado";
        System.out.println("Pedido #" + idPedido + " ha sido cancelado");
        System.out.println(" El pedido fue cancelado correctamente");
    }

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

    public String getTipo(){
        return "Pedido";
    }
}
