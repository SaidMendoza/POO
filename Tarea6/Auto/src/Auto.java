import java.awt.*;

public class Auto {

    // Atributos
    private String marca;
    private String modelo;
    private int año;
    private Color color;

    // Constructor por defecto
    public Auto() {
        this.marca = "";
        this.modelo = "";
        this.año = 0;
        this.color = color;
    }

    // Constructor sobrecargado
    public Auto(String marca, String modelo, int año, Color color) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
    }

    // Métodos de acceso
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    // Método toString
    @Override
    public String toString() {
        return "Auto [marca= " + marca + ", modelo= " + modelo + ", año= " + año + ", color= " + color + "]";
    }

    // Métodos de uso general
    public void encender() {
        System.out.println("El auto ha sido encendido.");
    }

    public void apagar() {
        System.out.println("El auto ha sido apagado.");
    }

    public void acelerar() {
        System.out.println("El auto está acelerando.");
    }
}
