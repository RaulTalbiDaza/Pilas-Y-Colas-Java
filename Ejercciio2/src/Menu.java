import java.util.InputMismatchException;
import Nodo.Cola;
import java.util.Scanner;

// Clase con la función principal para dejar el Main lo más vacío posible

public class Menu {
    public void menu(Cola<String> cola, Scanner sc){
        // seguirMenu para repetir el menú hasta que el usuario pulse 4
        boolean seguirMenu = true;

        while (seguirMenu){
            // valido para repetir la depuración de la opción y reiniciarlo en cada vuelta del menú
            boolean valido = false;
            int opcion = 0;
            System.out.println("1. Llegada");
            System.out.println("2. Atender");
            System.out.println("3. Mostrar cola");
            System.out.println("4. Salir");
            System.out.println("Selecciona una opción del menú: ");


            while (!valido){
                // Try catch para depurar si se mete una letra en la opción
                try{
                    opcion = Integer.parseInt(sc.nextLine().trim());
//                    // Scanner para limpiar el buffer y poder leer el String
//                    sc.nextLine();
                    valido = true;
                }catch (NumberFormatException e){
                    System.out.println("Tienes que ingresar un número entero. Ingresalo de nuevo");
                }
            }


            switch(opcion){
                case 1:

                    System.out.println("Ingresa el nombre del cliente: ");
                    // Offer para añadir el cliente a la cola
                    cola.offer(sc.nextLine());
                    break;

                case 2:
                    // Poll para sacar el primer valor que haya en la cola
                    System.out.println("Cliente atendido: " + cola.poll());
                    break;

                case 3:
                    System.out.println("Mostrando cola...");
                    cola.mostrar();
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    seguirMenu = false;
                    break;

                default:
                    System.out.println("Opcion inválida");
//                    seguirMenu = false;
            }
        }

    }


}
