package condicionales;

import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
       // a();
        b();


    }

    static void a(){
        Scanner scanner  = new Scanner(System.in);
        int x;

        // Solicitar número al usuario

        System.out.print("Introduce un número entero: ");
        x = scanner.nextInt();

        if (x % 2 == 0) {
            System.out.println("El número es par");
        } else  {
            System.out.println("El número es impar");
        }
    }

    static void b(){
        Scanner scanner  = new Scanner(System.in);
        int x;

        // Solicitar número al usuario

        System.out.print("Introduce un número entero: ");
        x = scanner.nextInt();

        if (x % 10 == 0) {
            System.out.println("El número es múltiplo de 10");
        } else  {
            System.out.println("El número no es múltiplo de 10");
        }
    }
}
