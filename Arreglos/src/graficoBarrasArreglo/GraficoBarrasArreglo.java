package graficoBarrasArreglo;
/*
* Gráfica de barras por consola
*
* WARNING: Este ejercicio solo puede funcionar con un arreglo de 10 elementos.
* */
public class GraficoBarrasArreglo {
    public static void main(String[] args) {
        int[] array = {0, 0, 0 ,0 ,0 ,0 ,1 , 2, 4, 2, 1};

        System.out.println("Distribución");

        // Para cada elemento del arreglo, imprimir una barra de gráfico
        for (int i = 0; i < array.length; i++) {
            // Imprimir etiqueta de la barra
            if(i == 10){
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ", i*10, i*10+9); // <-- Los placeholder del formato son para que el número
                                                                // impreso utilice dos caracteres. Específicamente en
                                                                // este programa, son para que la primera línea sea '00-09'
                                                                // en lugar de '0-9'
            }

            // Imprimir barras: mprimimos la cantidad de asteríscos igual a la posición actual del arreglo
            for (int j = 0; j < array[i]; j++) {
                System.out.print("*");
            }


            System.out.println(); // <-- Añadimos un salto de línea, para dar formato en el gráfico
        }//for
    }// main
}// class
