package service;

import model.EstadoPedido;
import model.Pedido;

public class Repartidor implements Runnable {
    private final String nombreRepartidor;
    private final ZonaDeCarga zonaDeCarga;

    public Repartidor(String nombreRepartidor, ZonaDeCarga zonaDeCarga) {
        this.nombreRepartidor = nombreRepartidor;
        this.zonaDeCarga = zonaDeCarga;
    }

    @Override
    public void run() {
        while (true) {
            Pedido pedido = null;

            //retira de forma segura desde el recurso compartido
            synchronized (zonaDeCarga) {
                if (!zonaDeCarga.hayPedidos()) {
                    break;
                }
                pedido = zonaDeCarga.retiraPedido();
            }

            if (pedido != null) {
                // EN_REPARTO
                pedido.setEstado(EstadoPedido.EN_REPARTO);
                System.out.println("Repartidor: " + nombreRepartidor + " Retirando pedido:" + pedido.getIdPedido() + "...");
                System.out.println("Repartidor: " + nombreRepartidor + " Estado:" + pedido.getEstado());


                //Realizamos simulacion de tiempo de entrega
                try {
                    System.out.println("Repartidor - " + nombreRepartidor + " | Entregando pedido " + pedido.getIdPedido() + "...");
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.err.println("Entrega interrumpida" + e.getMessage());
                    Thread.currentThread().interrupt();
                }

                //Transicion a ENTREGADO
                pedido.setEstado(EstadoPedido.ENTREGADO);
                System.out.println("Repartidor: " + nombreRepartidor + " | Estado: " + pedido.getEstado());
            }
        }
    }
}
