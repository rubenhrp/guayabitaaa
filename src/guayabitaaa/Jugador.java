
package guayabitaaa;


public class Jugador extends Persona implements GanarDinero,PerderDinero{

    public Jugador(String nombre,int dinero ) {
        this.nombre = nombre;
        this.dinero = dinero;
    }
    
    protected String mostrarJ(){
        return "nombre del jugador "+nombre+" dinero del jugador es "+dinero+" monedas";
    }


    @Override
    public void  PerderDinero(int dinero) {
        this.dinero -= dinero;
        
    }

    @Override
    public void GanarDinero(int dinero) {
        this.dinero += dinero;
        
    }
    

    
}
