package controller;

import model.Pedido;
import java.util.ArrayList;
import java.util.List;

public class PedidoController {
    private List<Pedido> listaPedido;

    public PedidoController() {
        this.listaPedido = new ArrayList<>();
    }

    public boolean agregarPedido(Pedido pedido) {
        if (pedido != null) {
            listaPedido.add(pedido);
            return true;
        }else {
            return false;
        }
    }

    public List<Pedido> obtenerPedidos() {
        return listaPedido;
    }
}
