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

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author simon
 */
public class Space_Invaders extends JFrame {

    public Space_Invaders() throws InterruptedException {
        super("Space Invaders Costa");
        
         this.setResizable(false);
         
        setIgnoreRepaint(true);
        
         this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
         
        Intro intro = new Intro();
        
        this.add(intro);
        
        this.pack();
        
        this.setVisible(true);
        
        intro.run();
       
       
    }

    public static void main(String[] args) throws InterruptedException {

        new Space_Invaders();
    }

}
