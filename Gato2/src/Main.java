import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de 9 caracteres con X, O o _: ");
        String cadena = scanner.nextLine();

        System.out.println("La cadena ingresada es: " + cadena);
        System.out.println("-----------");
        System.out.println(" " + cadena.charAt(0) + " | " + cadena.charAt(1) + " | " + cadena.charAt(2) + " ");
        System.out.println("---|---|---");
        System.out.println(" " + cadena.charAt(3) + " | " + cadena.charAt(4) + " | " + cadena.charAt(5) + " ");
        System.out.println("---|---|---");
        System.out.println(" " + cadena.charAt(6) + " | " + cadena.charAt(7) + " | " + cadena.charAt(8) + " ");
        System.out.println("-----------");
        if (cadena.length() != 9) {
            System.out.println("La cadena debe tener exactamente 9 caracteres.");
            return;
        }
        for (char c : cadena.toCharArray()) {
            if (c != 'X' && c != 'O' && c != '_') {
                System.out.println("La cadena solamente puede contener X, O o _.");
                return;
            }
        }

    }
}
