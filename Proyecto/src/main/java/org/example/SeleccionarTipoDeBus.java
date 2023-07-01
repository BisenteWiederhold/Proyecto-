package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SeleccionarTipoDeBus extends JFrame {
    public SeleccionarTipoDeBus() {
        setTitle("Seleccionar Tipo de Bus");
        setPreferredSize(new Dimension(400, 350));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1, 10, 10));

        JLabel label = new JLabel("Seleccione el tipo de bus:");
        panel.add(label);

        JButton botonSemiCama = new JButton("Semi Cama");
        botonSemiCama.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SeleccionarAsientos seleccionarAsientos = new SeleccionarAsientos();
                seleccionarAsientos.setVisible(true);
                dispose(); // Cierra la ventana actual
            }
        });
        panel.add(botonSemiCama);

        JButton botonSalonCama = new JButton("Salón Cama");
        botonSalonCama.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SeleccionarAsientos seleccionarAsientos = new SeleccionarAsientos();
                seleccionarAsientos.setVisible(true);
                dispose(); // Cierra la ventana actual
            }
        });
        panel.add(botonSalonCama);

        setContentPane(panel);
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                SeleccionarTipoDeBus seleccionarTipodeBus = new SeleccionarTipoDeBus();
                seleccionarTipodeBus.setVisible(true);
            }
        });
    }
}
