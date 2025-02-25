package models;

import java.util.ArrayList;

public class ListaSimple<T> {
    private ArrayList<T> elementos;

    public ListaSimple() {
        this.elementos = new ArrayList<>();
    }

    public void addFirst(T elemento) {
        elementos.add(0, elemento);
    }

    public T eliminarFirst() {
        if (!elementos.isEmpty()) {
            return elementos.remove(0);
        }
        return null;
    }

    public T getFirst() {
        if (!elementos.isEmpty()) {
            return elementos.get(0);
        }
        return null;
    }

    public boolean isEmpty() {
        return elementos.isEmpty();
    }

    public int size() {
        return elementos.size();
    }
}
