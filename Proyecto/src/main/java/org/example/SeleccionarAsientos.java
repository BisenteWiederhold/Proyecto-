package org.example;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SeleccionarAsientos extends JFrame {
    private static final int NUM_ASIENTOS = 20;
    private static final int FILAS = 5;
    private static final int COLUMNAS = 4;
    private static final int BOTON_WIDTH = 100;
    private static final int BOTON_HEIGHT = 100;

    public SeleccionarAsientos() {
        setTitle("Seleccionar Asientos");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(FILAS, COLUMNAS, 10, 10));

        for (int fila = 0; fila < FILAS; fila++) {
            for (int col = 0; col < COLUMNAS; col++) {
                int numAsientos = fila * COLUMNAS + col + 1;

                if (numAsientos <= NUM_ASIENTOS) {
                    JButton button = new JButton(String.valueOf(numAsientos));
                    button.setPreferredSize(new Dimension(BOTON_WIDTH, BOTON_HEIGHT));

                    Border buttonBorder = BorderFactory.createEmptyBorder();
                    buttonBorder = BorderFactory.createLineBorder(Color.DARK_GRAY, 1);
                    buttonBorder = BorderFactory.createCompoundBorder(buttonBorder, BorderFactory.createEmptyBorder(10, 10, 10, 10));
                    button.setBorder(buttonBorder);

                    button.setBackground(Color.LIGHT_GRAY);

                    button.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            Pagar pagar = new Pagar();
                            pagar.setVisible(true);
                        }
                    });

                    panel.add(button);
                } else {
                    panel.add(new JPanel());
                }

                if (col == 1) {
                    panel.add(new JPanel());
                }
            }
        }

        add(panel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
