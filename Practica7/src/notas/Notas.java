package notas;
/*
* Crear un programa que dibuje por pantalla si un estudiante ha aprobado o no la asignatura de matemáticas.
* Tienes que usar las siguientes variables:
*   notaExamen: de tipo double y que representa el 60% de la nota final.
*   notaTrabajoGrupo: de tipo double y que representa el 40% de la nota final.
*   ratioAsistencia: tipo Boolean que indica si el estudiante cumple con el mínimo de asistencia requerido.
* Los valores de estas variables estarán hardcodeados.
* Puedes usar otras variables si lo estimas oportuno.
* Las condiciones para aprobar la asignatura son 2:
*   Conseguir una media de las dos notas, igual o superior a 5, considerando los pesos de ambas notas.
*   Cumplir con el ratio mínimo de asistencia requerido.
*
* */
public class Notas {
    public static void main(String[] args) {

        // Ya que las instrucciones piden que los valores sean harcodeados (definidos dentro del código),
        // definimos las calificaciones...
        double notaExamen = 8,  notaTrabajoGrupo = 9;

        // ... y luego definimos si cumple con las asistencias
        boolean ratioAsistencia = true;

        // Para simplificar el código, podemos guardar en una variable tipo boolean si el alumno cumple con los
        // porcentajes. Para sacar los porcentajes podemos aplicar una regla de tres:
        //      para obtener el 60% del examen usamos una regla de tres => `( notaExamen * 60 ) 10`, que simplificado es `(notaExamen * 6)`;
        //      bajo la misma lógica usamos `(notaTrabajoGrupo * 4)`.
        // Como obtuvimos el número del porcentaje (p.ej. 60 y 40) y la condición es que el alumno tenga al menos un 5
        // hacemos la comparación con el 50 %.
        boolean promedio = (notaExamen * 6) + (notaTrabajoGrupo * 4) >= 50;

        if (ratioAsistencia && promedio) { // <-- Comprobamos si el alumno cumple con las dos condiciones

            System.out.println("El alumno ha aprobado \uD83D\uDE03"); // <<-- Pequeña anotación: Java puede imprimir emojis básicos, pero hay que insertarlos de forma hexadecimal

        } else {
            System.out.println("El alumno no ha aprobado \uD83D\uDE1E");
        }


    }//main
}//class
