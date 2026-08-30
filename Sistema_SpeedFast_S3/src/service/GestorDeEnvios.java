package service;

import java.util.ArrayList;
import java.util.List;

import model.Pedido;
import strategy.Rastreable;

public class GestorDeEnvios implements Rastreable {

    private List <Pedido> historial;

    public GestorDeEnvios() {
        this.historial = new ArrayList<>();
    }

    public void registarEntrega(Pedido pedido) {
        historial.add(pedido);
    }

    @Override
    public void verHistorial() {
        System.out.println("\n --- Historial de pedidos ---");
        for (Pedido pedido : historial) {
            System.out.println("--- " + pedido.getTipo() + " #" + pedido.getIdPedido() + " ---");
            System.out.println(" - Entregado por " + pedido.getRepartidorAsignado() + " ---");
        }
    }
}
