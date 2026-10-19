import Nodo.Cola;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cola<String> clientes = new Cola<String>();
        Menu menu = new Menu();
        menu.menu(clientes, sc);
    }
}
