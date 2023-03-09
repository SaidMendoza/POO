package ico.fes.poo2208;

import java.util.PrimitiveIterator;

public class Libro {
    private String género;
    private String título;
    private String autor;

    public Libro() {
    }

    public Libro(String género, String título, String autor) {
        this.género = género;
        this.título = título;
        this.autor = autor;
    }

    public String getGénero() {
        return género;
    }

    public void setGénero(String género) {
        this.género = género;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "género='" + género + '\'' +
                ", título='" + título + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
    public void abrir(){
        System.out.println("El libro está  abierto");
    }
    public void mostrar(){
        System.out.println("Contenido del libro");
    }
    public void cerrar(){
        System.out.println("El libro está cerrado");
    }
}
