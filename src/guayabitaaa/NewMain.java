
package guayabitaaa;


public class NewMain {

    public static void main(String[] args) {
        
        System.out.println("Bienvenido al juego de la Guayabita");
        System.out.println("Sus reglas son:");
        System.out.println("Primer regla: si el Dado cae en la cara del uno , el judador que lanzo el dado tendra que poner una moneda en la mesa");
        System.out.println("Segunda regla: Si el Dado caen entre 2 y 5 el jugador tendra que apostar 'ojo la apuesta no tiene que superar lo que halla en la mesa'");
        System.out.println("Tercera regla:si el dado cae en 6 todos los jugadores tendran que poner sobre la mesa");
        
        Turnos t= new Turnos();
        
        t.jugadores();
        t.juego();
    }
    
}
