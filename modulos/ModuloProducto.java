package modulos;

import javax.swing.*;
import java.awt.*;

public class ModuloProducto extends JPanel {
    
    private JLabel lblTitulo;
    private JLabel lblNombre;
    private JLabel lblPrecio;
    private JPanel cuadro; // para imagen

    public ModuloProducto(String nombre, String precio) {
        // Configuración general del panel
        this.setLayout(new BorderLayout());
        this.setBackground(Color.LIGHT_GRAY);
        this.setPreferredSize(new Dimension(200, 150));
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // Título arriba
        lblTitulo = new JLabel("Producto", SwingConstants.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 14));
        this.add(lblTitulo, BorderLayout.NORTH);

        // Centro (espacio para imagen o cuadro gris)
        cuadro = new JPanel();
        cuadro.setBackground(Color.GRAY);
        this.add(cuadro, BorderLayout.CENTER);

        // Parte inferior con nombre y precio
        JPanel panelInferior = new JPanel(new BorderLayout());
        lblNombre = new JLabel(nombre);
        lblPrecio = new JLabel(precio);
        lblPrecio.setFont(new Font("Arial", Font.BOLD, 12));

        panelInferior.add(lblNombre, BorderLayout.WEST);
        panelInferior.add(lblPrecio, BorderLayout.EAST);
        this.add(panelInferior, BorderLayout.SOUTH);
    }

    // --- Métodos útiles ---
    public void setNombre(String nombre) {
        lblNombre.setText(nombre);
    }

    public void setPrecio(String precio) {
        lblPrecio.setText(precio);
    }

    public String getNombre() {
        return lblNombre.getText();
    }

    public String getPrecio() {
        return lblPrecio.getText();
    }

    public void setImagen(Icon icon) {
        cuadro.removeAll();
        JLabel lblImagen = new JLabel(icon, SwingConstants.CENTER);
        cuadro.add(lblImagen);
        this.revalidate();
        this.repaint();
    }

    // Método de prueba
    public static void main(String[] args) {
        JFrame frame = new JFrame("Catálogo");
        frame.setLayout(new GridLayout(2, 4, 10, 10));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear 8 productos de ejemplo
        for (int i = 1; i <= 8; i++) {
            frame.add(new ModuloProducto("Producto " + i, "Q" + (i * 100)));
        }

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
