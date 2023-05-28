package org.example;

import org.example.modelo.Libro;
import org.example.persistencia.DemoLibroDB;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        DemoLibroDB demo = new DemoLibroDB();

        Libro libro = new Libro(0, "EL juego", "Desconocido");

       // if (demo.insertarLibro(libro)){
         //   System.out.println("se incertó correctamente");
        //}else{
          //  System.out.println("No se insertó");
        //}

        System.out.println(demo.buscarLibroPorId(3));
        System.out.println("----------");
        for (Libro tmp: demo.obtenerTodos()){
            System.out.println("Libro" + tmp);
            System.out.println("Titulo"+ tmp.getTitulo());
        }
    }
}