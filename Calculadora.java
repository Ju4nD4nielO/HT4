import java.util.Stack;

public class Calculadora {
    private static Calculadora instance;

    private Calculadora() { }

    public static Calculadora getInstance() {
        if (instance == null) {
            instance = new Calculadora();
        }
        return instance;
    }

    public String convertirAPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> operadores = new Stack<>();

        for (char ch : infix.toCharArray()) {
            if (Character.isDigit(ch)) {
                postfix.append(ch).append(" ");
            } else if (ch == '(') {
                operadores.push(ch);
            } else if (ch == ')') {
                while (!operadores.isEmpty() && operadores.peek() != '(') {
                    postfix.append(operadores.pop()).append(" ");
                }
                operadores.pop(); // Remover '('
            } else {
                while (!operadores.isEmpty() && prioridad(ch) <= prioridad(operadores.peek())) {
                    postfix.append(operadores.pop()).append(" ");
                }
                operadores.push(ch);
            }
        }

        while (!operadores.isEmpty()) {
            postfix.append(operadores.pop()).append(" ");
        }

        return postfix.toString().trim();
    }

    private int prioridad(char operador) {
        switch (operador) {
            case '+': case '-': return 1;
            case '*': case '/': return 2;
            case '^': return 3;
            default: return -1;
        }
    }

    public int evaluarPostfix(String postfix) {
        Stack<Integer> stack = new Stack<>();

        for (String token : postfix.split(" ")) {
            if (token.matches("\\d+")) {
                stack.push(Integer.parseInt(token));
            } else {
                int b = stack.pop();
                int a = stack.pop();
                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                }
            }
        }
        return stack.pop();
    }
}
