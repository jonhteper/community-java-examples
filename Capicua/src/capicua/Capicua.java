package capicua;

import java.util.Scanner;

public class Capicua {
    public static void main(String[] args) {
        int n, aux, invert =0, c;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Introduce un número mayor o igual a 10: ");
            n = scanner.nextInt();
        } while (n < 10);

        // Leer de derecha a izquierda
        aux = n;
        while (aux != 0) {
            c = aux%10;
            invert = invert*10+c;
            aux = aux/10;
        }


        if (n == invert){
            System.out.printf("%d es una capicua \n", n);
        } else {
            System.out.println("No es una capicua");
        }
    }
}
