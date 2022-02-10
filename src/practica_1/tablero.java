package practica_1;

import java.util.Scanner;

public class tablero {

    public void tablero1() {

        Scanner lector = new Scanner(System.in);
        String pacman_player;
        System.out.println("Ingrese su nombre ");
        pacman_player = lector.nextLine();
        for (int i = 0; i <= 40; i++) {
            for (int j = 0; j <= 15; j++) {
                System.out.print("||");
            }
            System.out.print("--");
        }
    }

    public void pacman() {
        int [] pacman = {0}; 
    
    }
}
