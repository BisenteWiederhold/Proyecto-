package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ReservarPasajes extends JFrame {
    public ReservarPasajes() {
        setTitle("Reservar Pasajes");
        setPreferredSize(new Dimension(400, 400));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cierra solo esta ventana, no la aplicación completa

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 5, 10, 10)); // 4 filas, 5 columnas, espaciado horizontal y vertical de 10 píxeles

        for (int i = 1; i <= 20; i++) {
            JButton button = new JButton(String.valueOf(i));
            panel.add(button);
        }

        add(panel);
        pack();
        setLocationRelativeTo(null);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Ventana ventana = new Ventana(); // Vuelve a abrir la ventana principal cuando se cierra la ventana de reservar pasajes
                ventana.setVisible(true);
            }
        });
    }
}
