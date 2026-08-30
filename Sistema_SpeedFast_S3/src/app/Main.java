package app;

import model.PedidoComida;
import model.PedidoEncomienda;
import model.PedidoExpress;
import service.GestorDeEnvios;

public class Main {
    public static void main(String[] args) {

        GestorDeEnvios gestor = new GestorDeEnvios();

        //Pedido de comida
        PedidoComida p1 = new PedidoComida("101", "Av. Providencia 3131", 3);
        p1.asignarRepartidor("Pedro Perez");
        p1.mostrarResumen();
        System.out.println("Tiempo estimado: " + p1.calcularTiempoEntrega() + " minutos");
        p1.despachar();
        gestor.registarEntrega(p1);

        //Pedido encomienda
        System.out.println("\nPedido Encomienda");
        PedidoEncomienda p2 = new PedidoEncomienda("102", "Av. Providencia 4142", 7.0);
        p2.asignarRepartidor("Daniela Tapia");
        p2.mostrarResumen();
        System.out.println("Tiempo Estimado: " + p2.calcularTiempoEntrega() + " minutos");
        p2.despachar();
        gestor.registarEntrega(p2);

        //Pedido Express (cancelado)
        System.out.println();
        PedidoExpress p3 = new PedidoExpress("103", "Av. Providencia 4142", 2.0);
        p3.asignarRepartidor();
        p3.cancelar();

        //visualización de historial
        gestor.verHistorial();
        }
    }
