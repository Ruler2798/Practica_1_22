/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica_1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author lphg3
 */
public class Practica_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        boolean salir = false;
        int opcion; 
 
        while (!salir) {
            
            System.out.println("1. Pig Latin");
            System.out.println("2. Operaciones bitwise");
            System.out.println("3. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = lector.nextInt();
 
                switch (opcion) {
                    case 1:
                      //pig_latin();
                        break;
                    case 2:
                        //Operaciones_bitwise();
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
