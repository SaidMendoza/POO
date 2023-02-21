import java.util.Scanner;
public class JavaAFondo {


    public static void main(String[] args) {

        //Tamaño de la cadena
        String w1 = "Hola";
        int tam = w1.length(); //Retorna: 4
        System.out.println(tam);

        //Detecta si la cadena esta vacia
        String w2 = "ADIOS";
        boolean empty = w2.isEmpty(); //Retorna: false
        System.out.println(empty);

        String w3 = "";
        boolean empty2 = w3.isEmpty(); //Retorna: true
        System.out.println(empty2);

        //Acceder a los carecteres de la cadena
        System.out.println("Escriba una palabra: ");
        Scanner tec = new Scanner(System.in);
        String frase = tec.nextLine();
        for(int i = 0; i<frase.length(); i++){
            char l = frase.charAt(i);
            System.out.println(l);
        }

        //Comparar Cadenas
        String w4 = "Hola";
        String w5 = "Hola";
        if(w4.equals(w5)){
            System.out.println("Si pasa por aqui!");
        }

        //Posicion del caracter
        String frase2 = "Hola, como estas?";
        int pz1 = frase2.indexOf('a');
        System.out.println("Indice letra: " + pz1);
        int pz2 = frase2.lastIndexOf('a');
        System.out.println("Indice frase: " + pz2);

        //Posicion del caracter
        String frase3 = "Hola, como estas? Estas como querias?";
        int pz3 = frase3.indexOf("como");
        System.out.println("Indice letra: " + pz3);
        int pz3z = frase3.indexOf("estas");
        System.out.println("Indice letra: " + pz3z);
        int pz3z3 = frase3.lastIndexOf("como");
        System.out.println("Indice frase: " + pz3z3);

        //Convertir mayusuclas a minusculas
        String frase4 = "Hola, como estas?";
        String MAYUS = frase4.toUpperCase();
        System.out.println(MAYUS);
        String MINUS = frase4.toLowerCase();
        System.out.println(MINUS);

        //Subcadenas
        String frase5 = "Hola, como estas?";
        String pz5 = frase5.substring(0, 4);
        System.out.println(pz5);
        String pz5z = frase5.substring(6, 10);
        System.out.println(pz5z);
        String pz5z5 = frase5.substring(11);
        System.out.println(pz5z5);

        //Conversion enteros
        String e = "1234";
        int i = Integer.parseInt(e);
        String e1 = Integer.toString(i);
        System.out.println(e1);

        //Conversion flotante
        String e2 = "1234.56";
        double f = Double.parseDouble(e2);
        String e3 = Double.toString(f);
        System.out.println(e3);

        //Concatenar codenas
            String x = "Hola, ";
            String y = "que tal?";
            String z  =  x+y;
            System.out.println(z);

            // Invarianza de las cadenas
        String e4 = "Hola";
        e4 = "chau";
        System.out.println(e4);

        //Concatenar cadenas
        StringBuilder StBr = new StringBuilder();
        StBr.append("Hola, ");
        StBr.append("Chau");
        System.out.println(StBr);

        //Modificar los caracteres de una cadena
        StringBuilder StBr2 = new StringBuilder("Hola ");
        StBr2.setCharAt(2, 'X');
        System.out.println(StBr2);


    }
}
