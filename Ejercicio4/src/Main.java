import Nodo.Pila;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila<Integer> binario = new Pila<Integer>();
        boolean valido = false;
        int num = 0;

        // Esta variable es para guardar el número que se mete inicialmente y mostrarlo en el System.out.println de más abajo
        int numOriginal = 0;
        System.out.println("Ingresa un número entero decimal positivo para convertirlo en binario: ");

        // bucle While para depurar que no se introduzcan letras y que no se introduzcan números negativos
        while(!valido){
            try{
                // Utilizo el Integer.parseInt para recoger la excepción NumberFormatException si se introdujese una letra
                num = Integer.parseInt(sc.nextLine().trim());
                while(num < 0){
                    System.out.println("El número debe ser positivo. Ingresalo otra vez");
                    num = Integer.parseInt(sc.nextLine().trim());
                }
                valido = true;
            }catch(NumberFormatException e){
                System.out.println("El número debe ser un número entero. Ingresalo de nuevo");
            }
        }
        numOriginal = num;

        // Bucle While que coge el resto de la división lo guarda en una variable cambia el número que se introdujo dividiéndolo entre 2 y hace push del resto en la Pila
        while(num != 0){
            int resto = num % 2;
            num = num / 2;
            binario.push(resto);
        }

        // System.out.println usado con la variable de antes numOriginal
        System.out.println("El número "+ numOriginal + " en binario es:");

        // Bucle While para mostrar el número binario
        while(!binario.isEmpty()){
            System.out.print(binario.pop() + " ");
        }



        
    }
}
