package service;

import java.util.ArrayList;
import java.util.List;
import model.Pedido;
import strategy.Rastreable;

/**
 * Clase de servicio encargada de administrar y guardar
 * el historial de pedidos realizados
 */

public class GestorDeEnvios implements Rastreable {

    /** Array interno para almacenar el historial de pedidos  */
    private List <Pedido> historial;

    /**
     * Inicializa la lista interna del historial vacía
     */
    public GestorDeEnvios() {
        this.historial = new ArrayList<>();
    }

    /**
     * Agrega un pedido a la lista del historial de entregas
     * @param pedido Objeto (del mismo nombre) a Registrar
     */

    public void registarEntrega(Pedido pedido) {
        historial.add(pedido);
    }

    /**
     * Imprime en consola la lista completa de pedidos guardados en el historial
     */

    @Override
    public void verHistorial() {
        System.out.println("\n --- Historial de pedidos ---");
        for (Pedido pedido : historial) {
            System.out.println("--- " + pedido.getTipo() + " #" + pedido.getIdPedido() + " ---");
            System.out.println(" - Entregado por " + pedido.getRepartidorAsignado() + " ---");
        }
    }
}
