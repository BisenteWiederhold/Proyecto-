package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

public class DatosComprador extends JFrame {
    private int numeroAsiento;
    private String origen;
    private String destino;
    private Bus bus;
    private int duracionViaje;
    private JTextField nombreTextField;
    private JTextField rutTextField;
    private JTextField correoTextField;

    public DatosComprador(int numeroAsiento, String origen, String destino, Bus bus, int duracionViaje) {
        this.numeroAsiento = numeroAsiento;
        this.origen = origen;
        this.destino = destino;
        this.bus = bus;
        this.duracionViaje = duracionViaje;

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
        continuarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreTextField.getText();
                String rut = rutTextField.getText();
                String correo = correoTextField.getText();

                int precioBase = bus.getPrecio();
                int precioTotal = precioBase;

                if (bus instanceof Normal) {
                    precioTotal += 5000;
                } else if (bus instanceof SalonCama) {
                    precioTotal += 7000;
                }

                if (duracionViaje <= 7) {
                    precioTotal += 2000;
                } else {
                    precioTotal += 4000;
                }

                String horaSalida = obtenerHoraSalida(origen, destino);

                System.out.println("=== Comprobante de compra ===");
                System.out.println("Número de asiento: " + numeroAsiento);
                System.out.println("Origen: " + origen);
                System.out.println("Destino: " + destino);
                System.out.println("Precio total: $" + precioTotal);
                System.out.println("=============================");

                Pagar pagar = new Pagar(precioTotal);
                pagar.setVisible(true);
                dispose();
            }
        });

        mainPanel.add(continuarButton);

        add(mainPanel);
        pack();
        setLocationRelativeTo(null);
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    private String obtenerHoraSalida(String origen, String destino) {
        Map<String, Map<String, String>> horasSalida = new HashMap<>();
        horasSalida.put("puerto montt", crearHorasSalidaPuertoMontt());
        horasSalida.put("santiago", crearHorasSalidaSantiago());
        horasSalida.put("valparaiso", crearHorasSalidaValparaiso());
        horasSalida.put("concepción", crearHorasSalidaConcepcion());
        horasSalida.put("valdivia", crearHorasSalidaValdivia());

        String origenLowerCase = origen.toLowerCase();
        String destinoLowerCase = destino.toLowerCase();

        if (horasSalida.containsKey(origenLowerCase) && horasSalida.get(origenLowerCase).containsKey(destinoLowerCase)) {
            return horasSalida.get(origenLowerCase).get(destinoLowerCase);
        }

        return "Hora no disponible";
    }

    private Map<String, String> crearHorasSalidaPuertoMontt() {
        Map<String, String> horasSalida = new HashMap<>();
        horasSalida.put("santiago", "08:00 AM");
        horasSalida.put("concepción", "08:30 AM");
        horasSalida.put("valdivia", "08:00 AM");
        return horasSalida;
    }

    private Map<String, String> crearHorasSalidaSantiago() {
        Map<String, String> horasSalida = new HashMap<>();
        horasSalida.put("puerto montt", "10:00 AM");
        horasSalida.put("concepción", "10:30 AM");
        horasSalida.put("valdivia", "10:00 AM");
        return horasSalida;
    }

    private Map<String, String> crearHorasSalidaValparaiso() {
        Map<String, String> horasSalida = new HashMap<>();
        horasSalida.put("santiago", "09:00 AM");
        return horasSalida;
    }

    private Map<String, String> crearHorasSalidaConcepcion() {
        Map<String, String> horasSalida = new HashMap<>();
        horasSalida.put("puerto montt", "7:00 AM");
        horasSalida.put("santiago", "7:00 AM");
        return horasSalida;
    }

    private Map<String, String> crearHorasSalidaValdivia() {
        Map<String, String> horasSalida = new HashMap<>();
        horasSalida.put("puerto montt", "16:00 PM");
        horasSalida.put("santiago", "16:30 PM");
        return horasSalida;
    }
}
