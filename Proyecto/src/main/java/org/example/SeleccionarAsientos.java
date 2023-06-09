package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Clase para seleccionar los asientos en el panel
 */

public class SeleccionarAsientos extends JFrame {
    private String origen;
    private String destino;
    private Bus bus;
    private int duracionViaje;

    /**
     *
     * @param origen Para elegir los asientos primero tiene estar seleccionado el origen del viaje
     * @param destino Tambien tiene que estar elegido el destino
     * @param bus el bus tiene que estar seleccionado
     * @param duracionViaje  las horas que dura el viaje
     */

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

    /**
     *
     * @param args para ingresar el destino y origen
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            String origen = "Puerto Montt";
            String destino = "Santiago";
            Bus bus = new Normal();
            int PosibleduracionViaje = 6;
            SeleccionarAsientos seleccionarAsiento = new SeleccionarAsientos(origen, destino, bus, PosibleduracionViaje);
            seleccionarAsiento.setVisible(true);
        });
    }
}