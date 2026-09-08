package app;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.*;

import model.*;

/**
 * Clase principal que ejecuta la simulación del sistema de envíos SpeedFast
 */

public class Main {
    public static void main(String[] args) {

        List<Pedido> pedidosCarlos = new ArrayList<>();
        pedidosCarlos.add(new PedidoComida("101", "Alameda 4132", 3.4));
        pedidosCarlos.add(new PedidoEncomienda("105", "Providencia 2134", 5.4));

        List<Pedido> pedidosLuis = new ArrayList<>();
        pedidosLuis.add(new PedidoExpress("102", "Nogales 4112", 6.4));
        pedidosLuis.add(new PedidoExpress("106", "Titan 1312", 2.4));

        List<Pedido> pedidosDaniela = new ArrayList<>();
        pedidosDaniela.add(new PedidoExpress("103", "Republica 71", 1.4));
        pedidosDaniela.add(new PedidoExpress("104", "Echaurren 181", 2.6));

        //instanciamos los 3 repartidores
        Repartidor repartidor1 = new Repartidor("Carlos", pedidosCarlos);
        Repartidor repartidor2 = new Repartidor("Luis", pedidosLuis);
        Repartidor repartidor3 = new Repartidor("Daniela", pedidosDaniela);

        //Creamos el ExecutorService  con pool de 3 hilos (uno por cada repartido)
        ExecutorService executor = Executors.newFixedThreadPool(3);

        //Se envian las tareas por parte del Executor
        executor.submit(repartidor1);
        executor.submit(repartidor2);
        executor.submit(repartidor3);

        executor.shutdown();

        try{
            if (executor.awaitTermination(1000, TimeUnit.SECONDS)){
                System.out.println("Todas las entregas se completaron");
            }else {
                System.out.println("Algunas pedidos quedaron pendientes");
            }
        } catch (InterruptedException e){
            System.err.println("Las entregas fueron interrumpidas");
            Thread.currentThread().interrupt();
        }


        }
    }
