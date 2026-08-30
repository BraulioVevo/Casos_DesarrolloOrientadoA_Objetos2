package strategy;

/**
 * Interfaz que define el comportamiento para despachar un pedido
 */

public interface Despachable {

    /**
     * Despacha el pedido actual y actualiza su estado en el sistema
     */
    void despachar();
}
