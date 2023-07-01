package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Crea la pantalla final
 */

public class PantallaFinal extends JFrame {
    /**
     * El construvor crea las dimensiones del panel y que se pueda salir o volver
     */
    public PantallaFinal() {
        setTitle("Pantalla Final");
        setPreferredSize(new Dimension(400, 200));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JLabel mensajeLabel = new JLabel("Gracias por preferirnos");
        mensajeLabel.setFont(new Font("Arial", Font.BOLD, 20));
        mensajeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mainPanel.add(mensajeLabel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        JButton salirButton = new JButton("Salir");
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        buttonPanel.add(salirButton);

        JButton volverButton = new JButton("Volver al inicio");
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ventana ventana = new Ventana();
                ventana.setVisible(true);
                dispose(); // esto cierra la ventana actual
            }
        });
        buttonPanel.add(volverButton);

        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(mainPanel);
        pack();
        setLocationRelativeTo(null);
    }
}
