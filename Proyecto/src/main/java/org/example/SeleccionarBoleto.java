package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SeleccionarBoleto extends JFrame {
    public SeleccionarBoleto() {
        setTitle("Seleccionar Boleto");
        setPreferredSize(new Dimension(400, 300));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));

        for (int i = 1; i <= 6; i++) {
            JLabel label = new JLabel("Boleto + hora  " + i);

            JButton comprarButton = new JButton("Seleccionar");
            comprarButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    SeleccionarTipoDeBus seleccionarTipoDeBus = new  SeleccionarTipoDeBus();
                    seleccionarTipoDeBus.setVisible(true);
                    dispose();
                }
            });

            panel.add(label);
            panel.add(comprarButton);
        }

        add(panel);
        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new SeleccionarBoleto().setVisible(true));
    }
}
