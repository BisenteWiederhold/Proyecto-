package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SeleccionarTipoDeBus extends JFrame {
    public SeleccionarTipoDeBus() {
        setTitle("Seleccionar Tipo de Bus");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setPreferredSize(new Dimension(400, 300));

        JLabel titleLabel = new JLabel("Seleccionar Tipo de Bus");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));

        JButton salonCamaButton = new JButton("Salón Cama");
        salonCamaButton.setPreferredSize(new Dimension(200, 50));
        salonCamaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SeleccionarBoleto seleccionarBoleto = new SeleccionarBoleto();
                seleccionarBoleto.setVisible(true);
                dispose();
            }
        });

        JButton semiCamaButton = new JButton("Semi Cama");
        semiCamaButton.setPreferredSize(new Dimension(200, 50));
        semiCamaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SeleccionarBoleto seleccionarBoleto = new SeleccionarBoleto();
                seleccionarBoleto.setVisible(true);
                dispose();
            }
        });

        panel.add(salonCamaButton);
        panel.add(semiCamaButton);

        add(titleLabel, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SeleccionarTipoDeBus seleccionTipoDeBus = new SeleccionarTipoDeBus();
            seleccionTipoDeBus.setVisible(true);
        });
    }
}
