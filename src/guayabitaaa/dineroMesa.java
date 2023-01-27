
package guayabitaaa;


public class dineroMesa extends Persona implements GanarDinero,PerderDinero {

    public dineroMesa() {
    }

    
    public dineroMesa(String nombre,int dinero ) {
        this.nombre = nombre;
        this.dinero = dinero;
    }
    
    
    protected String dineroM(){
        return "el dinero en la mesa es:"+dinero;
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
