package app;

import data.*;

/**
 * Clase Main que ejecuta el sistema de entragas SpeedFast.
 * Demuestra el uso de polimorfimos, sobreescritura y sobrecarga de métodos.
 */

public class Main {


    public static void main(String[] args) {

        Pedido pedidoComida = new PedidoComida(101, "Av. España 123", "Comida", true);
        Pedido pedidoEncomienda = new PedidoEncomienda(102, "Alameda 321", "Encomienda", true);
        Pedido pedidoExpress = new PedidoExpress(103, "Privdencia 412", "Express", true);

        // Pedido de Comida

        pedidoComida.asignarRepartidor();
        pedidoComida.asignarRepartidor("Juan Jimenez");

        // Pedido de Encomienda

        pedidoEncomienda.asignarRepartidor();
        pedidoEncomienda.asignarRepartidor("Camila Diaz");

        // Pedido Express

        pedidoExpress.asignarRepartidor();
        pedidoExpress.asignarRepartidor("Guillermo Gutierrez");
    }
}