
package guayabitaaa;

/**
 *
 * @author ruben
 */
public abstract class Persona{
    
    protected String nombre;
    protected int dinero;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }
        
    protected abstract void ganarDinero(int dinero);
    protected abstract void perderDinero(int dinero);
}
//jdghgfhgfddh