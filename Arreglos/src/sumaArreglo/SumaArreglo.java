package sumaArreglo;
/*
* Calcular la suma de los elementos de un arreglo
* */
public class SumaArreglo {
    public static void main(String[] args) {
        int[] array = {1,87,68,94,100,83,36,72,144,200};
        int total = 0;

        // Sumar valores

        for (int i = 0; i < array.length; i++) {
            total += array[i]; // <--- el operador `+=` es la concatenación de las operaciones de suma (+) y asignación (=).
                               // Dicho de otra manera, acumulamos la suma del valor del arreglo a la variable total.
                               //
                               // Con la expresión `array[i]` estamos accediendo a la posición del arreglo que sea igual al
                               // valor actual de i
        }


        //Una forma más simple de hacer lo anterior es:
        // for (int j : array) {
        //     total += j;
        // }


        System.out.printf("Total de los elementops del arreglo: %d\n", total);
    }
}
