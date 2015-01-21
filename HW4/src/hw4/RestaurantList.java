/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;
import java.util.*;
import javax.swing.DefaultListModel;

/**
 *
 * @author Joseph
 */
public class RestaurantList{
    
    private List rList = new ArrayList<Restaurant>();
    
    /**
     * Returns the list of Restaurants
     * @return 
     */
    public List getList() { return rList; }
    
    /**
     * Adds a restaurant to the list of restaurants
     * @param r 
     */
    public void add(Restaurant r) {rList.add(r);}
    
    /**
     * removes a restaurant from the list of restaurants
     * @param i 
     */
    public void remove(int i){ rList.remove(i);}
    
    /**
     * populates the list from the directory where the restaurant data is stored
     */
    public void popList()
    {
        rList.clear();
        FileIO fio = new FileIO();
        
        List files = fio.getDir();
        
        for (int i = 0; i < files.size(); i++)
        {
            fio.read((files.get(i)).toString());
            String s = fio.getInput();
            add(new Restaurant(s));
        }
    }

    /**
     * Returns the size of the list
     * @return 
     */
    public int getSize() {return rList.size();}
    
    /**
     * Returns the element at index i
     * @param i
     * @return 
     */
    public Object getElementAt(int i) {return rList.get(i);}
}
