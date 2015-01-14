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
    
    public int getValue() { return value;}
    
    public void roll()
    {
        Random gen = new Random();
        value = (gen.nextInt(6) + 1);
    }
    
}
