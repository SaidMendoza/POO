package ico.fes.poo2208;
public class País {
    private String nombre;
    private String continente;
    private double superficie;

    public País() {
    }

    public País(String nombre, String continente, double superficie) {
        this.nombre = nombre;
        this.continente = continente;
        this.superficie = superficie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    @Override
    public String toString() {
        return "País{" +
                "nombre='" + nombre + '\'' +
                ", continente='" + continente + '\'' +
                ", superficie=" + superficie +
                '}';
    }
    public void visitar(){
        System.out.println("Has llegado a...");

    }
    public void conocer(){
        System.out.println("Conoce la nueva cultura...");
    }
    public void idioma(){
        System.out.println("En este país se habla...");
    }


}