package org.example;

import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class LaDivisionSintetica {
    public static void main(String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el grado del polinomio:"));
        int[] coeficientes = new int[n + 1];

        for (int i = n; i >= 0; i--) {
            String input = JOptionPane.showInputDialog("Coeficiente x^" + i + ":");
            coeficientes[i] = Integer.parseInt(input);
        }

        int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor 'a' para dividir (x - a):"));

        int[] resultados = new int[n];
        resultados[0] = coeficientes[0];

        for (int i = 1; i < n; i++) {
            resultados[i] = coeficientes[i] + resultados[i - 1] * a;
        }

        StringBuilder resultMessage = new StringBuilder("Resultado de la division sintetica:\n");
        for (int i = 0; i < n; i++) {
            resultMessage.append("Grado ").append(n - i - 1).append(": ").append(resultados[i]).append("\n");
        }
        resultMessage.append("Residuo: ").append(resultados[n - 1]);

        JOptionPane.showMessageDialog(null, resultMessage.toString());
    }


    public static int[] realizarDivision(int[] coeficientes, int dato) {
        return coeficientes;
    }

    public void setVisible(boolean b) {
    }
}

