
package practica_1;

import java.util.InputMismatchException;
import java.util.Scanner;


public class menu_general {
     
    public void menu () {
      Scanner lector = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
 
        while (!salir) {
            
            System.out.println("1. Iniciar Juego");
            System.out.println("2. Ver ultimas puntuaciones");
            System.out.println("3. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = lector.nextInt();
 
                switch (opcion) {
                    case 1:
                        //tablero();
                        break;
                    case 2:
                        //puntajes();
                        break;
                    case 3:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 3");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                lector.next();
            }
      }
}
}
