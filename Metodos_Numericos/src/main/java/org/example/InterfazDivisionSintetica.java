package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazDivisionSintetica extends JFrame {
    private JTextField gradoField;
    private JTextField coeficientesField;
    private JTextField divisorField;
    private JTextArea resultadosArea;

    public InterfazDivisionSintetica() {
        setTitle("Division Sintetica");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel gradoLabel = new JLabel("Grado del Polinomio:");
        gradoField = new JTextField(10);

        JLabel coeficientesLabel = new JLabel("Coeficientes (separados por comas):");
        coeficientesField = new JTextField(20);

        JLabel divisorLabel = new JLabel("Divisor:");
        divisorField = new JTextField(10);

        JButton calcularButton = new JButton("Calcular");
        resultadosArea = new JTextArea(10, 30);
        resultadosArea.setEditable(false);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularDivisionSintetica();
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 1));
        panel.add(gradoLabel);
        panel.add(gradoField);
        panel.add(coeficientesLabel);
        panel.add(coeficientesField);
        panel.add(divisorLabel);
        panel.add(divisorField);

        add(panel, BorderLayout.NORTH);
        add(calcularButton, BorderLayout.CENTER);
        add(new JScrollPane(resultadosArea), BorderLayout.SOUTH);
    }

    private void calcularDivisionSintetica() {
        try {
            int grado = Integer.parseInt(gradoField.getText());
            String coeficientesStr = coeficientesField.getText();
            String[] coeficientesArray = coeficientesStr.split(",");
            if (coeficientesArray.length != grado + 1) {
                JOptionPane.showMessageDialog(this, "Ingresa el numero correcto de coeficientes.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            int[] coeficientes = new int[coeficientesArray.length];
            for (int i = 0; i < coeficientesArray.length; i++) {
                coeficientes[i] = Integer.parseInt(coeficientesArray[i].trim());
            }

            int divisor = Integer.parseInt(divisorField.getText());

            int[] resultados = DivisionnSintetica.realizarDivision(coeficientes, divisor);

            int residuo = resultados[resultados.length - 1];

            resultadosArea.setText("Resultados de la División Sintetica:\n");
            for (int i = 0; i < resultados.length - 1; i++) {
                resultadosArea.append("Resultado " + (i + 1) + ": " + resultados[i] + "x^" + (resultados.length - i - 2) + "\n");
            }
            resultadosArea.append("Residuo: " + residuo);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingresa valores numericos validos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new InterfazDivisionSintetica().setVisible(true);
            }
        });
    }
}
