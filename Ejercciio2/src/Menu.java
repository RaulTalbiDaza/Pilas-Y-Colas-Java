import java.util.InputMismatchException;
import java.util.Queue;
import java.util.Scanner;

// Clase con la función principal para dejar el Main lo más vacío posible

public class Menu {
    public void menu(Queue<String> cola, Scanner sc){
        // valido para repetir la depuración de la opción
        boolean valido = false;
        // seguirMenu para repetir el menú hasta que el usuario pulse 4
        boolean seguirMenu = true;

        while (seguirMenu){
            int opcion = 0;
            System.out.println("1. Llegada");
            System.out.println("2. Atender");
            System.out.println("3. Mostrar cola");
            System.out.println("4. Salir");
            System.out.println("Selecciona una opción del menú: ");


            while (!valido){
                // Try catch para depurar si se mete una letra en la opción
                try{
                    opcion = sc.nextInt();
                    valido = true;
                }catch (InputMismatchException e){
                    System.out.println("Tienes que ingresar un número entero. Ingresalo de nuevo");
                    valido = false;
                }
            }


            switch(opcion){
                case 1:
                    // Scanner para limpiar el buffer y poder leer el String
                    sc.nextLine();
                    System.out.println("Ingresa el nombre del cliente: ");
                    // Offer para añadir el cliente a la cola
                    cola.offer(sc.next());
                    break;

                case 2:
                    // Poll para sacar el primer valor que haya en la cola
                    System.out.println("Cliente atendido: " + cola.poll());
                    break;

                case 3:
                    System.out.println("Mostrando cola...");
                    System.out.println(cola);
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
