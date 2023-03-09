import ico.fes.poo2208.*;

public class Main {
    public static void main(String[] args) {
        País pais1 = new País("Rusia", "Europa", 17.125191);
        System.out.println(pais1);

        Giroscopio giros1 = new Giroscopio("Café", 12, 15);
        System.out.println(giros1);

        Computadora comp1 = new Computadora("ASUS", 1064, "Bosé");
        System.out.println(comp1);

        Rubik rubik1 = new Rubik("Cuadrado", "tonos pasteles", "Veloz" );
        System.out.println(rubik1);

        Libro libro1 = new Libro("Terror", "It", "Sthepen King");
        System.out.println(libro1);

        Balón balón1 = new Balón("Americano", "Ovoide", "Cuero");
        System.out.println(balón1);

        Lámpara lámpara1 = new Lámpara("Grande", "Phillips", "Blanca");
        System.out.println(lámpara1);

        Gato gato1 = new Gato("Gato con botas", "Siames", "Café con blanco");
    }
}