package polandNotation;
import java.util.Stack;

public class resolutionPolandInverse {
    public static Double resolution(String polandNumber){
        Stack<Double> stack = new Stack<>();
        for (int i = 0; i < polandNumber.length(); i++) {
            char charArray = polandNumber.charAt(i);
            if(convertInverse.hierarchyInverse(charArray) > 0){
                double op1 = stack.pop();
                double op2 = stack.pop();
                double aux = operation(op1, op2, charArray);
                stack.push(aux);
            } // termina if
            else { // operandos
                stack.push((double) (charArray - '0'));
            } // termina else
        } //termina FOR
        double result = stack.pop();
        return result;
    }
    public static Double operation(double op1, double op2, char operator){
        //lambdas
        return switch (operator){
            case '+' -> op1 + op2;
            case '-' -> op2 - op1;
            case '*' -> op1 * op2;
            case '/' -> op2 / op1;
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }
}
