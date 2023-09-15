
package juegocartas;

/**
 *
 * @author andres felipe salazar ramos
 */

import java.util.Random;

public class Carta {
    
    private int indice;
    
    public Carta(Random r){
        indice=r.nextInt(52)+1;//aleatoriamente asigna un numero
    }
    
    public Pinta getPinta(){
        if(indice<=13){
            return  Pinta.TREBOL;
        }
        else if(indice<=26){
            return Pinta.PICA;
        }
        else if(indice<=39){
            return Pinta.CORAZON;
        }
        else{
            return Pinta.DIAMANTE;
        }
    }
}
