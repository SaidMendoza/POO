package ico.fes.poo2208;

public class Rubik {
    private String forma;
    private String colores;
    private String giros;

    public Rubik() {
    }

    public Rubik(String forma, String colores, String giros) {
        this.forma = forma;
        this.colores = colores;
        this.giros = giros;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    public String getGiros() {
        return giros;
    }

    public void setGiros(String giros) {
        this.giros = giros;
    }

    @Override
    public String toString() {
        return "Rubik{" +
                "forma='" + forma + '\'' +
                ", colores='" + colores + '\'' +
                ", giros='" + giros + '\'' +
                '}';
    }
    public void gira(){
        System.out.println("Giro a la derecha");
    }
    public void desensamble(){
        System.out.println("Desarmando rubik");
    }
    public void figura(){
        System.out.println("Figura de flor en la cara...");
    }
}
