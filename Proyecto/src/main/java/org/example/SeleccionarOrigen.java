package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SeleccionarOrigen extends JFrame {
    public SeleccionarOrigen() {
        setTitle("Seleccionar Origen");
        setPreferredSize(new Dimension(400, 350));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        // Cargar la imagen de fondo
        ImageIcon backgroundImage = new ImageIcon("C:\\Users\\vicen\\Desktop\\Proyecto-\\Imagenes\\Fondo.jpg");
        JLabel backgroundLabel = new JLabel(backgroundImage);
        backgroundLabel.setHorizontalAlignment(JLabel.CENTER);

        // Crear el panel principal con el fondo de imagen
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(backgroundLabel, BorderLayout.CENTER);

        JPanel opcionesPanel = new JPanel();
        opcionesPanel.setLayout(new GridLayout(2, 1));

        JLabel label1 = new JLabel("Opción 1:");
        JComboBox<String> comboBox1 = new JComboBox<>(new String[]{"Punta Arenas", "Puerto Montt", "Concepción", "Santiago", "Valparaiso"});

        JLabel label2 = new JLabel("Opción 2:");
        JComboBox<String> comboBox2 = new JComboBox<>(new String[]{"Punta Arenas", "Puerto Montt", "Concepción", "Santiago", "Valparaiso"});

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
                SeleccionarBoleto seleccionarBoleto = new SeleccionarBoleto();
                seleccionarBoleto.setVisible(true);
                dispose();
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
