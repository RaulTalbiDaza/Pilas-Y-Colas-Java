import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Deque<Character> fraseOriginal =  new ArrayDeque<>();
        System.out.println("Ingresa la frase: ");
        String frase = sc.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            fraseOriginal.push(frase.charAt(i));
        }

        System.out.println(fraseOriginal);
    }
}
