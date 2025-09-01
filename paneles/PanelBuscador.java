package paneles;

import javax.swing.*;
import java.awt.*;

public class PanelBuscador extends JPanel {
    
    private JTextField txtBuscar;
    private JButton btnBuscar;

    public PanelBuscador() {
        this.setBackground(Color.LIGHT_GRAY);
        this.setLayout(new FlowLayout());

        JLabel lblBuscar = new JLabel("Buscar producto:");
        txtBuscar = new JTextField(15);
        btnBuscar = new JButton("Buscar");

        this.add(lblBuscar);
        this.add(txtBuscar);
        this.add(btnBuscar);
    }

    // Método para obtener el texto del campo de búsqueda
    public String getTextoBusqueda() {
        return txtBuscar.getText();
    }

    // Método para asignar una acción al botón buscar
    public void setAccionBuscar(Runnable accion) {
        btnBuscar.addActionListener(e -> accion.run());
    }
}
