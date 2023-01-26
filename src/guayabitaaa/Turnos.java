
package guayabitaaa;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class Turnos {
    
    String nombre;
    int dinero;
    
    Jugador j[]= new Jugador[4];
    
    Scanner sn = new Scanner(System.in);
    
    protected void jugadores(){
        
        for(int i=0;i<j.length;i++){
        System.out.println("nombre de jugador"+(i+1)+"+");
        nombre = sn.nextLine();
        System.out.println("dinero "+(i+1)+"+");
        dinero = sn.nextInt();
        
        j[i] = new Jugador (nombre,dinero);
        
        }
    }
    
    protected void juego(){
        
        
    }
    
}
