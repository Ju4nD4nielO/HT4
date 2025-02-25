package factorys;
import models.*;

public class factoryList<T> {
    public List<T> getList(String type) {
        switch (type.toLowerCase()) {
            case "simple":
                return new ListaSimple<T>();
            case "doble":
                return new ListaDoble<T>();
            default:
                throw new IllegalArgumentException("Tipo invalido");
        }
    }
}

