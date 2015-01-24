/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package finalproject;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author jflinn18
 */
public class MyListModel {
    
    private List highsAndLows = new ArrayList<String>();
    
    /**
     * Constructor
     * @param data
     * @param todaysData 
     */
    public MyListModel(int[] data, String[][] todaysData)
    {
        for (int i = 0; i < data.length; i++)
        {
            if (data[i] == 1)
                highsAndLows.add("High at " + todaysData[i][0]);
            else if (data[i] == -1)
                highsAndLows.add("Low at " + todaysData[i][0]);
        }
    }
    
    /**
     * Returns the list stored here
     * @return 
     */
    public List getList() { return highsAndLows;}
}
