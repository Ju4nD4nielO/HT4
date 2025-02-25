package models;

import java.util.LinkedList;

public class ListaDoble<T> {
    private LinkedList<T> elementos;

    public ListaDoble() {
        this.elementos = new LinkedList<>();
    }

    public void addFirst(T elemento) {
        elementos.addFirst(elemento);
    }

    public T eliminarFirst() {
        if (!elementos.isEmpty()) {
            return elementos.removeFirst();
        }
        return null;
    }

    public T getFirst() {
        if (!elementos.isEmpty()) {
            return elementos.getFirst();
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
