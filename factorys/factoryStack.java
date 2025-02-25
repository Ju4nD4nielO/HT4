package factorys;
import models.*;

public class factoryStack<T> {
    public Stack<T> getStack(String type) {
        switch (type.toLowerCase()) {
            case "arraylist":
                return new ArrayListStack<>();
            case "vector":
                return new VectorStack<>();
            default:
                throw new IllegalArgumentException("Tipo invalido.");
        }
    }
}
