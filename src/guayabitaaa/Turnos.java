
package guayabitaaa;

import java.util.Scanner;


public class Turnos {
    
    Scanner sn = new Scanner(System.in);
    
    String nombre;
    int dinero;
    
    Jugador j[]= new Jugador[4];

    
    protected void jugadores(){
        
        for(int i=0;i<j.length;i++){
            
            
            System.out.println("nombre de jugador "+(i+1)+":");
            nombre = sn.nextLine();
            System.out.println("dinero del jugador "+(i+1)+":");
            dinero = sn.nextInt();
            sn.nextLine();
        
            j[i] = new Jugador (nombre,dinero);
            
        }
    }
    
    protected void juego(){
        
            Dado da = new Dado();
            dineroMesa dm = new dineroMesa();
            dm.setNombre("Mesa");
            
        int opcionj1, numD,numD2,regla,apuesta;
        numD=0;
        
        
        System.out.println("empieza el juego ");
        System.out.println("cuanto dinero debe tener la mesa?");
        dinero = sn.nextInt();
        dm.setDinero(dinero);
        
        
        
        do{
            
            
             if(j[0].getDinero()>0){
                 
                 //turno jugador 1
                 System.out.println("turno jugador 1");
                 do{
                     System.out.println("jugador 1 desea lanzar el dado?");
                     System.out.println("  1  para si ");
                     System.out.println("  2  para no");
                     opcionj1 = sn.nextInt();
                 }while(opcionj1!=1);
        
                 numD=da.tirarDado();
                 
                 
                 
                 //caso 1 
                 if ( numD>0&&  numD<2){
                     System.out.println("Regla 1");
                     System.out.println("solo el que lanzo el dado pone en la mesa (pierde una moneda)");
                    j[0].PerderDinero(1);
                    System.out.println(dm.dineroM());
                    System.out.println(j[0].mostrarJ());
            
                     
                 }else{
            
                 }
                 //caso 2 
                 if ( numD>=2 &&  numD<=5){
                     System.out.println("Regla 2");
                     System.out.println(" el que lanzo apuesta ( puede apostar como minimo una moneda y como maximo lo que este en la mesa)");
                     System.out.println("cuanto desea apostar?");
                     apuesta = sn.nextInt();
                     System.out.println("el jugador 1 tira el dado de nuevo");
                     numD2=da.tirarDado();
                    if(numD2>numD){
                        dm.PerderDinero(apuesta);
                        j[0].GanarDinero((apuesta*2));
                        System.out.println(dm.dineroM());
                        System.out.println(j[0].mostrarJ());
                                 
                    }else{
                        dm.PerderDinero(apuesta);
                        j[0].PerderDinero((apuesta));
                        System.out.println(dm.dineroM());
                        System.out.println(j[0].mostrarJ());
                         }
            
                    
                 }else{
                    
                    
                    }
                 //caso 3 
                    if ( numD>5&&  numD<7){
                        
                        System.out.println("Regla 3");
                        System.out.println("todos ponen sobre la mesa (pierden una moneda )");
                        j[0].PerderDinero(1);
                        j[1].PerderDinero(1);
                        j[2].PerderDinero(1);
                        j[3].PerderDinero(1);
                        System.out.println(j[0].mostrarJ());
                        System.out.println(j[1].mostrarJ());
                        System.out.println(j[2].mostrarJ());
                        System.out.println(j[3].mostrarJ());
                        System.out.println(dm.dineroM());
                    }else{
                        
                        }
                 }else{}
             
             
             if(j[1].getDinero()>0){
                 
                 
                     
                 //turno jugador 2
                 System.out.println("turno jugador 2");
                 
                 do{
                     System.out.println("jugador 2 desea lanzar el dado?");
                     System.out.println("  1  para si ");
                     System.out.println("  2  para no");
                     opcionj1 = sn.nextInt();
                 }while(opcionj1!=1);
        
                 numD=da.tirarDado();
                 
                 
                 //caso 1 
                 if ( numD>0&&  numD<2){   
                     System.out.println("Regla 1");
                     System.out.println("solo el que lanzo el dado pone en la mesa (pierde una moneda)");
                    j[1].PerderDinero(1);
                    System.out.println(dm.dineroM());
                    System.out.println(j[0].mostrarJ());
            
                     
                 }else{
            
                 }
                 //caso 2 
                 if ( numD>=2 &&  numD<=5){
                     System.out.println("Regla 2");
                     System.out.println(" el que lanzo apuesta ( puede apostar como minimo una moneda y como maximo lo que este en la mesa)");
                     System.out.println("cuanto desea apostar?");
                     apuesta = sn.nextInt();
                     System.out.println("el jugador 1 tira el dado de nuevo");
                     numD2=da.tirarDado();
                    if(numD2>numD){
                        dm.PerderDinero(apuesta);
                        j[1].GanarDinero((apuesta*2));
                        System.out.println(dm.dineroM());
                        System.out.println(j[1].mostrarJ());
                                 
                    }else{
                        dm.PerderDinero(apuesta);
                        j[1].PerderDinero((apuesta));
                        System.out.println(dm.dineroM());
                        System.out.println(j[1].mostrarJ());
                         }
            
                   
                 }else{
                    
                    
                    }
                    //caso 3
                    if ( numD>5&&  numD<7){
                        System.out.println("Regla 3");
                        System.out.println("todos ponen sobre la mesa (pierden una moneda )");
                        j[0].PerderDinero(1);
                        j[1].PerderDinero(1);
                        j[2].PerderDinero(1);
                        j[3].PerderDinero(1);
                        System.out.println(j[0].mostrarJ());
                        System.out.println(j[1].mostrarJ());
                        System.out.println(j[2].mostrarJ());
                        System.out.println(j[3].mostrarJ());
                        System.out.println(dm.dineroM());
                    }else{
                        
                        }
                 
                 }else{}
             
             if(j[2].getDinero()>0){
                 
                 
                 //turno jugador 3
                 
                 do{
                     System.out.println("jugador 3 desea lanzar el dado?");
                     System.out.println("  1  para si ");
                     System.out.println("  2  para no");
                     opcionj1 = sn.nextInt();
                 }while(opcionj1!=1);
        
                 numD=da.tirarDado();
                 
                 System.out.println("turno jugador 3");
                 //caso 1 
                 if ( numD>0&&  numD<2){   
                     System.out.println("Regla 1");
                     System.out.println("solo el que lanzo el dado pone en la mesa (pierde una moneda)");
                    j[2].PerderDinero(1);
                    System.out.println(dm.dineroM());
                    System.out.println(j[0].mostrarJ());
            
                   
                 }else{
            
                 }
                 //caso2
                 if ( numD>=2 &&  numD<=5){
                     System.out.println("Regla 2");
                     System.out.println(" el que lanzo apuesta ( puede apostar como minimo una moneda y como maximo lo que este en la mesa)");
                     System.out.println("cuanto desea apostar?");
                     apuesta = sn.nextInt();
                     System.out.println("el jugador 1 tira el dado de nuevo");
                     numD2=da.tirarDado();
                    if(numD2>numD){
                        dm.PerderDinero(apuesta);
                        j[2].GanarDinero((apuesta*2));
                        System.out.println(dm.dineroM());
                        System.out.println(j[2].mostrarJ());
                                 
                    }else{
                        dm.PerderDinero(apuesta);
                        j[2].PerderDinero((apuesta));
                        System.out.println(dm.dineroM());
                        System.out.println(j[2].mostrarJ());
                         }
            
                 //caso 3    
                 }else{
                    
                    
                    }
                    //caso 3
                    if ( numD>5&&  numD<7){
                        System.out.println("Regla 3");
                        System.out.println("todos ponen sobre la mesa (pierden una moneda )");
                        
                        
                        j[0].PerderDinero(1);
                        j[1].PerderDinero(1);
                        j[2].PerderDinero(1);
                        j[3].PerderDinero(1);
                        System.out.println(j[0].mostrarJ());
                        System.out.println(j[1].mostrarJ());
                        System.out.println(j[2].mostrarJ());
                        System.out.println(j[3].mostrarJ());
                        System.out.println(dm.dineroM());
                    }else{
                        
                        }
                 
                 
                 }else{}
             
             
             if(j[3].getDinero()>0){
                 
                 
                 //turno jugador 4
                 System.out.println("turno jugador 4");
                 
                 do{
                     System.out.println("jugador 4 desea lanzar el dado?");
                     System.out.println("  1  para si ");
                     System.out.println("  2  para no");
                     opcionj1 = sn.nextInt();
                 }while(opcionj1!=1);
        
                 numD=da.tirarDado();
                 
                 //caso 1 
                 if ( numD>0&&  numD<2){  
                     System.out.println("Regla 1");
                     System.out.println("solo el que lanzo el dado pone en la mesa (pierde una moneda)");
                    j[3].PerderDinero(1);
                    System.out.println(dm.dineroM());
                    System.out.println(j[3].mostrarJ());
            
                    
                 }else{
            
                 }
                 //caso 2
                 if ( numD>=2 &&  numD<=5){
                     System.out.println("Regla 2");
                     System.out.println(" el que lanzo apuesta ( puede apostar como minimo una moneda y como maximo lo que este en la mesa)");
                     System.out.println("cuanto desea apostar?");
                     apuesta = sn.nextInt();
                     System.out.println("el jugador 1 tira el dado de nuevo");
                     numD2=da.tirarDado();
                    if(numD2>numD){
                        dm.PerderDinero(apuesta);
                        j[3].GanarDinero((apuesta*2));
                        System.out.println(dm.dineroM());
                        System.out.println(j[3].mostrarJ());
                                 
                    }else{
                        dm.PerderDinero(apuesta);
                        j[3].PerderDinero((apuesta));
                        System.out.println(dm.dineroM());
                        System.out.println(j[3].mostrarJ());
                         }
            
                    
                 }else{
                    
                    
                    }
                    //caso 3
                    if ( numD>5&&  numD<7){
                        System.out.println("Regla 3");
                        System.out.println("todos ponen sobre la mesa (pierden una moneda )");
                        j[0].PerderDinero(1);
                        j[1].PerderDinero(1);
                        j[2].PerderDinero(1);
                        j[3].PerderDinero(1);
                        System.out.println(j[0].mostrarJ());
                        System.out.println(j[1].mostrarJ());
                        System.out.println(j[2].mostrarJ());
                        System.out.println(j[3].mostrarJ());
                        System.out.println(dm.dineroM());
                    }else{
                        
                        }
                 
                 
                 
                 }else{}
             
             
             
             
             
        
             }while(dm.getDinero()>0); 
    }
     
}
