package view;

import controller.PedidoController;
import model.Pedido;
import model.PedidoComida;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class VentanaListaPedidos extends JFrame {
    private JTable table1;
    private JLabel JlblLista;
    private JPanel JpanelMain;
    private JPanel mainPanel;
    private PedidoController controller;

    public VentanaListaPedidos(PedidoController controller) {
        setContentPane(table1);
        setTitle("Lista de Pedidos");
        setSize(500, 350);
        setLocationRelativeTo(null);

        String[] columnas = {"ID", "Direccion", "Tipo"};
        DefaultTableModel model = new DefaultTableModel(columnas, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        if (controller != null && controller.obtenerPedidos() != null) {
            for (Pedido pedido : controller.obtenerPedidos()) {
                Object[] fila = {
                        pedido.getIdPedido(),
                        pedido.getDireccionEntrega(),
                        pedido.getTipo(),
                        pedido.getEstado()
                };
                model.addRow(fila);
            }
        }
        table1.setModel(model);
    }
}
