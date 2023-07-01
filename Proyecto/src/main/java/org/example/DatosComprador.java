package org.example;
import javax.swing.*;
import java.awt.*;

public class DatosComprador extends JFrame {
    private int numeroAsiento;
    private JTextField nombreTextField;
    private JTextField rutTextField;
    private JTextField correoTextField;

    public DatosComprador() {
        setTitle("Datos del Comprador");
        setPreferredSize(new Dimension(400, 300));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(4, 2, 10, 10));

        JLabel nombreLabel = new JLabel("Nombre:");
        nombreTextField = new JTextField();
        nombreTextField.setColumns(15);
        nombreTextField.setFont(nombreTextField.getFont().deriveFont(12f));

        JLabel rutLabel = new JLabel("RUT:");
        rutTextField = new JTextField();
        rutTextField.setColumns(15);
        rutTextField.setFont(rutTextField.getFont().deriveFont(12f));

        JLabel correoLabel = new JLabel("Correo:");
        correoTextField = new JTextField();
        correoTextField.setColumns(15);
        correoTextField.setFont(correoTextField.getFont().deriveFont(12f));

        mainPanel.add(nombreLabel);
        mainPanel.add(nombreTextField);
        mainPanel.add(rutLabel);
        mainPanel.add(rutTextField);
        mainPanel.add(correoLabel);
        mainPanel.add(correoTextField);

        JButton continuarButton = new JButton("Continuar");
        continuarButton.addActionListener(e -> {

            String nombre = nombreTextField.getText();
            String rut = rutTextField.getText();
            String correo = correoTextField.getText();


            Pagar pagar = new Pagar();
            pagar.setVisible(true);
            dispose();
        });

        mainPanel.add(continuarButton);

        add(mainPanel);
        pack();
        setLocationRelativeTo(null);
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }
}
