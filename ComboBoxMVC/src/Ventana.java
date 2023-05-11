import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Ventana extends JFrame{
    private JLabel lblnombre;
    private  JTextField txtnombre;
    private JButton boton;
    private JComboBox combo;
    private NombreModeloCombo modelo;

    public Ventana(String title) throws HeadlessException {
        super(title);
        this.setSize(400,400);
        setLayout(new FlowLayout());
        lblnombre = new JLabel("Ingresa un nombre: ");
        this.getContentPane().add(lblnombre);
        txtnombre = new JTextField(30);
        this.getContentPane().add(txtnombre);
        boton = new JButton("Agregar");
        this.getContentPane().add(boton);
        //configurar el modelo
        modelo = new NombreModeloCombo();
        modelo.agregarNombre("Karim");
        modelo.agregarNombre("Leo");
        modelo.agregarNombre("Fanny");
        combo = new JComboBox(modelo);
        this.getContentPane().add(combo);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        boton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String nuevo = txtnombre.getText();
                modelo.agregarNombre(nuevo);
                txtnombre.setText("");
            }
        });

        combo.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(combo.getSelectedIndex());
                System.out.println(combo.getSelectedItem());
                JOptionPane.showMessageDialog(null, "Hola " + combo.getSelectedItem() + ", te amo");
            }
        });
    }
}
