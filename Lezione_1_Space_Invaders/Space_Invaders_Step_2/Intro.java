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
public class Intro extends Space {

    private int i = 0;

    void run() throws InterruptedException {
        setBackground(Color.BLACK);
        setSize(800, 600);

        for (i = 100; i >= 0; i -= 1) {
            System.out.println("i: " + i);
            this.repaint();
            Thread.sleep(30);
        }
    }

   
 
    @Override
    public void paint(Graphics g) {

        //Setta il colore blu alla nostra scritta
        g.setColor(Color.blue);

        // Seleziona i Font della scritta (ROMAN_BASELINE) e la dimensione dei caratteri (40)
        g.setFont(new Font("ROMAN_BASELINE", Font.ROMAN_BASELINE, 40+i));

        // Scrive "Space Invaders" partendo dalla posizione x=100 e y=100
        g.drawString("Space Invaders", 100+i, 100+i);

        //Imposta la grandezza di by "utente"
        g.setFont(new Font("ROMAN_BASELINE", Font.ROMAN_BASELINE, 10+i));

        //Scrive by "utente"
        g.drawString("          by Simone Costa", 340+i+i, 110+i+i);

    }

   
}
