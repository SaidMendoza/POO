import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una cadena con un nombre, una profesión y una nacionalidad:");
        String cadena = scanner.nextLine();

        String[] partes = cadena.split(",");

        String nombre = partes[0].trim();
        String profesion = partes[1].trim();
        String nacionalidad = partes[2].trim();

        System.out.println("Nombre: " + nombre);
        System.out.println("Profesión: " + profesion);
        System.out.println("Nacionalidad: " + nacionalidad);
    }
}
