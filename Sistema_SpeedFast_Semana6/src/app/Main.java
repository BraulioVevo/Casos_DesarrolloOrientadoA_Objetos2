package app;

import model.*;
import service.Repartidor;
import service.ZonaDeCarga;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import view.VentanaPrincipal;

import javax.swing.*;

/**
 * Clase principal que ejecuta la simulación del sistema de envíos SpeedFast
 */

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->{
         new VentanaPrincipal().setVisible(true);
        });
    }
}
