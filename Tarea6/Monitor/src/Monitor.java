public class Monitor {
    // Atributos
    private String marca;
    private String modelo;
    private int tamañoPulgadas;
    private int resolucionAncho;
    private int resolucionAlto;

    // Constructores
    public Monitor() {
        this.marca = "Desconocida";
        this.modelo = "Desconocido";
        this.tamañoPulgadas = 0;
        this.resolucionAncho = 0;
        this.resolucionAlto = 0;
    }

    public Monitor(String marca, String modelo, int tamañoPulgadas, int resolucionAncho, int resolucionAlto) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamañoPulgadas = tamañoPulgadas;
        this.resolucionAncho = resolucionAncho;
        this.resolucionAlto = resolucionAlto;
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

    public int getTamañoPulgadas() {
        return tamañoPulgadas;
    }

    public void setTamañoPulgadas(int tamañoPulgadas) {
        this.tamañoPulgadas = tamañoPulgadas;
    }

    public int getResolucionAncho() {
        return resolucionAncho;
    }

    public void setResolucionAncho(int resolucionAncho) {
        this.resolucionAncho = resolucionAncho;
    }

    public int getResolucionAlto() {
        return resolucionAlto;
    }

    public void setResolucionAlto(int resolucionAlto) {
        this.resolucionAlto = resolucionAlto;
    }

    // Método toString
    @Override
    public String toString() {
        return "Monitor [marca=" + marca + ", modelo=" + modelo + ", tamañoPulgadas=" + tamañoPulgadas
                + ", resolucionAncho=" + resolucionAncho + ", resolucionAlto=" + resolucionAlto + "]";
    }

    // Métodos de uso general
    public void encender() {
        System.out.println("Encendiendo monitor...");
    }

    public void apagar() {
        System.out.println("Apagando monitor...");
    }

    public void ajustarBrillo(int nivel) {
        System.out.println("Ajustando brillo a " + nivel + "...");
    }
}
