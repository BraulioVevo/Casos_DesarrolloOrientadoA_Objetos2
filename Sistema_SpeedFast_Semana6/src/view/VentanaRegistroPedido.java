package view;

import model.Pedido;
import controller.PedidoController;
import javax.swing.*;

public class VentanaRegistroPedido extends JFrame {
    private JPanel panel1;
    private JTextField txtFieldID;
    private JTextField txtFieldDireccion;
    private JComboBox <String> cbxTipo;
    private JLabel jLabelDireccion;
    private JLabel jLabelId;
    private JButton btnGuardarRegistro;

    private PedidoController controller;

    public VentanaRegistroPedido(PedidoController controller) {
        this.controller = controller;

        setContentPane(panel1);
        setTitle("Registro de pedido");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        btnGuardarRegistro.addActionListener(e -> {
           try{
               int id = Integer.parseInt(txtFieldID.getText().trim());
               String direccion = txtFieldDireccion.getText().trim();
               String tipo = (String) cbxTipo.getSelectedItem();

               if (direccion.isEmpty()) {
                   JOptionPane.showMessageDialog(this, "Debe ingresar una dirección.");
                   return;
               }
               Pedido pedido = new Pedido(id, direccion, tipo);
               this.controller.agregarPedido(pedido);

               JOptionPane.showMessageDialog(this, "Pedido guardado exitosamente");
               dispose();
           }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "El ID debe ser un numero valido.");
           }
        });

    }
}

