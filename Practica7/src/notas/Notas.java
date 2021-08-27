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
        double notaExamen = 8,  notaTrabajoGrupo = 9;
        boolean ratioAsistencia = false;
        boolean promedio = (notaExamen * 6) + (notaTrabajoGrupo * 4) >= 50;

        if (ratioAsistencia && promedio) {
            System.out.println("El alumno ha aprobado");
        } else {
            System.out.println("El alumno no ha aprobado");
        }


    }//main
}//class
