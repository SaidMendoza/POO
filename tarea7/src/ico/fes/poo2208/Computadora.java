package ico.fes.poo2208;

public class Computadora {
    private String cpu;
    private float almacenamiento;
    private String sistAudio;

    public Computadora() {
    }

    public Computadora(String cpu, float almacenamiento, String sistAudio) {
        this.cpu = cpu;
        this.almacenamiento = almacenamiento;
        this.sistAudio = sistAudio;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public float getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(float almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getSistAudio() {
        return sistAudio;
    }

    public void setSistAudio(String sistAudio) {
        this.sistAudio = sistAudio;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "cpu='" + cpu + '\'' +
                ", almacenamiento=" + almacenamiento +
                ", sistAudio='" + sistAudio + '\'' +
                '}';
    }
    public void encender(){
        System.out.println("La computadora está encendiendo");
    }
    public void reproducir(){
        System.out.println("Reproduciendo música desde: ");
    }
    public void proyectar(){
        System.out.println("Proyectando película: ");
    }
}
