package Nodo;

public class Pila<T> {
    private Nodo<T> tope;
    private int tamano;

    public void push(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        nuevo.setSiguiente(tope);   // el nuevo apunta al antiguo tope
        tope = nuevo;               // el nuevo pasa a ser el tope
        tamano++;
    }

    public T pop() {
        if (isEmpty()) return null;
        T dato = tope.getDato();
        tope = tope.getSiguiente(); // el tope pasa a ser el siguiente
        tamano--;
        return dato;
    }

    public T peek() {
        return isEmpty() ? null : tope.getDato();
    }

    public boolean isEmpty() { return tope == null; }

    public int size() { return tamano; }

    public void mostrar() {
        Nodo<T> actual = tope;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }
}
