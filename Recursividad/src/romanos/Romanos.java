package romanos;

import java.util.Scanner;

public class Romanos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            System.out.print("Ingresa un número entre 1 y 3999: ");
            n = scanner.nextInt();
        } while (n < 1 || n > 3999);

        System.out.printf("%d en números romanos es: %s", n, ConvertToRoman(n));

    }

    // Método estático para converir a números romanos
    public static String ConvertToRoman(int n){
        int mil, cent, dec, unit;
        String roman ="";
        String M = "M", C = "C", X = "X", I = "I";

        mil = n/1000;
        cent = n/100%10;
        dec = n/10%10;
        unit = n%10;

        // Miles
        for (int i = 0; i < mil; i++) {
            roman = roman + M;
        }

        //Centenas
        if(cent == 9){
            roman = roman + "CM";
        } else if (cent >= 5){
            roman = roman+"D";
            for (int j = 6; j < cent; j++) {
                roman = roman+C;
            }
        } else if (cent == 4){
            roman = roman+"CD";
        } else{
            for (int j = 1; j < cent; j++) {
                roman = roman + "C";
            }
        }

        if(dec == 9){
            roman += "XC";
        } else if (dec >= 5){
            roman += "L";
            for (int j = 6; j < dec; j++) {
                roman += X;
            }
        } else if (dec == 4){
            roman += "XL";
        } else {
            for (int j = 1; j < dec; j++) {
                roman += X;
            }
        }


        if (unit == 9){
            roman += "IX";
        } else if (unit >= 5){
            roman = roman+"V";
        } else if (unit == 4){
            roman += "IV";
        } else {
            for (int j = 0; j < unit; j++) {
                roman += "I";
            }
        }

        return roman;
    }
}
