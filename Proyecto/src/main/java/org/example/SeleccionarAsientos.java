package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SeleccionarAsientos extends JFrame {
    public SeleccionarAsientos() {
        setTitle("Seleccionar Asientos");
        setPreferredSize(new Dimension(800, 600));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 4, 10, 10));

        for (int fila = 0; fila < 5; fila++) {
            for (int col = 0; col < 4; col++) {
                int numAsientos = fila * 4 + col + 1;


                if (numAsientos <= 20) {
                    JButton button = new JButton(String.valueOf(numAsientos));
                    button.setPreferredSize(new Dimension(30, 30));
                    button.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            Pagar pagar = new Pagar();
                            pagar.setVisible(true);
                        }
                    });


                    button.setBackground(Color.LIGHT_GRAY);
                    button.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY));

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
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                Ventana ventana = new Ventana();
                ventana.setVisible(true);
            }
        });
    }
}
