package Nodo;

public class Cola<T> {
    private Nodo<T> frente;
    private Nodo<T> fin;
    private int tamano;

    public void offer(T dato) {
        Nodo<T> nuevo = new Nodo<>(dato);
        if (isEmpty()) {
            frente = nuevo;
        } else {
            fin.setSiguiente(nuevo); // el último actual apunta al nuevo
        }
        fin = nuevo;
        tamano++;
    }

    public T poll() {
        if (isEmpty()) return null;
        T dato = frente.getDato();
        frente = frente.getSiguiente();
        if (frente == null) fin = null; // la cola se quedó vacía
        tamano--;
        return dato;
    }

    public T peek() {
        return isEmpty() ? null : frente.getDato();
    }

    public boolean isEmpty() { return frente == null; }

    public int size() { return tamano; }

    public void mostrar() {
        Nodo<T> actual = frente;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }
}
