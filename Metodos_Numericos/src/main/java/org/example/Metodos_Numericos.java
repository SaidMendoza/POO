package org.example;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


public class Metodos_Numericos {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        VentanaPrincipal ven1 = new VentanaPrincipal();
        ven1.setVisible(true);


        UIManager.put("OptionPane.background", new Color (229, 5, 159));
        UIManager.put("Panel.background", new Color (229, 5, 159, 223));
        UIManager.put("OptionPane.messageForeground",Color.white);
        ImageIcon icono = new ImageIcon ("Pitufo1.png");
        JOptionPane.showMessageDialog(ven1, "       EQUIPO: \nBLANCO LOVERS \n", "Bienvenida",
                JOptionPane.OK_OPTION, icono);


        UIManager.put("OptionPane.background", Color.black);
        UIManager.put("Panel.background", Color.white);
        UIManager.put("OptionPane.messageForeground",Color.black);
    }
}