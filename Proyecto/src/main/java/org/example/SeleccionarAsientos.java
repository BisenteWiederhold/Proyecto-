package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SeleccionarAsientos extends JFrame {
    private String origen;
    private String destino;
    private Bus bus;
    private int duracionViaje;

    public SeleccionarAsientos(String origen, String destino, Bus bus, int duracionViaje) {
        this.origen = origen;
        this.destino = destino;
        this.bus = bus;
        this.duracionViaje = duracionViaje;

        setTitle("Seleccionar Asiento");
        setPreferredSize(new Dimension(600, 450));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(5, 4, 10, 10));

        String imagePath = "Asientos.png";
        ImageIcon asientoIcon = new ImageIcon(imagePath);

        int numeroAsiento = 1;

        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 4; col++) {
                if (col == 2) {
                    mainPanel.add(Box.createRigidArea(new Dimension(10, 10)));
                }

                if (numeroAsiento <= 20) {
                    JPanel asientoPanel = new JPanel();
                    asientoPanel.setLayout(new BorderLayout());

                    JLabel asientoLabel = new JLabel(asientoIcon);

                    asientoPanel.add(asientoLabel, BorderLayout.CENTER);

                    final int numero = numeroAsiento;
                    asientoPanel.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            SwingUtilities.invokeLater(() -> {
                                DatosComprador datosComprador = new DatosComprador(numero, origen, destino, bus, duracionViaje);
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

        add(mainPanel, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            String origen = "Puerto Montt"; // Reemplaza con el valor correspondiente
            String destino = "Santiago"; // Reemplaza con el valor correspondiente
            Bus bus = new Normal(); // Cambia el tipo de bus según tus necesidades
            int duracionViaje = 6; // Duración del viaje en horas
            SeleccionarAsientos seleccionarAsiento = new SeleccionarAsientos(origen, destino, bus, duracionViaje);
            seleccionarAsiento.setVisible(true);
        });
    }
}
