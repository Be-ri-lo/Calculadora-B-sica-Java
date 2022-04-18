package polandNotation;

import java.util.Stack;

public class resolutionPoland {
    public static Double result(String polandNumber) { //notacion polaca
        Stack<Double> stack = new Stack<>();
        StringBuilder polNum = new StringBuilder(polandNumber);
        polNum.reverse();
        for (int i = 0; i < polNum.length(); i++) {
            char charArray = polNum.charAt(i);
            if (convert.hierarchy(charArray) > 0) { //Evaluar si es operador
                double op1 = stack.pop();
                double op2 = stack.pop();
                double aux = operation(op1, op2, charArray);
                stack.push(aux);
            } // termina IF.
            else {
                stack.push((double) (charArray - '0'));
            } // termina ELSE
        } // termina FOR.
        double result = stack.pop();
        return result;
    } //termina solucion

    public static Double operation( double op1, double op2, char operator){
        /*switch (operator) {
            case '+':
                return  op1 + op2;
            case '-':
                return  op1 - op2;
            case '*':
                return  op1 * op2;
            case '/':
                return  op1 / op2;
            case '%':
                return op1 % op2;
        }
        return 0.0;*/
        //lambdas
        return switch (operator){
            case '+' -> op1 + op2;
            case '-' -> op2 - op1;
            case '*' -> op1 * op2;
            case '/' -> op2 / op1;
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }// termina operation
}
