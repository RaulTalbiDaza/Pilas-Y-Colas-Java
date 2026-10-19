import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<String> clientes = new LinkedList<>();
        Menu menu = new Menu();
        menu.menu(clientes, sc);
    }
}
