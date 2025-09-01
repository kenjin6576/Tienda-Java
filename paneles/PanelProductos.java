package paneles;

import javax.swing.*;
import java.awt.*;
import modulos.ModulosProducto;

public class PanelProductos extends JPanel {

    // Constructor por defecto: muestra productos de ejemplo
    public PanelProductos() {
        inicializarEjemplo();
    }

    // Constructor con parámetro (aún no lo usas)
    public PanelProductos(String listaProductos) {
        inicializarEjemplo();
        // Aquí podrías parsear listaProductos para crear productos dinámicamente
    }

    // Inicializa con productos de ejemplo
    private void inicializarEjemplo() {
        this.setLayout(new GridLayout(2, 4, 10, 10));
        this.setBackground(Color.WHITE);

        this.add(new ModulosProducto("Licuadora", "Q500"));
        this.add(new ModulosProducto("Batidora", "Q350"));
        this.add(new ModulosProducto("Plancha", "Q250"));
        this.add(new ModulosProducto("Cafetera", "Q450"));
        this.add(new ModulosProducto("Tostadora", "Q300"));
        this.add(new ModulosProducto("Microondas", "Q1200"));
        this.add(new ModulosProducto("Refrigeradora", "Q5000"));
        this.add(new ModulosProducto("Ventilador", "Q400"));
    }

    // Método para actualizar productos dinámicamente
    public void mostrarProductos(ModulosProducto[] productos) {
        this.removeAll();

        // Ajusta el GridLayout en función de la cantidad de productos
        int filas = (int) Math.ceil(productos.length / 4.0);
        this.setLayout(new GridLayout(filas, 4, 10, 10));

        for (ModulosProducto p : productos) {
            this.add(p);
        }

        this.revalidate();
        this.repaint();
    }

    // Método de prueba
    public static void main(String[] args) {
        JFrame frame = new JFrame("Catálogo de Productos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new PanelProductos());
        frame.setSize(900, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
