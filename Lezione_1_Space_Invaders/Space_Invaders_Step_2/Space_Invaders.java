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
        Intro intro = new Intro();
        this.add(intro);
        this.pack();
        this.setVisible(true);
        intro.run();

        //Questo l'abbiamo appreso tramite informatica,serve a chiudere il programma direttamente
        //dalla x
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) throws InterruptedException {

        new Space_Invaders();
    }

}
