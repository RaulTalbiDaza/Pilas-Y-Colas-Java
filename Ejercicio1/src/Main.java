import java.util.Scanner;
import Nodo.Pila;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila<Character> fraseOriginal = new Pila<Character>();
        System.out.println("Ingresa la frase: ");
        String frase = sc.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            fraseOriginal.push(frase.charAt(i));
        }

        fraseOriginal.mostrar();
    }
}
