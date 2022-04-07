import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int a, b;
        int operacion;
        Scanner escaner = new Scanner(System.in);
        System.out.println("Calculadora basica entre dos numeros");
        System.out.println("Ingresa un numero para calcular");
        a = escaner.nextInt();
        System.out.println("Elige un numero que represente la operacion que quieras realizar");
        System.out.println("Digita 1 si es suma");
        System.out.println("Digita 2 si es resta");
        System.out.println("Digita 3 si es multiplicacion");
        System.out.println("Digita 4 si es division");
        operacion = escaner.nextInt();
        System.out.println("Ingresa un numero para calcular");
        b = escaner.nextInt();

        if (operacion == 1) {
            suma(a, b);
        } else if (operacion == 2) {
            resta(a, b);
        } else if (operacion == 3) {
            multiplicacion(a, b);
        } else if (operacion == 4) {
            division(a, b);
        } else {
            System.out.println("Ingresa un numero valido como operacion");
        }
    }

    public static void suma(int a, int b) {
        int resultado = a + b;
        System.out.println("Tu resultado es " + resultado);
    }

    public static void resta(int a, int b) {
        int resultado = a - b;
        System.out.println("Tu resultado es " + resultado);
    }

    public static void multiplicacion(int a, int b) {
        int resultado = a * b;
        System.out.println("Tu resultado es " + resultado);
    }

    public static void division(int a, int b) {
        if (b == 0) {
            System.out.println("Tu segundo numero no debe ser igual a 0, intentalo nuevamente");
        } else {
        int resultado = a / b;
        System.out.println("Tu resultado es " + resultado);
        }
    }

}

