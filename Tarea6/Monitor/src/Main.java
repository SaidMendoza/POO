import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la marca del monitor:");
        String marca = scanner.nextLine();
        System.out.println("Ingrese el modelo del monitor:");
        String modelo = scanner.nextLine();
        System.out.println("Ingrese el tamaño en pulgadas del monitor:");
        int tamañoPulgadas = scanner.nextInt();
        System.out.println("Ingrese la resolución en ancho del monitor:");
        int resolucionAncho = scanner.nextInt();
        System.out.println("Ingrese la resolución en alto del monitor:");
        int resolucionAlto = scanner.nextInt();
        Monitor monitorUsuario = new Monitor(marca, modelo, tamañoPulgadas, resolucionAncho, resolucionAlto);

        System.out.println("El monitor ingresado es:");
        System.out.println(monitorUsuario);
    }
}