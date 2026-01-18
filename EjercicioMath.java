package trimestre2.POO;

public class EjercicioMath {
    public static void main(String[] args) {
        /*Ejercicio 1.- Haciendo uso de los métodos de la clase Math.
         Programa que muestre lo siguiente:*/

        //*a) ¿Cuánto es 3 elevado a 3?*

        System.out.println("3 elevado a 3 es : "+ Math.pow(3,3));

//        b) ¿Cuánto vale la constante matemática e, uno de los números irracionales más
//        importantes?

        System.out.println("la constante matemática e vale : "+Math.E);
        System.out.println("(Otra forma)la constante amtematica e vale : "+Math.exp(1));

//        c) ¿Cuánto vale π (pi), que es la relación entre la longitud de una circunferencia y
//        su diámetro en geometría euclidiana?

        System.out.println("El valor de pi es: "+ Math.PI);

//        d) ¿Cuál es el seno de un ángulo de 90º?
 /* tenemos que pasar el numero a radianes primero porque la calculadora de java solo entiende
 ese idioma. asume que son radianes pero debemos definirlo primero asi que. lo pasamos a radianes primero*/
        System.out.println("El valor del seno de un angulo de 90 es: "+Math.sin(Math.toRadians(90)));

//        e) ¿Cuánto vale la raíz cuadrada de 16?

        System.out.println("El valor de la raiz cuadrada de 16 es: "+Math.sqrt(16));

//        f) Generar un número aleatorio con JAVA.

        System.out.println("Un numero aleatorio es: "+ Math.random());

//        g) Dados los números 13 y 69, indicar cuál es el menor y cuál es el mayor.*/

        System.out.println("tenemos  los numeros 13 y 69");
        System.out.println("El mayor es: "+Math.max(13,69));
        System.out.println("El menor es: "+Math.min(13,69));


    }
}
