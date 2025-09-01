package views;

import javax.swing.*;
import paneles.PanelBuscador;
import paneles.PanelProductos;
import java.awt.*;

public class Dashboard extends JFrame {
    
    private PanelBuscador panelBuscador;
    private PanelProductos panelProductos;

    public Dashboard(String listaProductos) {
        // Configuración básica de la ventana
        this.setTitle("Dashboard Tienda");
        this.setSize(800, 500);
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); // Centrar ventana

        // Inicialización de paneles
        panelBuscador = new PanelBuscador();
        panelProductos = new PanelProductos(listaProductos); // se pasa listaProductos si lo requiere

        // Agregar paneles al layout
        this.add(panelBuscador, BorderLayout.WEST);   // buscador a la izquierda
        this.add(panelProductos, BorderLayout.CENTER); // productos en el centro

        // Mostrar ventana
        this.setVisible(true);
    }
}
