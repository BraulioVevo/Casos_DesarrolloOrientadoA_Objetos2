package app;

import data.*;

/**
 * Clase Main que ejecuta el sistema de entragas SpeedFast.
 * Demuestra el uso de polimorfimos, sobreescritura y sobrecarga de métodos.
 */

public class Main {


    public static void main(String[] args) {

        Pedido p1 = new PedidoComida("001", "Av. Italia 123", 4);
        Pedido p2 = new PedidoComida("002", "Av. Independencia 432", 6);
        Pedido p3 = new PedidoComida("003", "Alameda 414", 7);

        imprimirPedido(p1);
        imprimirPedido(p2);
        imprimirPedido(p3);

    }
    private static void imprimirPedido(Pedido p){
        p.mostrarResumen();
        System.out.println("Tiempo de entrega estamada: " + p.calcularTiempoEntrega() + " minutos");
    }
}