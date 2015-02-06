/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package virus;
import javax.swing.JFrame;
import java.util.Random;
/**
 *
 * @author Joseph
 */
public class Virus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int y = 0;
        int x = 0;
        Random gen = new Random();
        
        while(true)
        {
            JFrame jf = new JFrame();
            x = gen.nextInt() % 1366;
            y = gen.nextInt() % 768;
            jf.setLocation(x, y);
            jf.setVisible(true);
        }
    }
    
}
