package condicionales;

import java.io.IOException;
import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) throws IOException {
       a();
       // b();
    }

    static void a() throws IOException {
        // Declaramos una variable para guardar resultado
        Scanner scanner = new Scanner(System.in);
        char character;

        // Solicitamos al usuario un caracter.

        System.out.print("Introducir un solo caracter imprimible: ");
        character = (char) System.in.read();

        // La función Character.isUpperCase() devuelve un tipo boolean
        // por eso es posible usarlo en el if
         if (Character.isUpperCase(character)) {
             System.out.print("Es una Mayúscula");

         }else{
             System.out.print("No es una Mayúscula");
         }

         System.out.println();

         // Verificamos que sea una letra del abecedario
         if(character >= 'A' && character <= 'Z') {
             System.out.print("Es una Letra Mayúscula");
         } else {
             System.out.print("No es una Letra Mayúscula");
         }
    }

    static void b() throws IOException {
        char num;

        System.out.print("Introducir un solo caracter imprimible: ");
        num = (char) System.in.read();

        if (Character.isDigit(num)) {
            System.out.println("Es un número");
        } else {
            System.out.println("No es un número");
        }

        if (num >= '0' && num <= '9') {
            System.out.println("Es un número");
        } else {
            System.out.println("No es un número");
        }

    }
}
