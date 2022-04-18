package polandNotation;
import java.util.Scanner;

    /*El objetivo del challenge del día de hoy es que logren recibir un String por entrada estándar (teclado)
    que viene en notación polaca inversa y entreguen el resultado de la operación.
    Los números y operadores vendrán separados entre si por un espacio.
    Así si reciben: 5 1 (espacio entre el 5 y el 1) son dos números.
    Si vienen juntos entonces es un número (ej: 17 1; acá son dos números el 17 y el 1).
    Ejemplo
        - Entrada: 5 1 2 + 4 * + 3 -
        - Salida:  14*/

public class poland {
    public static void main(String[] args) {
        String polandNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu calculo a realizar");
        polandNumber = scanner.nextLine();
        //System.out.println(polandNumber);
        String convertNumber = convert.convertPoland(polandNumber).toString();
        System.out.println("Expresión ingresada: " + polandNumber);
        System.out.println("Expresión notación Polaca: " + convertNumber);
        System.out.println("Resultado: " + resolutionPoland.result(convertNumber));

        String inverse = convertInverse.convertionInverse(polandNumber);
        double resolutionPoland = resolutionPolandInverse.resolution(inverse);
        System.out.println("Expresión ingresada: " + polandNumber);
        System.out.println("Expresión notación Polaca Inversa: " + inverse);
        System.out.println("Resultado: " + resolutionPoland);

        scanner.close();
    }
}
