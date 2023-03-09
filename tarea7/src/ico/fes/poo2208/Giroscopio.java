package ico.fes.poo2208;

public class Giroscopio {
    private String color;
    private float tamaño;
    private float medRotor;

    public Giroscopio() {
    }

    public Giroscopio(String color, float tamaño, float medRotor) {
        this.color = color;
        this.tamaño = tamaño;
        this.medRotor = medRotor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    public float getMedRotor() {
        return medRotor;
    }

    public void setMedRotor(float medRotor) {
        this.medRotor = medRotor;
    }

    @Override
    public String toString() {
        return "Giroscopio{" +
                "color='" + color + '\'' +
                ", tamaño=" + tamaño +
                ", medRotor=" + medRotor +
                '}';
    }
    public void rotacion(){
        System.out.println("Gira a velocidad...");
    }
    public void velAngular(){
        System.out.println("La velocidad angular es: ");
    }
    public void anguloRotacional(){
        System.out.println("El ángulo rotacional es: ");
    }
}
