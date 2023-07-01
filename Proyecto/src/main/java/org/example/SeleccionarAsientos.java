package org.example;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class SeleccionarAsientos extends JFrame {
    public SeleccionarAsientos() {
        setTitle("Seleccionar Asiento");
        setPreferredSize(new Dimension(600, 450));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(5, 4, 10, 10));

        try {
            BufferedImage asientoImage = ImageIO.read(getClass().getClassLoader().getResource("Asientos.png"));

            int numeroAsiento = 1;

            for (int fila = 0; fila < 5; fila++) {
                for (int col = 0; col < 4; col++) {
                    if (col == 2) {
                        mainPanel.add(Box.createRigidArea(new Dimension(10, 10)));
                    }

                    if (numeroAsiento <= 20) {
                        JPanel asientoPanel = new JPanel();
                        asientoPanel.setLayout(new BorderLayout());

                        ImageIcon asientoIcon = new ImageIcon(asientoImage);
                        JLabel asientoLabel = new JLabel(asientoIcon);

                        asientoPanel.add(asientoLabel, BorderLayout.CENTER);

                        final int numero = numeroAsiento;
                        asientoPanel.addMouseListener(new MouseAdapter() {
                            @Override
                            public void mouseClicked(MouseEvent e) {
                                SwingUtilities.invokeLater(() -> {
                                    DatosComprador datosComprador = new DatosComprador();
                                    datosComprador.setNumeroAsiento(numero);
                                    datosComprador.setVisible(true);
                                    dispose();
                                });
                            }
                        });

                        mainPanel.add(asientoPanel);
                        numeroAsiento++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        add(mainPanel, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SeleccionarAsientos seleccionarAsiento = new SeleccionarAsientos();
            seleccionarAsiento.setVisible(true);
        });
    }
}
