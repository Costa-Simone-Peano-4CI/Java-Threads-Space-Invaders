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

import java.awt.Canvas;
import java.awt.Color;

/**
 *
 * @author simon
 */
public class Space extends Canvas {

    public Space() {
        //In questa classe creiamo lo sfondo per il nostro gioco
        
        System.out.println("Imposto lo sofndo ,attendi");

        setBackground(Color.BLACK);

        setSize(800, 500);
    }

}
