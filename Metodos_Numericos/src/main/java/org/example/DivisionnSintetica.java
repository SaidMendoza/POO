package org.example;
import java.util.ArrayList;
import static java.lang.Math.*;

public class DivisionnSintetica {
    public static int[] realizarDivision(int[] coeficientes, int divisor) {
        int n = coeficientes.length;
        int[] resultados = new int[n - 1];

        resultados[0] = coeficientes[0];
        for (int i = 1; i < n - 1; i++) {
            resultados[i] = resultados[i - 1] * divisor + coeficientes[i];
        }

        return resultados;
    }
}
