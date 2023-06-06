package org.example;

import org.example.controlador.ControladorRL;
import org.example.modelo.RocketLeague;
import org.example.persistencia.RLDAO;
import org.example.vista.VentanaRL;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Inicia Programa!!");
        VentanaRL view = new VentanaRL("Rocket League");
        ControladorRL controller = new ControladorRL(view);
    }
}