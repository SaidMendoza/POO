import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre:");
        String nombre = sc.nextLine();
        System.out.println("Ingresa la edad:");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresa la dirección:");
        String direccion = sc.nextLine();
        Persona persona = new Persona(nombre, edad, direccion);
        System.out.println("Tu persona creada es: " + persona.toString());
    }
}