package org.example.vista;

import org.example.modelo.ModeloTablaRL;
import org.example.modelo.RocketLeague;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class VentanaRL extends JFrame {
    private JLabel lblId;
    private JLabel lblGamertag;
    private JLabel lblClub;
    private JLabel lblAuto;
    private JLabel lblLiga;
    private JLabel lblFoto;
    private JTextField txtId;
    private JTextField txtGamertag;
    private JTextField txtClub;
    private JTextField txtAuto;
    private JTextField txtLiga;
    private JTextField txtFoto;
    private JButton botonAdd;
    private JTable tabla;
    private JScrollPane scroll;
    private GridLayout layout;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JLabel imagenRL;
    private JButton  btnCargar;
    private JLabel lblregistroselec;
    private JButton  btnBorrar;
    private JButton btnModificar;
    private ModeloTablaRL modelo;
    private ArrayList<RocketLeague> info;

    public VentanaRL(String title) throws HeadlessException {
        super(title);
        this.setSize(1000,800);
        layout = new GridLayout(2,2);
        this.getContentPane().setLayout(layout);

        //Panel 1
        panel1 = new JPanel(new FlowLayout());
        panel1.setBackground(Color.lightGray);
        lblId = new JLabel("Id:");
        lblGamertag = new JLabel("Gamertag:");
        lblClub = new JLabel("Club:");
        lblAuto = new JLabel("Auto:");
        lblLiga = new JLabel("Liga:");
        lblFoto = new JLabel("Foto:");
        txtId = new JTextField(44);
        txtGamertag = new JTextField(40);
        txtClub = new JTextField(43);
        txtAuto = new JTextField(43);
        txtLiga = new JTextField(43);
        txtFoto = new JTextField(43);
        panel1.add(lblId);
        panel1.add(txtId);
        panel1.add(lblGamertag);
        panel1.add(txtGamertag);
        panel1.add(lblClub);
        panel1.add(txtClub);
        panel1.add(lblAuto);
        panel1.add(txtAuto);
        panel1.add(lblLiga);
        panel1.add(txtLiga);
        panel1.add(lblFoto);
        panel1.add(txtFoto);
        botonAdd = new JButton("Agregar");
        panel1.add(botonAdd);


        //Panel 2
        panel2 = new JPanel(new FlowLayout());
        panel2.setBackground(Color.darkGray);
        info = new ArrayList<>();
        modelo = new ModeloTablaRL(info);
        btnCargar = new JButton("Cargar");
        panel2.add(btnCargar);
        tabla = new JTable(modelo);
        scroll = new JScrollPane(tabla);
        panel2.add(scroll);


        //Panel 3
        panel3 = new JPanel(new FlowLayout());
        panel3.setBackground(Color.gray);
        imagenRL = new JLabel("Visualizacion Modelo Auto");
        panel3.add(imagenRL);

        //Panel 4
        panel4 = new JPanel(new FlowLayout());
        panel4.setBackground(Color.PINK);
        btnBorrar = new JButton("Borrar");
        panel4.add(btnBorrar);
        lblregistroselec = new JLabel("Haz selecccionado: ");
        panel4.add(lblregistroselec);
        btnModificar = new JButton("Modificar");
        panel4.add(btnModificar);



        this.getContentPane().add(panel1,0);
        this.getContentPane().add(panel2,1);
        this.getContentPane().add(panel3,2);
        this.getContentPane().add(panel4,3);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public JLabel getLblId() {
        return lblId;
    }

    public void setLblId(JLabel lblId) {
        this.lblId = lblId;
    }

    public JLabel getLblGamertag() {
        return lblGamertag;
    }

    public void setLblGamertag(JLabel lblGamertag) {
        this.lblGamertag = lblGamertag;
    }

    public JLabel getLblClub() {
        return lblClub;
    }

    public void setLblClub(JLabel lblClub) {
        this.lblClub = lblClub;
    }

    public JLabel getLblAuto() {
        return lblAuto;
    }

    public void setLblAuto(JLabel lblAuto) {
        this.lblAuto = lblAuto;
    }

    public JLabel getLblLiga() {
        return lblLiga;
    }

    public void setLblLiga(JLabel lblLiga) {
        this.lblLiga = lblLiga;
    }

    public JLabel getLblFoto() {
        return lblFoto;
    }

    public void setLblFoto(JLabel lblFoto) {
        this.lblFoto = lblFoto;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public void setTxtId(JTextField txtId) {
        this.txtId = txtId;
    }

    public JTextField getTxtGamertag() {
        return txtGamertag;
    }

    public void setTxtGamertag(JTextField txtGamertag) {
        this.txtGamertag = txtGamertag;
    }

    public JTextField getTxtClub() {
        return txtClub;
    }

    public void setTxtClub(JTextField txtClub) {
        this.txtClub = txtClub;
    }

    public JTextField getTxtAuto() {
        return txtAuto;
    }

    public void setTxtAuto(JTextField txtAuto) {
        this.txtAuto = txtAuto;
    }

    public JTextField getTxtLiga() {
        return txtLiga;
    }

    public void setTxtLiga(JTextField txtLiga) {
        this.txtLiga = txtLiga;
    }

    public JTextField getTxtFoto() {
        return txtFoto;
    }

    public void setTxtFoto(JTextField txtFoto) {
        this.txtFoto = txtFoto;
    }

    public JButton getBotonAdd() {
        return botonAdd;
    }

    public void setBotonAdd(JButton botonAdd) {
        this.botonAdd = botonAdd;
    }

    public JTable getTabla() {
        return tabla;
    }

    public void setTabla(JTable tabla) {
        this.tabla = tabla;
    }

    public JScrollPane getScroll() {
        return scroll;
    }

    public void setScroll(JScrollPane scroll) {
        this.scroll = scroll;
    }

    @Override
    public GridLayout getLayout() {
        return layout;
    }

    public void setLayout(GridLayout layout) {
        this.layout = layout;
    }

    public JPanel getPanel1() {
        return panel1;
    }

    public void setPanel1(JPanel panel1) {
        this.panel1 = panel1;
    }

    public JPanel getPanel2() {
        return panel2;
    }

    public void setPanel2(JPanel panel2) {
        this.panel2 = panel2;
    }

    public JPanel getPanel3() {
        return panel3;
    }

    public void setPanel3(JPanel panel3) {
        this.panel3 = panel3;
    }

    public JPanel getPanel4() {
        return panel4;
    }

    public void setPanel4(JPanel panel4) {
        this.panel4 = panel4;
    }

    public JLabel getImagenRL() {
        return imagenRL;
    }

    public void setImagenRL(JLabel imagenRL) {
        this.imagenRL = imagenRL;
    }

    public JButton getBtnCargar() {
        return btnCargar;
    }

    public void setBtnCargar(JButton btnCargar) {
        this.btnCargar = btnCargar;
    }

    public JButton getBtnBorrar() {
        return btnBorrar;
    }

    public void setBtnBorrar(JButton btnBorrar) {
        this.btnBorrar = btnBorrar;
    }

    public JButton getBtnModificar() {
        return btnModificar;
    }

    public void setBtnModificar(JButton btnModificar) {
        this.btnModificar = btnModificar;
    }

    public JLabel getLblregistroselec() {
        return lblregistroselec;
    }

    public void setLblregistroselec(JLabel lblregistroselec) {
        this.lblregistroselec = lblregistroselec;
    }

    public ModeloTablaRL getModelo() {
        return modelo;
    }

    public void setModelo(ModeloTablaRL modelo) {
        this.modelo = modelo;
    }

    public ArrayList<RocketLeague> getInfo() {
        return info;
    }

    public void setInfo(ArrayList<RocketLeague> info) {
        this.info = info;
    }

    public void limpiar(){
        txtId.setText("");
        txtGamertag.setText("");
        txtClub.setText("");
        txtAuto.setText("");
        txtLiga.setText("");
        txtFoto.setText("");
    }
}
