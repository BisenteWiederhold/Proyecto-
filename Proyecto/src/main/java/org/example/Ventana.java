package org.example;
import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public Ventana() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Buses ETM");
        setPreferredSize(new Dimension(640, 480));

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Image backgroundImage = new ImageIcon("Buses.jpg").getImage();
                g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
            }
        };

        JLabel reservaLabel = new JLabel("Reserva YA!");
        reservaLabel.setFont(new Font("Arial", Font.BOLD, 24));
        reservaLabel.setForeground(Color.BLACK);

        JPanel topPanel = new JPanel();
        topPanel.setOpaque(false);
        topPanel.add(reservaLabel);
        panel.add(topPanel, BorderLayout.NORTH);

        JButton botonReserva = new JButton("Empezar Reserva");
        botonReserva.setPreferredSize(new Dimension(200, 100));
        botonReserva.addActionListener(e -> {
            SeleccionarOrigen seleccionarLugar = new SeleccionarOrigen();
            seleccionarLugar.setVisible(true);
            dispose();
        });

        JButton botonPasajes = new JButton("Ver Pasajes Disponibles");
        botonPasajes.setPreferredSize(new Dimension(200, 100));
        botonPasajes.addActionListener(e -> {
            Informacion info = new Informacion();
            info.setVisible(true);
            dispose();
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.setOpaque(false);
        buttonPanel.add(botonReserva);
        buttonPanel.add(botonPasajes);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        setContentPane(panel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
