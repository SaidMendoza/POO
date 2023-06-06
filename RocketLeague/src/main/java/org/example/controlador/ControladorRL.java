package org.example.controlador;

import org.example.modelo.ModeloTablaRL;
import org.example.modelo.RocketLeague;
import org.example.vista.VentanaRL;

import javax.imageio.stream.ImageOutputStreamImpl;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.sql.SQLException;

public class ControladorRL extends MouseAdapter {
    private VentanaRL view;
    private ModeloTablaRL modelo;

    public ControladorRL(VentanaRL view) {
        this.view = view;
        modelo = new ModeloTablaRL();
        this.view.getBotonAdd().addMouseListener(this);
        this.view.getTabla().addMouseListener(this);
        this.view.getBtnBorrar().addMouseListener(this);
        this.view.getBtnModificar().addMouseListener(this);
        this.view.getTabla().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == this.view.getBtnCargar()) {
            modelo = new ModeloTablaRL();
            modelo.cargarDatos();
            this.view.getTabla().setModel(modelo);
            this.view.getTabla().updateUI();
        }
        if (e.getSource() == this.view.getBotonAdd()) {
            System.out.println("Evento sobre boton add");
            RocketLeague rl = new RocketLeague();
            try {
                rl.setId(Integer.parseInt(this.view.getTxtId().getText()));
                rl.setGamertag(this.view.getTxtGamertag().getText());
                rl.setClub(this.view.getTxtClub().getText());
                rl.setAuto(this.view.getTxtAuto().getText());
                rl.setLiga(this.view.getTxtLiga().getText());
                rl.setFoto(this.view.getTxtFoto().getText());
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(view, "Ingresa un Id correcto (Solo numeros)", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
            if (modelo.agregarRL(rl)) {
                JOptionPane.showMessageDialog(view, "Se agrego correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(view, "No se agrego, comprueba tus datos / url invalido", "Error", JOptionPane.ERROR_MESSAGE);
            }
            this.view.getTabla().updateUI();
            this.view.limpiar();
        }
        if (e.getSource() == view.getTabla()) {
            System.out.println("Evento sobre tabla add");
            int index = this.view.getTabla().getSelectedRow();
            RocketLeague tmp = modelo.getRlAtIndex(index);
            try {
                this.view.getImagenRL().setIcon(tmp.getImagen());
                this.view.getImagenRL().setText("");
            } catch (MalformedURLException mfue) {
                System.out.println(e.toString());
            }
        }
        if (e.getSource() == view.getBtnBorrar()){
            if (this.view.getTabla().getSelectedRow() >= 0){
                int res = JOptionPane.showConfirmDialog(view, "Estás seguro de elmininar registro?", "Eliminar", JOptionPane.YES_NO_OPTION);
                if (res == JOptionPane.YES_NO_OPTION){
                    ModeloTablaRL temp = new ModeloTablaRL();
                    int index = this.view.getTabla().getSelectedRow();
                    RocketLeague tmpp = modelo.getRlAtIndex(index);
                    temp.delDatos(Integer.toString(tmpp.getId()));
                    modelo.cargarDatos();
                    this.view.getTabla().updateUI();
                    this.view.limpiar();
                    JOptionPane.showMessageDialog(view, "Registro Eliminado", "Eliminar", JOptionPane.OK_OPTION);
                }
            }else{
                JOptionPane.showMessageDialog(view, "Seleccione un registro","No Selected", JOptionPane.WARNING_MESSAGE );
            }
            this.view.limpiar();
        }

        if (e.getSource() == this.view.getTabla()){
            int index = this.view.getTabla().getSelectedRow();
            RocketLeague tmp = modelo.getRlAtIndex(index);
            this.view.getTxtGamertag().setText(tmp.getGamertag());
            this.view.getTxtClub().setText(tmp.getClub());
            this.view.getTxtAuto().setText(tmp.getAuto());
            this.view.getTxtLiga().setText(tmp.getLiga());
            this.view.getTxtFoto().setText(tmp.getFoto());

            this.view.getLblregistroselec().setText("Seleccionaste el registro #" + tmp.getId());
        }
        if (e.getSource() == view.getBtnModificar()) {
            int index = this.view.getTabla().getSelectedRow();
            RocketLeague tmp = modelo.getRlAtIndex(index);
            RocketLeague rlll = new RocketLeague();
            String gamertag = this.view.getTxtGamertag().getText();
            String club = this.view.getTxtClub().getText();
            String auto = this.view.getTxtAuto().getText();
            String liga = this.view.getTxtLiga().getText();
            String foto = this.view.getTxtFoto().getText();

            // Verificar si algún campo está vacío
            if (gamertag.isEmpty() || club.isEmpty() || auto.isEmpty() || liga.isEmpty() || foto.isEmpty()) {
                JOptionPane.showMessageDialog(view, "Todos los campos deben ser llenados", "Aviso", JOptionPane.ERROR_MESSAGE);
            } else {
                try {

                    rlll.setId(tmp.getId());
                    rlll.setGamertag(this.view.getTxtGamertag().getText());
                    rlll.setClub(this.view.getTxtClub().getText());
                    rlll.setAuto(this.view.getTxtAuto().getText());
                    rlll.setLiga(this.view.getTxtLiga().getText());
                    rlll.setFoto(this.view.getTxtFoto().getText());

                    if (modelo.modDatos(rlll)) {
                        JOptionPane.showMessageDialog(view, "Modificado correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                        modelo.cargarDatos();
                        this.view.getTabla().setModel(modelo);
                        this.view.getTabla().updateUI();
                        modelo.cargarDatos();
                    } else {
                        JOptionPane.showMessageDialog(view, "Algo fallo", "Aviso", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (SQLException ex) {
                    throw new RuntimeException(ex);
                }
                this.view.getTabla().updateUI();
                this.view.limpiar();
            }
        }
    }

}
