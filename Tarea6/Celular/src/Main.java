import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Celular miCelular = new Celular();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la marca del celular: ");
        String marca = scanner.nextLine();
        System.out.print("Ingrese el modelo del celular: ");
        String modelo = scanner.nextLine();
        System.out.print("Ingrese la capacidad de almacenamiento del celular (en GB): ");
        int capacidad = scanner.nextInt();
        System.out.print("Ingrese el precio del celular: $");
        double precio = scanner.nextDouble();
        miCelular.setMarca(marca);
        miCelular.setModelo(modelo);
        miCelular.setCapacidadAlmacenamiento(capacidad);
        miCelular.setPrecio(precio);
        System.out.println(miCelular);
    }
}