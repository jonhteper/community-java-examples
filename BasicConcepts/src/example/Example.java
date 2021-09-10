package example;

public class Example {

    public static void main(String[] args) {
        // Las variables son espacios en la memoria que contiene valores que pueden cambiar.
        // Todas las variables tienen un tipo de dato en específico.

        var toby = new Perro("blanco", "toby", "husky"); // Creamos objeto tipo Perro

        System.out.println("El color de "+ toby.nombre + " es " + toby.color); // imprimimos su nombre y color



        // Cambiando completamente el contenido del objeto
        toby = new Perro("verde", "saturno", "chihuahua");

        toby.nombre = "saturno"; // <--- cambiando solo un atributo
        toby.color = "verde";  // <--- cambiando solo un atributo
        toby.raza = "chihuahua";  // <--- cambiando solo un atributo





        var odi = new Perro("negro", "odi", "labrador");


        toby.Ladrar();

        System.out.println("El color de "+ toby.nombre + " es " + toby.color);

        odi.TieneCollar(true);


    } // método, el método main siempre es el punto de entrada.
}
