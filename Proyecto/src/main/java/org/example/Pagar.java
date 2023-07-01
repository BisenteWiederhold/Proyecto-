package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pagar extends JFrame {
    public Pagar() {
        setTitle("Pagar");
        setPreferredSize(new Dimension(400, 200));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        JRadioButton opcion1 = new JRadioButton("VISA");
        JRadioButton opcion2 = new JRadioButton("MASTER CARD");
        JRadioButton opcion3 = new JRadioButton("PAYPAL");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(opcion1);
        buttonGroup.add(opcion2);
        buttonGroup.add(opcion3);

        JButton regresarButton = new JButton("Regresar");
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ventana ventana = new Ventana();
                ventana.setVisible(true);
                dispose();
            }
        });

        JButton pagarButton = new JButton("Pagar");
        pagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (opcion1.isSelected()) {
                    JOptionPane.showMessageDialog(Pagar.this, "VISA seleccionada. Realizando pago...");
                    Ventana ventana = new Ventana();
                    ventana.setVisible(true);
                    dispose();
                } else if (opcion2.isSelected()) {
                    JOptionPane.showMessageDialog(Pagar.this, "MASTER CARD seleccionada. Realizando pago...");
                    Ventana ventana = new Ventana();
                    ventana.setVisible(true);
                    dispose();
                } else if (opcion3.isSelected()) {
                    JOptionPane.showMessageDialog(Pagar.this, "PAYPAL seleccionada. Realizando pago...");
                    Ventana ventana = new Ventana();
                    ventana.setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(Pagar.this, "Selecciona una opción antes de pagar.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        panel.add(opcion1);
        panel.add(opcion2);
        panel.add(opcion3);
        panel.add(pagarButton);

        add(panel, BorderLayout.CENTER);
        add(regresarButton, BorderLayout.SOUTH);
        pack();
        setLocationRelativeTo(null);
    }
}
