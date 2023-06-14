package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {
    public Ventana() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Reserva de Pasajes");
        setPreferredSize(new Dimension(640, 480));

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setLayout(new GridLayout(2, 1)); // 2 filas, 1 columna

        JButton boton1 = new JButton("Reservar");
        JButton boton2 = new JButton("Ver Boletos Disponibles");

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SeleccionarOrigen seleccionarLugar = new SeleccionarOrigen();
                seleccionarLugar.setVisible(true);
                dispose(); // Cierra la ventana actual

            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SeleccionarAsientos reservarPasajes = new SeleccionarAsientos();
                reservarPasajes.setVisible(true);
                dispose(); // Cierra la ventana actual
            }
        });

        panel.add(boton1);
        panel.add(boton2);

        add(panel);
        pack();
        setLocationRelativeTo(null);

    }
}

