package tablas;
/*
* Crea un programa que dibuje en la pantalla las tablas de multiplicar del 1 al 10
*/
public class Tablas {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("\n*** Tabla del %d ***\n", i);
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i*j);
            }
        }
    }
}
