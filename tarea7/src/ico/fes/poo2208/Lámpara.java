package ico.fes.poo2208;

public class Lámpara {
    private String tamaño;
    private String marca;
    private String luz;

    public Lámpara() {
    }

    public Lámpara(String tamaño, String marca, String luz) {
        this.tamaño = tamaño;
        this.marca = marca;
        this.luz = luz;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLuz() {
        return luz;
    }

    public void setLuz(String luz) {
        this.luz = luz;
    }

    @Override
    public String toString() {
        return "Lámpara{" +
                "tamaño='" + tamaño + '\'' +
                ", marca='" + marca + '\'' +
                ", luz='" + luz + '\'' +
                '}';
    }
    public void encender(){
        System.out.println("La lámpara está encendida");
    }
    public void brillo(){
        System.out.println("El brillo está al 50%");
    }
    public void apagar(){
        System.out.println("La lámpara está apagada");
    }
}
