public class Celular {
    // Atributos
    private String marca;
    private String modelo;
    private int capacidadAlmacenamiento;
    private double precio;

    // Constructor por defecto
    public Celular(String marca, String modelo, int capacidad) {
        this.marca = "";
        this.modelo = "";
        this.capacidadAlmacenamiento = 0;
        this.precio = 0.0;
    }

    // Constructor sobrecargado
    public Celular() {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.precio = precio;
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

    public int getCapacidadAlmacenamiento() {
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método toString
    @Override
    public String toString() {
        return "Celular [marca= " + marca + ", modelo= " + modelo + ", capacidadAlmacenamiento= " + capacidadAlmacenamiento
                + " GB, precio= $" + precio + "]";
    }

    // Métodos de uso general
    public void encender() {
        System.out.println("Encendiendo el celular " + marca + " " + modelo + "...");
    }

    public void tomarFoto() {
        System.out.println("Tomando una foto con el celular " + marca + " " + modelo + "...");
    }

    public void reproducirMusica() {
        System.out.println("Reproduciendo música en el celular " + marca + " " + modelo + "...");
    }
}
