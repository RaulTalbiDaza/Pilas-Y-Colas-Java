import Nodo.Cola;   // pon aquí el nombre de tu paquete
import Nodo.Pila;
import java.util.Scanner;

public class Main {

    // Normaliza el texto: todo en minúsculas y sin espacios
    public static String normalizar(String texto) {
        return texto.toLowerCase().replaceAll("\\s+", "");
    }

    public static boolean esPalindromo(String texto) {
        String limpio = normalizar(texto);

        Pila<Character> pila = new Pila<Character>();
        Cola<Character> cola = new Cola<Character>();

        // Se inserta cada carácter en la pila y en la cola
        for (int i = 0; i < limpio.length(); i++) {
            char c = limpio.charAt(i);
            pila.push(c);
            cola.offer(c);
        }

        // Se desapila (lectura inversa) y se desencola (lectura directa)
        // comparando los elementos correspondientes
        while (!pila.isEmpty()) {
            char dePila = pila.pop();    // último carácter, luego el penúltimo...
            char deCola = cola.poll();   // primer carácter, luego el segundo...
            if (dePila != deCola) {
                return false;            // basta con que uno no coincida
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una palabra o frase: ");
        String texto = sc.nextLine();

        if (normalizar(texto).isEmpty()) {
            System.out.println("No has escrito ningún carácter.");
        } else if (esPalindromo(texto)) {
            System.out.println("\"" + texto + "\" ES un palíndromo.");
        } else {
            System.out.println("\"" + texto + "\" NO es un palíndromo.");
        }
    }
}