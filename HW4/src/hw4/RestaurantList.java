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
    
    public List getList() { return rList; }
    public void add(Restaurant r) {rList.add(r);}
    public void remove(int i){ rList.remove(i);}
    
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

    public int getSize() {return rList.size();}
    public Object getElementAt(int i) {return rList.get(i);}
}
