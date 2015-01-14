/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;
import java.util.*;

/**
 *
 * @author Joseph
 */
public class Di {
    
    private int value;
    
    /**
     * Returns the value of value
     * This is the face value of the dice after a roll
     * @return 
     */
    public int getValue() { return value;}
    
    /**
     * This "rolls" the dice. It gets a random number 
     * from 0 to 5 and then adds 1 so that it is 1-6
     */
    public void roll()
    {
        Random gen = new Random();
        value = (gen.nextInt(6) + 1);
    }
    
}
