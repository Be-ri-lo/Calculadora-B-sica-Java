package polandNotation;
import java.util.Stack;

public class convertInverse {
    static String convertionInverse(String polandNumber){
        String polandInverse = "";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < polandNumber.length(); i++) {
            char charArray = polandNumber.charAt(i);

            if (hierarchyInverse(charArray) > 0){
                while(stack.isEmpty() == false && hierarchyInverse(stack.peek()) >= hierarchyInverse(charArray)) {
                    polandInverse += stack.pop();
                }
                stack.push(charArray);
            } else if (charArray == ')'){
                char aux = stack.pop();
                while(aux != '('){
                    polandInverse += aux;
                    aux = stack.pop();
                }
            } else if ( charArray == '('){
                stack.push(charArray);
            }
            else {
                polandInverse += charArray;
            }
        }
        for (int i = 0; i < stack.size(); i++) {
            polandInverse += stack.pop();
        }
        return polandInverse;
    }

    public static int hierarchyInverse(char charArray) {
        switch (charArray){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        } // termina Switch.
        //no hay ningun operador entonces son numeros, por eso se retorna el -1, de menor jerarquia.
        return -1;
    }
}
