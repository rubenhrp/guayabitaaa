
package guayabitaaa;

import java.util.Random;

public class Dado {

    protected int tirarDado(){
       
        int numD;
        Random Dado  = new Random();
        
        System.out.println("se tiro el dado y el resultado es:");
        numD=(Dado.nextInt(6)+1);
        
        System.out.println( numD);
    
        if ( numD>0&&  numD<2){
          System.out.println("Regla 1");
            System.out.println("solo el que lanzo el dado pone en la mesa (pierde una moneda)");
        }
        if ( numD>=2 &&  numD<=5){
           System.out.println("Regla 2");
            System.out.println(" el que lanzo apuesta ( puede apostar como minimo una moneda y como maximo lo que este en la mesa)");
        }
        if ( numD>5&&  numD<7){
           System.out.println("Regla 3");
            System.out.println("todos ponen sobre la mesa (pierden una moneda )");
        }
        
        return numD;
    }
    
    
}
