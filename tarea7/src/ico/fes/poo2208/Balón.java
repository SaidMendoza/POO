package ico.fes.poo2208;

public class Balón {
    private String tipo;
    private String forma;
    private String material;

    public Balón() {
    }

    public Balón(String tipo, String forma, String material) {
        this.tipo = tipo;
        this.forma = forma;
        this.material = material;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String tamaño) {
        this.forma = tamaño;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Balón{" +
                "tipo='" + tipo + '\'' +
                ", forma='" + forma + '\'' +
                ", material='" + material + '\'' +
                '}';
    }
    public void rodar(){
        System.out.println("El balón está rodando");
    }
    public void lanzar(){
        System.out.println("El balón está en el aire");
    }
    public void patear(){
        System.out.println("Haz pateado el balón");
    }
}
