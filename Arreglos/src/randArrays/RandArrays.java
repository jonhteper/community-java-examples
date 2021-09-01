package randArrays;

import java.util.Random;
/*
* Simulación de un dado
* */
public class RandArrays {
    public static void main(String[] args) {
        Random randomNumbers = new Random(); // Creamos objeto que pueda crear números aleatorios
        int[] frequency = new int[7]; // Creamos arreglo de 7 espacios. 7 en lugar de 6 para que quepan todos los valores.


        // Realizamos 6,000 tiradas del dado
        for (int i = 1; i < 6000; i++) {
            ++frequency[1+randomNumbers.nextInt(6)]; // <--- Sumamos un 1 al número que está en una posición
                                                            // aleatoria del arrelo, de un número que puede estar
                                                            // entre el 0 y el 6. A este número le agregamos 1,
                                                            // evitando así el índice 0
        }

        // Formato inicial
        System.out.printf("%s %10s\n", "Cara", "Frecuencia");

        // Imprimir el valor de cada elemento
        //
        // For que recorre el arreglo frequency, imprimiendo las caras, del dado con la frecuencia con la que
        // aparecieron en las 6000 tiradas.
        for (int i = 1; i < frequency.length; i++) {
            System.out.printf("%s %10s\n", i+1, frequency[i]);
        }

        /*Impresión de la versión optimizada...*/
        System.out.println();
        optimize(args);

    }

    // Esta es una manera 'optimizada' de realizar el  código anterior
    static void optimize(String[] args) {
            Random randomNumbers = new Random(); // Creamos objeto que pueda crear números aleatorios
            int[] frequency = new int[6]; // Creamos arreglo de 6 espacios.


            // Realizamos 6,000 tiradas del dado
            for (int i = 1; i < 6000; i++) {
                ++frequency[randomNumbers.nextInt(6)]; // <--- Sumamos un 1 al número que está en una posición
                                                              // aleatoria del arrelo, de un número que puede estar
                                                              // entre el 0 y el 6
            }

            // Formato inicial
            System.out.printf("%s %10s\n", "Cara", "Frecuencia");

            // Imprimir el valor de cada elemento
            //
            // For que recorre el arreglo frequency, imprimiendo las caras, del dado con la frecuencia con la que
            // aparecieron en las 6000 tiradas.
            for (int i = 0; i < frequency.length; i++) {
                System.out.printf("%s %10s\n", i+1, frequency[i]);
            }


    }

}
