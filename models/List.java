package models;

public interface List<T> {
    void addFirst(T item);
    T eliminarFirst();
    T getFirst();
    boolean isEmpty();
}

