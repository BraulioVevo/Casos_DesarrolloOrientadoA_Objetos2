package service;

import model.Pedido;
import java.util.LinkedList;
import java.util.Queue;

public class ZonaDeCarga {
    private final Queue<Pedido> colaPedidos = new LinkedList<>();

    //agregar pedidos a la zona de carga
    public synchronized void agregarPedido(Pedido pedido) {
        colaPedidos.add(pedido);
        System.out.println("Pedido #" + pedido.getIdPedido() + " Agregado. Con destino a: " + pedido.getDireccionEntrega());
    }

    public synchronized Pedido retiraPedido() {
        if (!colaPedidos.isEmpty()) {
            return colaPedidos.poll();
        }
        return null; //Retorna null si ya no quedan pedidos pendientes
    }

    public synchronized boolean hayPedidos(){
        return !colaPedidos.isEmpty();
    }
}
