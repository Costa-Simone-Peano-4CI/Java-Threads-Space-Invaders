/*
 * /*
 * ****************************
 * *    2020(c)Project by    *
 * *                          *
 * *       Costa Simone       *
 * *          4C Inf          *
 * *                          *
 * ****************************
 * */
package space_invaders;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author simon
 */
public class Intro extends Space{
    
    @Override
        public void paint(Graphics g) {
            
            //Setta il colore blu alla nostra scritta
            g.setColor(Color.blue);
            
            // Seleziona i Font della scritta (ROMAN_BASELINE) e la dimensione dei caratteri (40)
            g.setFont(new Font("ROMAN_BASELINE", Font.ROMAN_BASELINE, 40));
            
            // Scrive "Space Invaders" partendo dalla posizione x=100 e y=100
            g.drawString("Space Invaders", 100, 100);
            
            //Imposta la grandezza di by "utente"
            g.setFont(new Font("ROMAN_BASELINE", Font.ROMAN_BASELINE, 10));
            
            //Scrive by "utente"
            g.drawString("          by Simone Costa", 340, 110); 
            
        }
         public  void run() {
        this.repaint();
    }
}
