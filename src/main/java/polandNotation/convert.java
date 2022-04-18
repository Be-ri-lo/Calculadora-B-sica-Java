package polandNotation;
import java.util.Stack;

public class convert {
    public static StringBuilder convertPoland(String polandNumber){
        //String Builder sirve para jugar y modificar los caracteres
        StringBuilder resultPolandNumber = new StringBuilder();
        StringBuilder normalNumber = new StringBuilder(polandNumber);
        normalNumber.reverse();
        //para utilizar la forma de la pila.
        Stack<Character> stack = new Stack<>();
        //Arreglo de caracteres para trabajar con los elementos y hacer las comparaciones
        char[] charPolandNumber = new String(normalNumber).toCharArray();

        //3 for, para corregir los parentesis, la jerarquía de operadores y numeros
        // 1ero, para que invierta los parentesis de forma correcta.
        for (int i = 0; i < charPolandNumber.length; i++) {
            if(charPolandNumber[i] == '('){
                charPolandNumber[i] = ')';
                i++;
            }//Termina IF.
            // Se chequea la forma inversa.
            else if (charPolandNumber[i] == ')'){
                charPolandNumber[i] = '(';
                i++;
            } //Termina ELSE IF.
        } // Termino de primer FOR.

        // recorrer los caracteres, Con este se empieza a llenar la pila o stack, al ir leyendo los numeros y operadores.
        for (int i = 0; i < charPolandNumber.length; i++) {
            // variable para caracter, si es un operador debemos ver las jerarquias.
            char charArray = charPolandNumber[i];

            // Si nos encontramos con un operador, un parentesis y un numero.
            if(hierarchy(charArray) > 0){
                while (stack.isEmpty() == false && hierarchy(stack.peek()) >= hierarchy(charArray)) {
                    resultPolandNumber.append(stack.pop());
                } // termina while.
                // al stack se le hace un push al caracter que se esta evaluando.
                stack.push(charArray);
            }
            // Parentesis de cierre.
            else if(charArray == ')'){
                //Iremos quitando los elementos del stack hasta encontrar el parentesis de cierre.
                char aux = stack.pop();
                while (aux != '(') {
                    resultPolandNumber.append(aux);
                    aux = stack.pop();
                }
            }
            // Parentesis de apertura.
            else if(charArray == '(') {
                stack.push(charArray);
            }
            // si es un espacio
            /*else if(charArray == ' '){
                charArray = '';
                i++;
            }*/
            // Si es un numero
            else {
                resultPolandNumber.append(charArray);
            }
        } //Termina segundo FOR.

        // Esto es para vaciar el stack y así meter los elementos en la conversion poland
        for (int i = 0; i <= stack.size(); i++) {
            resultPolandNumber.append(stack.pop());
        } //Termina tercer FOR.
        //Hago un reverse para que el orden sea el correcto.
        return resultPolandNumber.reverse();

    } // termina convert

    static int hierarchy(char charArray) {
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
