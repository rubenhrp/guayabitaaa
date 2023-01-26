
package guayabitaaa;

/**
 *
 * @author ruben
 */
public class Jugador extends Persona{

    public Jugador(String nombre,int dinero ) {
        this.nombre = nombre;
        this.dinero = dinero;
    }
    
    protected String mostrarJ(){
        return "nombre del jugador "+nombre+"dinero del jugador"+dinero;
    }
    
    @Override
    protected void ganarDinero(int dinero) {
        this.dinero -= dinero;
    }

    @Override
    protected void perderDinero(int dinero) {
        this.dinero += dinero;
    }
    
}
