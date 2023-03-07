import java.awt.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese los datos del auto:");
        System.out.print("Marca: ");
        String marca = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        System.out.print("Año: ");
        int año =  scanner.nextInt();
        scanner.nextLine();
        System.out.print("Color: ");
        Color color = Color.decode(scanner.nextLine());

        Auto auto = new Auto(marca, modelo, año, color);
        System.out.println("Auto creado:");
        System.out.println(auto);
    }

}