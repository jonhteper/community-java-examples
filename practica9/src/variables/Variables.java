package variables;

public class Variables {
    public static void main(String[] args) {
       exercise1();

       exercise2();

       exercise3();

       exercise4();
    }

    static void exercise1(){
        int x = 4;
        double y = 4.5;
        char z = 'a';

        System.out.println("Variable x = " + x);
        System.out.println("Variable y = " + y);
        System.out.println("Variable z = " + z);

        System.out.printf("%d + %.2f = %.2f\n", x, y, (x +y)); // <-- Uso de placeholders en decimal

        System.out.println("El valor numérico de " +z + " es " + (int)z); // <-- casting en java
        // El casting es la "transformación" de tipos, en el caso anterior transformamos una
        // variable tipo char a una tipo int.
    }

    static void exercise2(){
        /*
        * Declarar dos variables `x` y `y` de tipo int
        * Declarar dos variables `n` y `m` tipo double
        * Asignar valores a todas las variables
        *
        * Realizar operaciones entre ellos (+, -, *, /, %)
        *
        * Sacar el doble de cada variable
        * Suma de todas las variables
        * Producto de todas las variables
        * */
        int x = 5, y = 2;
        double m = 3.5, n = 4.5;

        System.out.println("Variable x = " + x);
        System.out.println("Variable y = " + y);
        System.out.println("Variable m = " + m);
        System.out.println("Variable n = " + n);
        System.out.println();

        System.out.printf("%d + %d = %d\n", x, y, x+y);
        System.out.printf("%d - %d = %d\n", x, y, x-y);
        System.out.printf("%d * %d = %d\n", x, y, x*y);
        System.out.printf("%d / %d = %d\n", x, y, x/y);
        System.out.printf("%d %s %d = %d\n", x, "%", y, x%y);
        System.out.println();

        System.out.printf("%.2f + %.2f = %.2f\n", m, n, m+n);
        System.out.printf("%.2f - %.2f = %.2f\n", m, n, m-n);
        System.out.printf("%.2f * %.2f = %.2f\n", m, n, m*n);
        System.out.printf("%.2f / %.2f = %.2f\n", m, n, m/n);
        System.out.printf("%.2f %s %.2f = %.2f\n", m, "%", n, m%n);
        System.out.println();

        System.out.printf("El doble de %d es %d \n", x, x*2);
        System.out.printf("El doble de %d es %d \n", y, y*2);
        System.out.printf("El doble de %.2f es %.2f \n", n, n*2);
        System.out.printf("El doble de %.2f es %.2f \n", m, m*2);
        System.out.println();

        System.out.printf("%d + %d + %.2f + %.2f = %.2f\n\n", x, y, m, n, x + y + n + m);

        System.out.printf("%d * %d * %.2f * %.2f = %.2f\n", x, y, m, n, x * y * n * m);
    }

    static void exercise3(){
        /*
         * Declarar n como int y asignar valor
         * realizar su incremento y decremento y duplicar su valor
         * */

        int x = 5;
        System.out.printf("Valor inicial de x: %d\n", x);

        x+=27;
        System.out.printf("x + 27 = %d\n", x);

        x-=3;
        System.out.printf("x - 3 = %d\n", x);

        x*=2;
        System.out.printf("x * 2 = %d\n", x);
    }

    static void exercise4(){
        /*
        * Declarar variables y realizar las siguientes operaciones
        * b toma el valor de c
        * c toma el valor de d
        * d toma el valor de b
        *
        * */

        int a = 1, b=2, c=3, d=4, aux = 0;
        System.out.println("Valores iniciales");
        System.out.printf("a = %d\n", a);
        System.out.printf("b = %d\n", b);
        System.out.printf("c = %d\n", c);
        System.out.printf("d = %d\n", d);

        aux = b;
        b =c;
        c = a;
        a=d;
        d =aux;

        System.out.printf("b toma el valor de c -> b = %d\n", b);
        System.out.printf("c toma el valor de a -> c = %d\n", c);
        System.out.printf("a toma el valor de d -> a = %d\n", a);
        System.out.printf("d toma el valor de b -> d = %d\n", d);

        System.out.println();


    }
}
