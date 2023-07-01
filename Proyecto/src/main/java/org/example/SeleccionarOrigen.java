package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * panel para seleccionar origen
 */
public class SeleccionarOrigen extends JFrame {
    private JComboBox<String> comboBox1;
    private JComboBox<String> comboBox2;

    /**
     * constructor para darle las medidas de panel, botones y acciones
     */

    public SeleccionarOrigen() {
        setTitle("Seleccionar Origen");
        setPreferredSize(new Dimension(400, 350));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Cargar la imagen de fondo
        ImageIcon backgroundImage = new ImageIcon("C:\\Users\\vicen\\Desktop\\Proyecto-\\Imagenes\\Fondo.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);

        // Crear el panel principal con el fondo de imagen
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(backgroundLabel, BorderLayout.CENTER);

        JPanel opcionesPanel = new JPanel();
        opcionesPanel.setLayout(new GridLayout(2, 1));

        JLabel label1 = new JLabel("Opción 1:");
        comboBox1 = new JComboBox<>(new String[]{"Puerto Montt", "Valdivia", "Concepción", "Santiago", "Valparaiso"});

        JLabel label2 = new JLabel("Opción 2:");
        comboBox2 = new JComboBox<>(new String[]{"Puerto Montt", "Valdivia", "Concepción", "Santiago", "Valparaiso"});

        opcionesPanel.add(label1);
        opcionesPanel.add(comboBox1);
        opcionesPanel.add(label2);
        opcionesPanel.add(comboBox2);

        JPanel botonPanel = new JPanel();
        botonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton continuarButton = new JButton("Continuar");
        continuarButton.setPreferredSize(new Dimension(100, 30));
        continuarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String origen = (String) comboBox1.getSelectedItem();
                String destino = (String) comboBox2.getSelectedItem();

                if (origen.equals(destino)) {
                    JOptionPane.showMessageDialog(SeleccionarOrigen.this, "El origen y el destino deben ser diferentes", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    SeleccionarBoleto seleccionarBoleto = new SeleccionarBoleto(origen, destino);
                    seleccionarBoleto.setVisible(true);
                    dispose();
                }
            }
        });

        botonPanel.setOpaque(false);
        botonPanel.add(continuarButton);

        panel.add(opcionesPanel, BorderLayout.CENTER);
        panel.add(botonPanel, BorderLayout.SOUTH);

        setContentPane(panel);
        pack();
        setLocationRelativeTo(null);

        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                Ventana ventana = new Ventana();
                ventana.setVisible(true);
            }
        });
    }
}
