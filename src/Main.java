
/* Ejercicio 1: Colecciones.
 Escribir un programa que sea capaz de crear un array de 1.000 elementos de
 números aleatorios y retorne la posición y valor del número más alto y más bajo. */

public class Main {
    public static void main(String[] args) throws Exception {
        
        ArrayNumerosRandom array1 = new ArrayNumerosRandom(1000);

        System.out.println("---------------RESULTADOS------------------------");
        
        array1.calcularMayorYMenor();
    }
}
