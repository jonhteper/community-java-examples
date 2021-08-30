package arregloConstante;

public class ArregloFinal {
    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10; // Declaración de constante
        int array[] = new int[ARRAY_LENGTH]; // Crear arreglo

        // Calcular valor para cada posición del arreglo
        for (int i = 0; i < array.length; i++) {
            array[i]=2+2*i;
        }

        System.out.printf("%s%8s\n", "Index", "Value");

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%5d%8d\n", i, array[i]);
        }

    }
}
