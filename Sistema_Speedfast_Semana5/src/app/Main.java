package app;

import model.*;
import service.Repartidor;
import service.ZonaDeCarga;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Clase principal que ejecuta la simulación del sistema de envíos SpeedFast
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Zona de carga iniciada");

        ZonaDeCarga zonaCarga = new ZonaDeCarga();

        // Cargamos los 5 pedidos al sistema
        zonaCarga.agregarPedido(new PedidoComida(1, "Estacion central"));
        zonaCarga.agregarPedido(new PedidoEncomienda(2, "Providencia"));
        zonaCarga.agregarPedido(new PedidoExpress(3, "Recoleta"));
        zonaCarga.agregarPedido(new PedidoComida(4, "Las Condes"));
        zonaCarga.agregarPedido(new PedidoExpress(5, "Maipu"));

        System.out.println("\n--- Iniciando proceso de reparto ---");

        // crear el pool con 3 hilos de tipo Repartidor
        ExecutorService executor = Executors.newFixedThreadPool(3);

        executor.execute(new Repartidor("Juan", zonaCarga));
        executor.execute(new Repartidor("Maria", zonaCarga));
        executor.execute(new Repartidor("Pedro", zonaCarga));

        executor.shutdown();
        try{
            if (executor.awaitTermination(1, TimeUnit.MINUTES)){
                System.out.println("\nTodos los pedidos fueron entregados correctamente");
            } else {
                System.out.println("\nEl tiempo de espera terminó antes de completar los pedidos");
            }
        } catch (InterruptedException e) {
            System.err.println("Error en la ejecucion del proceso" +  e.getMessage());
            Thread.currentThread().interrupt();
        }


    }
}
