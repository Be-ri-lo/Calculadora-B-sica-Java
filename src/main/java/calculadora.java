public class Calculator {
    public Calculator(){
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();

        System.out.println(myCalculator.add(5,7));
        System.out.println(myCalculator.substract(5,7));
        System.out.println(myCalculator.multiply(5,7));
        System.out.println(myCalculator.divide(5,7));
    }
}



public class Calculator {
    public Calculator(){
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int substract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        double a, b;
        int operacion;
        Scanner escaner = new Scanner(System.in);
        System.out.println("Calculadora basica entre dos numeros");
        System.out.println("Ingresa un numero para calcular");
        a = escaner.nextDouble();
        System.out.println("Ingresa la operacion matematica");
        System.out.println("Digita 1 si es suma");
        System.out.println("Digita 2 si es resta");
        System.out.println("Digita 3 si es multiplicacion");
        System.out.println("Digita 4 si es division");
        operacion = escaner.nextInt();
        System.out.println("Ingresa un numero para calcular");
        b = escaner.nextDouble();

        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator.substract(5,7));
        System.out.println(myCalculator.multiply(5,7));
        System.out.println(myCalculator.divide(5,7));
    }
}