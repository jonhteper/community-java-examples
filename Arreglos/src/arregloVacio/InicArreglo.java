package arregloVacio;

public class InicArreglo {
    public static void main(String[] args) {
        int array []; // Declaración de arreglo tipo C
        // int[] array; // <--- Declaración moderna para declarar arreglos en Java

        array = new int[10]; // <-- Asignación de espacio para el arreglo

        System.out.printf("%s%8s\n", "Index", "Value"); // Crear encabezado de columnas

        /*
        * Pequeña explicación del formato utilizado:
        * %s  <---- Impresión de String, sin formato extra.
        * %8s <---- Impresión de String, de 8 caracteres, como la palabra 'Value' tiene 5 caracteres,
        *           se aplica una sangría de 3 caracteres. Si la palabra tuviese más caracteres, aparecería cortada.
        * \n  <---- Salto de línea.
        * */


        // Recorrer arreglo creando un for que vaya desde el 0 hasta el número igual a la longitud del arreglo.
        //      Nota: la propiedad length está disponible también en Strings
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%5d%8d\n", i, array[i]); // <--- Imprimir la posición y el valor correspondiente, con formato en columnas

        }

        // Es importante recordar que las listas siempre comienzan con 0. El índice 0 siempre apunta a la primera posición.
        // Esto no afecta a la longitud: un arreglo de 10 elementos, tiene desde la posición 0 a la 9.
    }
}
