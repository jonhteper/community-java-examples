package tablas;
/*
* Crea un programa que dibuje en la pantalla las tablas de multiplicar del 1 al 10
*/
public class Tablas {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) { // <-- Iniciamos un for que recorra los números del 1 al 10
            System.out.printf("\n*** Tabla del %d ***\n", i); // <-- Anotación estética, no es importante para el resultado

            // Dentro del primer for, creamos otro que también recorra los números del 1 al 10.
            // Es importante notar que por convención cuando hay varios ciclos for, el primero utiliza la variable 'i',
            // el segundo la variable 'j', el tercero la variable 'k', etc. Esto no es una ley, pero es considerado una
            // buena práctica.
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i*j); // <-- En este punto hacemos la multiplicación
            }// for j

        }// for i

    }// main
}//class
