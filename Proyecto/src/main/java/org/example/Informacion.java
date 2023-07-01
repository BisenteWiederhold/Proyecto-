package org.example;
import javax.swing.*;
import java.awt.*;

/**
 *  Clase para ver en el panel las disponiblidades de pasajes
 */
public class Informacion extends JFrame {
    /**
     * Secrean las dimensiones de los frames y sus respectivos mensajes o info que debe tener
     */
    public Informacion() {
        setTitle("Información");
        setPreferredSize(new Dimension(1000, 800));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel textPanel = new JPanel();
        textPanel.setLayout(new GridLayout(3, 1));

        JLabel tipoBusesLabel = new JLabel("Tipo de buses: Semi cama, Salón cama");
        tipoBusesLabel.setHorizontalAlignment(JLabel.CENTER);

        JLabel salidaLabel = new JLabel("Horas de Salida: 07:00 AM, 08:00 AM, 10:00 AM, 16:00 PM");
        salidaLabel.setHorizontalAlignment(JLabel.CENTER);

        JLabel diasLabel = new JLabel("Días Disponibles: Lunes, Miércoles, Viernes");
        diasLabel.setHorizontalAlignment(JLabel.CENTER);

        JLabel PreciosELabel = new JLabel("Precios bus estandar: 14.000 $");
        PreciosELabel.setHorizontalAlignment(JLabel.CENTER);

        JLabel PreciosSLabel = new JLabel("Precios bus Salon Cama: 18.000 $");
        PreciosSLabel.setHorizontalAlignment(JLabel.CENTER);

        textPanel.add(tipoBusesLabel);
        textPanel.add(salidaLabel);
        textPanel.add(diasLabel);
        textPanel.add(PreciosELabel);
        textPanel.add(PreciosSLabel);

        JPanel asientosPanel = new JPanel();
        asientosPanel.setLayout(new GridLayout(5, 5, 5, 10));

        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 5; col++) {
                if (col != 2) {
                    JPanel asiento = new JPanel();
                    asiento.setPreferredSize(new Dimension(60, 60));

                    ImageIcon asientoIcon = new ImageIcon("Asientos.png");
                    JLabel asientoLabel = new JLabel(asientoIcon);
                    asiento.add(asientoLabel);
                    asientosPanel.add(asiento);
                } else {
                    asientosPanel.add(new JLabel());
                }
            }
        }

        JButton volverButton = new JButton("Volver");
        volverButton.addActionListener(e -> {
            Ventana ventana = new Ventana();
            ventana.setVisible(true);
            dispose();
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(volverButton);

        mainPanel.add(textPanel, BorderLayout.NORTH);
        mainPanel.add(asientosPanel, BorderLayout.CENTER);
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);

        add(mainPanel);
        pack();
        setLocationRelativeTo(null);
    }

}
