package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

/**
 * Clase para seleccionar boleto en el panel
 */
public class SeleccionarBoleto extends JFrame {
    private JComboBox<String> comboBox;
    private JLabel precioLabel;

    /**
     *
     * @param origen En el panel se elige el origen
     * @param destino En el panel se elige el destino
     */

    public SeleccionarBoleto(String origen, String destino) {
        setTitle("Seleccionar Boleto");
        setPreferredSize(new Dimension(400, 250));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel opcionesPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        opcionesPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel origenLabel = new JLabel("Origen: " + origen);
        JLabel destinoLabel = new JLabel("Destino: " + destino);
        opcionesPanel.add(new JLabel(" "));
        opcionesPanel.add(new JLabel(" "));
        opcionesPanel.add(origenLabel);
        opcionesPanel.add(destinoLabel);
        JLabel horaSalidaLabel = new JLabel("Hora de salida: " + obtenerHoraSalida(origen, destino));
        opcionesPanel.add(horaSalidaLabel);

        JPanel boletoPanel = new JPanel(new BorderLayout());
        boletoPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JLabel boletoLabel = new JLabel("Seleccionar tipo de boleto:");
        comboBox = new JComboBox<>(new String[]{"Normal", "SalonCama"});
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tipoBoleto = (String) comboBox.getSelectedItem();
                int precio = obtenerPrecioBoleto(tipoBoleto);
                precioLabel.setText("Precio: $" + precio);
            }
        });

        precioLabel = new JLabel("Precio: $");

        boletoPanel.add(boletoLabel, BorderLayout.NORTH);
        boletoPanel.add(comboBox, BorderLayout.CENTER);
        boletoPanel.add(precioLabel, BorderLayout.EAST);

        JPanel botonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        botonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JButton continuarButton = new JButton("Continuar");
        continuarButton.setPreferredSize(new Dimension(100, 30));
        continuarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tipoBoleto = (String) comboBox.getSelectedItem();
                int precio = obtenerPrecioBoleto(tipoBoleto);

                Bus bus;
                if (tipoBoleto.equals("Normal")) {
                    bus = new Normal();
                } else {
                    bus = new SalonCama();
                }


                SeleccionarAsientos seleccionarAsientos = new SeleccionarAsientos(origen, destino, bus, precio);
                seleccionarAsientos.setVisible(true);


                dispose();
            }
        });

        botonPanel.add(continuarButton);

        panel.add(opcionesPanel, BorderLayout.NORTH);
        panel.add(boletoPanel, BorderLayout.CENTER);
        panel.add(botonPanel, BorderLayout.SOUTH);

        setContentPane(panel);
        pack();
        setLocationRelativeTo(null);
    }

    /**
     *
     * @param tipoBoleto detecta si es normal o salon cama
     * @return retrona el precio dependiendo del tipo de bus
     */

    private int obtenerPrecioBoleto(String tipoBoleto) {
        if (tipoBoleto.equals("Normal")) {
            return new Normal().getPrecio();
        } else if (tipoBoleto.equals("SalonCama")) {
            return new SalonCama().getPrecio();
        }
        return 0;
    }

    /**
     *
     * @param origen ingresa el origen del viaje
     * @param destino ingresa el destino del viaje
     * @return retorna si no hay hora o la hora de salida
     */

    private String obtenerHoraSalida(String origen, String destino) {
        Map<String, Map<String, String>> horasSalida = new HashMap<>();
        horasSalida.put("Puerto Montt", crearHorasSalidaPuertoMontt());
        horasSalida.put("Santiago", crearHorasSalidaSantiago());

        if (horasSalida.containsKey(origen) && horasSalida.get(origen).containsKey(destino)) {
            return horasSalida.get(origen).get(destino);
        }

        return "Hora no disponible";
    }

    /**
     *
     * @return retrona hora de salida
     */

    private Map<String, String> crearHorasSalidaPuertoMontt() {
        Map<String, String> horasSalida = new HashMap<>();
        horasSalida.put("Santiago", "08:00 AM");
        horasSalida.put("Concepción", "09:30 AM");
        return horasSalida;
    }

    /**
     *
     * @return retorna la salida
     */

    private Map<String, String> crearHorasSalidaSantiago() {
        Map<String, String> horasSalida = new HashMap<>();
        horasSalida.put("Puerto Montt", "10:00 AM");
        horasSalida.put("Concepción", "11:30 AM");
        return horasSalida;
    }

}
