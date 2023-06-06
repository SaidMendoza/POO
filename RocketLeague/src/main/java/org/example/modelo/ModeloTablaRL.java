package org.example.modelo;

import org.example.persistencia.RLDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaRL implements TableModel {
    private ArrayList<RocketLeague> datos;
    public static final int COLS = 6;
    private RLDAO rldao;


    public ModeloTablaRL() {
        datos = new ArrayList<>();
        rldao = new RLDAO();

    }

    public ModeloTablaRL(ArrayList<RocketLeague> datos) {
        this.datos = datos;
        rldao = new RLDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String nombreCOl = "";
        switch (columnIndex){
            case 0:
                nombreCOl = "Id";
                break;
            case 1:
                nombreCOl = "Gamertag";
                break;
            case 2:
                nombreCOl = "Club";
                break;
            case 3:
                nombreCOl = "Auto";
                break;
            case 4:
                nombreCOl = "Liga";
                break;
            case 5:
                nombreCOl = "Foto";
                break;
            default:
                nombreCOl = "";

        }
        return nombreCOl;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return int.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
            default:
                return String.class;

        }
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        if (columnIndex > 0) {
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        RocketLeague tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getGamertag();
            case 2:
                return tmp.getClub();
            case 3:
                return tmp.getAuto();
            case 4:
                return tmp.getLiga();
            case 5:
                return tmp.getFoto();

        }
        return null;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                datos.get(rowIndex).setId( (int) aValue);
                break;
            case 1:
                datos.get(rowIndex).setGamertag( (String) aValue);
                break;
            case 2:
                datos.get(rowIndex).setClub( (String) aValue);
                break;
            case 3:
                datos.get(rowIndex).setAuto( (String) aValue);
                break;
            case 4:
                datos.get(rowIndex).setLiga( (String) aValue);
                break;
            case 5:
                datos.get(rowIndex).setFoto( (String) aValue);
                break;
            default:
                System.out.println("No hay modificaciones");
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    public boolean agregarRL(RocketLeague rl){
        boolean resultado = false;
        try {
            if (rldao.insertar(rl)) {
                datos.add(rl);
                resultado = true;
            } else {
                resultado = false;
            }
        } catch (SQLException | MalformedURLException sqle) {
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }
    public RocketLeague getRlAtIndex(int idx){
        return datos.get(idx);
    }
    public void cargarDatos(){
        try{
            ArrayList<RocketLeague> tirar = rldao.obtenerTodo();
            System.out.println(tirar);
            datos = rldao.obtenerTodo();
        }catch (SQLException sqle){
            System.out.println("Error");
        }
    }
    public boolean modDatos (RocketLeague per) throws SQLException{
        boolean res = false;
        try {
            if (rldao.update(per)){
                datos.add(per);
                res = true;
            }else{
                res = false;
            }
        }catch (SQLException | MalformedURLException sqle){
            System.out.println(sqle.getMessage());
        }
        return res;
    }
    public boolean delDatos (String id){
        boolean res = false;
        try {
            if (rldao.delete(id))
            {
                res = true;
            }else{
                res = false;
            }
        }catch (SQLException | MalformedURLException sqle){
            System.out.println(sqle.getMessage());
        }
        return res;
    }
}
