
package juegocartas;

/**
 *
 * @author andres felipe salazar ramos
 */

import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class Carta {
    
    private int indice;
    
    public int getIndice(){
       return indice;
   }
    
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
    
    //DEVOLVER EL NOMBRE DE LA CARTA
    public NombreCarta getNombre(){
        int numero= indice % 13;
        if(numero==0){
            numero=13;
        }
        //trabajo con el vector
        return NombreCarta.values()[numero-1];
    }
    
    //mostrar en el panel
    public void mostrar(JPanel pnl, int x, int y ){
        String nombreImagen="/imagenes/carta"+String.valueOf(indice)+".jpg";
        
   
        
        ImageIcon imagen = new ImageIcon(getClass().getResource(nombreImagen));
        JLabel lbl = new JLabel(imagen);
        lbl.setBounds(x, y, imagen.getIconWidth(), imagen.getIconHeight());

        pnl.add(lbl);
    }
    
    
    
}
