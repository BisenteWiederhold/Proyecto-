package org.example;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SeleccionarLugar extends JFrame {
    public SeleccionarLugar() {
        setTitle("Seleccionar Lugar");
        setPreferredSize(new Dimension(400, 200));
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 1));

        JLabel label1 = new JLabel("Origen");
        JComboBox<String> comboBox1 = new JComboBox<>(new String[]{"Punta Arenas", "Puerto Montt", "Concepción", "Santiago", "Iquique"});

        JLabel label2 = new JLabel("Destino");
        JComboBox<String> comboBox2 = new JComboBox<>(new String[]{"Punta Arenas", "Puerto Montt", "Concepción", "Santiago", "Iquique"});

        panel.add(label1);
        panel.add(comboBox1);
        panel.add(label2);
        panel.add(comboBox2);

        add(panel);
        pack();
        setLocationRelativeTo(null);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Ventana ventana = new Ventana();
                ventana.setVisible(true);
            }
        });
    }
}
