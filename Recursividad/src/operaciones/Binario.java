package operaciones;

import java.util.Scanner;

public class Binario {
    public static void main(String[] args) {
        int num, exp, digit;
        double binary;
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.print("Ingresa un número entero igual o mayor a 0: ");
            num = scanner.nextInt();
        } while (num < 0);
            exp =0;
            binary = 0;

            while (num != 0){
                digit = num%2;
                binary = binary+(digit*Math.pow(10, exp));
                exp++;
                num = num/2;
            }

            System.out.printf("Binario: %.0f", binary);


    }
}
