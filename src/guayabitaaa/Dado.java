
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
            
        }
        if ( numD>=2 &&  numD<=5){
            
        }
        if ( numD>5&&  numD<7){
           
        }
        
        return numD;
    }
    
    
}
