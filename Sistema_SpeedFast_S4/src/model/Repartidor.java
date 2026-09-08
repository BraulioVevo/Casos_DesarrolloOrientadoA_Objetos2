package model;

import java.util.List;
import java.util.Random;

public class Repartidor implements Runnable {

    private String nombre;
    private List<Pedido> pedidosAsignados;
    private Random random = new Random();

    /**
     *
     * @param nombre
     * @param pedidosAsignados
     */
    public Repartidor(String nombre, List<Pedido> pedidosAsignados) {
        this.nombre = nombre;
        this.pedidosAsignados = pedidosAsignados;
    }

    @Override
    public void run() {
        for (Pedido pedido : pedidosAsignados) {
            try{
                //Asignamos un repartido al pedido
                pedido.asignarRepartidor(nombre);

                System.out.println("Repartidor: " + nombre + " Entregando "
                + pedido.getTipo() + " #" + pedido.getIdPedido() +"...");

                //simulamos el tiempo de entrega con pausa aleatoria enttre 1.5 y 3.5 segundos
                int tiempoPausa = 1500 + random.nextInt(2000);
                Thread.sleep(tiempoPausa);

                //Marcamos un pedido como despachado/entregado
                pedido.despachar();
                System.out.println("Repartidor: " + nombre + " Pedido #: "+ pedido.getIdPedido()
                        +" Entregado.");

            } catch (InterruptedException e) {
                System.err.println(e.getMessage() + "Repartidor: " + nombre + "La entrega del pedido #"
                + pedido.getIdPedido() + " Fue interrumpida");

                Thread.currentThread().interrupt();
            }
        }
    }

    public  String getNombre() {
        return nombre;
    }
    public List<Pedido> getPedidosAsignados() {
        return pedidosAsignados;
    }
}
