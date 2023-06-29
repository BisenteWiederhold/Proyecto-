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

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

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
                SeleccionarTipoDeBus seleccionarBoleto = new SeleccionarTipoDeBus();
                seleccionarBoleto.setVisible(true);
                dispose(); // Cierra la ventana actual
            }
        });


        botonPanel.add(continuarButton);

        panel.add(opcionesPanel, BorderLayout.CENTER);
        panel.add(botonPanel, BorderLayout.SOUTH);

        add(panel);
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
