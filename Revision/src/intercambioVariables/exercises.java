package intercambioVariables;

import java.util.Scanner;

public class exercises {
    public static void main(String[] args) {
       //a();
        //b();
        //conversion();
        //theorem();
        //c();
        //sphere();
        form();
    }

    static void a(){
        Scanner scanner = new Scanner(System.in);

        int d, l, aux;

        System.out.print("Introduzca el valor de d: ");
        d = scanner.nextInt();

        System.out.print("Introduzca el valor de l: ");
        l =  scanner.nextInt();

        System.out.printf("Valores iniciales de d = %d , l= %d\n", d, l);

        aux = d;
        d= l;
        l=aux;

        System.out.printf("Valores intercambiados de d = %d , l= %d", d, l);
    }

    static void b(){
        // a = a+b
        //b = a-b
        //a = a-b
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        int a, b;

        System.out.print("Introduzca el valor de a: ");
        a = scanner.nextInt();

        System.out.print("Introduzca el valor de b: ");
        b =  scanner.nextInt();

        System.out.printf("Valores iniciales de a = %d , b= %d\n", a, b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.printf("Valores intercambiados de a = %d , b= %d", a, b);
    }

    static void conversion(){
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        double celsius, fahrenheit;

        System.out.print("Introduce los grados Celsius: ");
        celsius = scanner.nextDouble();

        fahrenheit = 32+(9*celsius/5);

        System.out.printf("%.2f C° = %.2f F°", celsius, fahrenheit);

    }

    static void theorem(){
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        double cat1, cat2;

        System.out.print("Longitud del primer cateto: ");
        cat1 = scanner.nextDouble();

        System.out.print("Longitud del segundo cateto: ");
        cat2 = scanner.nextDouble();

        // Explicación de las funciones matemáticas siguientes.
        // Math.sqrt() // <--- Raiz cuadrada
        // Math.pow()  // <--- Elevar a una potencia
        System.out.printf("Hipotenusa: %.2f", Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2)));
    }

    static void c(){
        int x;
        double randomNumber, y, z;
        float max;


        randomNumber = Math.random();
        x =  Math.abs(-123); // <-- valor absoluto de un número

        y = Math.round(123.567); // <-- Readondear número

        z = Math.pow(2,4);

        max = Math.max((float)1e10, (float) 3e9);


        System.out.printf("Número aleatorio: %.2f\nNúmero absoluto: %d\nNúmero redondeado: %.2f\n2^4=%.2f\nNúmero mayor en el rango: %.2f", randomNumber, x, y, z, max);

    }

    static void sphere(){
        // V = (4/3)*pi*R^3

        Scanner scanner = new Scanner(System.in);

        double radio;

        System.out.print("Introduzca valor del radio de la esfera: ");
        radio = scanner.nextDouble();

        System.out.printf("Volumen de la esfera: %.2f", (4.0/3) * Math.PI * Math.pow(radio, 3));
    }

    static void form(){
        //área=raiz2(p(p-a(p-b)(p-c)) donde p=(a+b+c)/2

        // Primero sacar valor de p
        //Pedir tres longitudes de los lados de un triángulo


        Scanner scanner = new Scanner(System.in);
        double area, a, b, c, p;

        System.out.print("Valor del primer lado del triángulo: ");
        a = scanner.nextDouble();

        System.out.print("Valor del segundo lado del triángulo: ");
        b = scanner.nextDouble();

        System.out.print("Valor del tercer lado del triángulo: ");
        c = scanner.nextDouble();


        p = (a+b+c) / 2 ;


        area = Math.sqrt(p *((p-a) * (p-b) * (p-c)) );
        System.out.printf("Área resultante: %.2f", area);
    }
}
