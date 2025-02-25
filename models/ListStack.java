package models;

public class ListStack<T> implements Stack<T> {
    private List<T> stack;

    public ListStack(List<T> list) { 
        this.stack = list; 
    }

    public void push(T item) { 
        stack.addFirst(item); 
    }

    public T pop() { 
        return stack.isEmpty() ? null : stack.eliminarFirst(); 
    }

    public T peek() { 
        return stack.isEmpty() ? null : stack.getFirst(); 
    }

    public boolean isEmpty() { 
        return stack.isEmpty(); 
    }
}
