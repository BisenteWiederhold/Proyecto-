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
        panel.setLayout(new GridLayout(3, 1));

        JButton boton1 = new JButton("Reservar Pasajes");
        JButton boton2 = new JButton("Seleccionar Lugar");
        JButton boton3 = new JButton("Pagar");

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ReservarPasajes ventanaNueva = new ReservarPasajes();
                ventanaNueva.setVisible(true);
                dispose();
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SeleccionarLugar ventanaNueva2 = new SeleccionarLugar();
                ventanaNueva2.setVisible(true);
            }
        });

        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        panel.add(boton1);
        panel.add(boton2);
        panel.add(boton3);

        add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Ventana());
    }
}
