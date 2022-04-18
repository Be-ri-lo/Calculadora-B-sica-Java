package EsteroideCalculator;
    /*Segundo Challenge (calculadora con esteroides)
    Hacer una función que permita operar dos colas.
    Las colas se recibirán por entrada estándar (teclado) y la operación.
    Y la idea es que usted retorne el resultado de operar con los números contenidos en la cola.
    Ejemplo
    - Entrada
    4 5 3 2 1 3
    3 3 2 3 1 6
    +
    - Salida 7 8 5 5 2 9
    Acá el primer número de la cola 1 es el 4 y el último el 3 (lo mismo para la cola 2,
    el primer número es el 3 y el último el 9). Los elementos de la cola vendrán separados por espacios entre si.
    Si dos números no están separados por espacio, entonces representan un solo número.*/

import java.util.Queue;
import java.util.Scanner;

public class cola {
    public static void main(String[] args) {
        double queue1;
        double queue2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tus numeros");
        queue1 = scanner.nextDouble();
        queue2 = scanner.nextDouble();
        //double resultado =

        System.out.println("La suma de las colas: " + queue1 + " " + queue2 + " es: " + "resultado");
    }
}
