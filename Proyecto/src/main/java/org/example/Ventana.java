package org.example;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Ventana extends JFrame {
    public Ventana() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Buses ETM");
        setPreferredSize(new Dimension(640, 480));

        String imagePath = "C:\\Users\\vicen\\Desktop\\Proyecto-\\Imagenes\\Buses.jpg";

        File imageFile = new File(imagePath);
        if (!imageFile.exists()) {
            System.out.println("La imagen de fondo no existe");
        } else {
            ImageIcon backgroundImage = new ImageIcon(imagePath);
            JLabel backgroundLabel = new JLabel(backgroundImage);

            JPanel panel = new JPanel();
            panel.setLayout(new BorderLayout());
            panel.add(backgroundLabel, BorderLayout.CENTER);

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
                SeleccionarAsientos seleccionarAsientos = new SeleccionarAsientos();
                seleccionarAsientos.setVisible(true);
                dispose();
            });

            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new FlowLayout());
            buttonPanel.setOpaque(false);
            buttonPanel.add(botonReserva);
            buttonPanel.add(botonPasajes);

            panel.add(buttonPanel, BorderLayout.SOUTH);

            add(panel);
        }

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Ventana::new);
    }
}
