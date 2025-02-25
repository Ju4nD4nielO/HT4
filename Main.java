import java.util.Scanner;
import models.*;
import factorys.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        factoryStack<Integer> stackFactory = new factoryStack<>();
        factoryList<Integer> listFactory = new factoryList<>();

        System.out.println("Seleccionar una de las siguientes opciones: \narraylist, \nvector, lista) ");
        String stackType = scanner.nextLine().toLowerCase();

        Stack<Integer> stack;
        if (stackType.equals("lista")) {
            System.out.println("Seleccionar una de las siguientes listas: \nsimple, \ndoble): ");
            String listType = scanner.nextLine().toLowerCase();
            List<Integer> list = listFactory.getList(listType);
            stack = new ListStack<>(list);
        } else {
            stack = stackFactory.getStack(stackType);
        }

        Calculadora calc = Calculadora.getInstance();

        System.out.println("iingrese su expresion:");
        String infixExpression = scanner.nextLine();

        String postfix = calc.convertirAPostfix(infixExpression);
        System.out.println("Expresión en postfix: " + postfix);

        int resultado = calc.evaluarPostfix(postfix);
        System.out.println("Resultado de operacion: " + resultado);
    }
}
