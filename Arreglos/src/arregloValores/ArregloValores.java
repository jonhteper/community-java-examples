package arregloValores;

public class ArregloValores {
    public static void main(String[] args) {
        int array []={32,27,64,18,95,14,90,70,60,37, 58, 89}; // Aquí la longitud está definida por el número de objetos dentro del arreglo


        System.out.printf("%s%8s\n", "Index", "Value");

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%5d%8d\n", i, array[i]);
        }
    }
}
