package view;

import controller.PedidoController;
import model.Pedido;

import javax.swing.*;

public class VentanaPrincipal extends JFrame {
    private JPanel mainPanel;
    private JButton btnRegistrarPedido;
    private JButton btnListarPedido;
    private JButton btnIniciarEntrega;
    private JButton btnGuardar;
    private JButton btnLimpiar;
    private JButton btnSalir;
    private JButton btnActualizar;
    private JTextArea jtextArea;
    private JLabel JLabel;
    private PedidoController controller = new PedidoController();

    public VentanaPrincipal() {
        setContentPane(mainPanel);
        setTitle("Sistema SpeedFast");
        setSize(650, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        btnRegistrarPedido.addActionListener(e -> {
            VentanaRegistroPedido ventanaRegistro = new VentanaRegistroPedido(controller);
            ventanaRegistro.setVisible(true);
        });

        btnListarPedido.addActionListener(e -> {
            VentanaListaPedidos ventanaListaPedidos = new VentanaListaPedidos(controller);
            ventanaListaPedidos.setVisible(true);
        });

        btnIniciarEntrega.addActionListener(e -> {
            if (controller.obtenerPedidos().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ninguna hay pedidos pendientes.", " Atención", JOptionPane.WARNING_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Simulación de entrega iniciada con " + controller.obtenerPedidos().size() + " pedido.");
            }
        });

        btnActualizar.addActionListener(e -> actualizarTextArea());

        btnGuardar.addActionListener(e -> {
            actualizarTextArea();
            JOptionPane.showMessageDialog(this, "Guardado exitosamente");
        });

        btnLimpiar.addActionListener(e -> jtextArea.setText(""));


        //Cerrar aplicación
        btnSalir.addActionListener(e -> {
            System.exit(0);
        });
    }
        private void actualizarTextArea(){
            if (controller.obtenerPedidos().isEmpty()){
                jtextArea.setText("No hay pedidos.");
            } else {
                StringBuilder sBuilder = new StringBuilder("~~~ Lista de pedidos ~~~\n");
                for (Pedido pedido : controller.obtenerPedidos()){
                    sBuilder.append("ID: ").append(pedido.getIdPedido())
                            .append("| Dirección: ").append(pedido.getDireccionEntrega())
                            .append("| Tipo: " ).append(pedido.getTipo())
                            .append("\n");
                }
            jtextArea.setText(sBuilder.toString());
        }
    }
}

