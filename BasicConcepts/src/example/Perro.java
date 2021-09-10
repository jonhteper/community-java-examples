package example;

// TODO terminar documentación
// Las clases son....
public class Perro {
    // Tienen atributos, que corresponden a las características del objeto.
    // Cada atributo tiene un tipo de dato en específico

    public String color; // atributo
    public String nombre; // atributo
    public String raza; // atributo
    private int edad; // atributo
    private float peso; // atributo
    private double pesoEspecifico; // atributo

    /* Tipos de datos básicos
        - boolean, que solo puede tener `true` o `false`.
        - String, que contiene una cadena de caracteres. Es un texto.
        - int, que solo puede contener números enteros, ya sean positivos o negativos.
        - float, que puede contener número reales: números con decimal, ya sean positivos o negativos
        - double, igual que el float, pero tiene el doble de precisión matemática.
    * */

    public Perro(String color, String nombre, String raza) {
        this.color = color;
        this.nombre = nombre;
        this.raza = raza;
    } // método constructor con el nombre de la clase


    /* tipo boolean solo puede tener dos valores:
        - true
        - false
        Que son equivalente a:
        - 1
        - 0
    */
    public void TieneCollar(boolean collar){
        // estructura if de control...
        if (collar){ // <-- si esto es verdadero se ejecutará lo que está entre llaves

            // this <--- hacemos referencia al objeto ya creado
            //           por tanto, podemos acceder a sus atributos
            //           como en el caso de `this.nombre`
            System.out.println(this.nombre + " tiene collar");

        } else { // <---- Si lo evaluado en el if, es falso, se ejecutará lo que sigue entre llaves

            System.out.println(this.nombre + " no tiene collar");
        }

    } // método TieneCollar

    public void Ladrar(){
        System.out.println(this.nombre + " dice: guau!");
    }

}
