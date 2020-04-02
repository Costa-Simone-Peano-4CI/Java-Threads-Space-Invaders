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
import java.awt.image.BufferStrategy;
import java.awt.Graphics2D;

/**
 *
 * @author simon
 */
public class Intro extends Space {

    private int i = 0;
    private BufferStrategy strategy;

    void run() throws InterruptedException {
        
        createBufferStrategy(2);
        
        strategy = getBufferStrategy();

        for (i = 100; i >= 0; i -= 1) {
            
            this.paint();
            
            Thread.sleep(10);
        }
    }

    public void paint() {

        Graphics2D g = (Graphics2D) strategy.getDrawGraphics();
        
        setBackground(Color.BLACK);
        
        g.fillRect(0, 0, 800, 600);
        
        //Setta il colore alla nostra scritta,nel mio caso blu
        g.setColor(Color.blue);

        // Seleziona i Font della scritta (ROMAN_BASELINE) e la dimensione dei caratteri (40)
        g.setFont(new Font("ROMAN_BASELINE", Font.ROMAN_BASELINE, 40 + i));

        // Scrive "Space Invaders" partendo dalla posizione x=100 e y=100
        g.drawString("Space Invaders", 100 + i, 100 + i);

        //Imposta la grandezza di by "utente"
        g.setFont(new Font("ROMAN_BASELINE", Font.ROMAN_BASELINE, 10 + i));

        //Scrive by "utente"
        g.drawString("          by Simone Costa", 340 + i + i, 110 + i + i);

        g.dispose();

        strategy.show();
    }

}
