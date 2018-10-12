/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author pilar
 */
public class Columna {
    
    Rectangle2D capitel, base;
    int hueco = 40;
    int altura_columna = 300;
    int ancho_columna = 40;
    
    
    int hueco = 20;
    
    public Columna (){
        
        capitel = new Rectangle2D.Double (0,0,20,200);
        base = new Rectangle2D.Double (0, 220, 20,200);
         
    }

    Columna(int ANCHOPANTALLA) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public void mueve (Graphics2D g2){
         capitel.setFrame (capitel.getX()-1,)
     }
     
     
     private void mueveColumna (Rectangle2D.Double r){
         
         if (r.getX()<0){
         r.setFrame(r.getX()-1, r.getY(), r.getWidth(), r.getHeight());
     }
         else {
             r.setFrame (r.getX()-1, r, getY (), r.getWidth(), r.getHeight());
        
         
         }
         }
}
