/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventManager;
import java.util.*;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author Joseph
 */
public class EventManager {
    private List _events = new ArrayList<Event>();
    public DefaultListModel listModel = new DefaultListModel();
    
    public EventManager()
    {
        inputEventsFile();
        updateListModel();
    }
    
    public void addEvent(Event e) { _events.add(e); updateListModel();}
    
    public void removeEvent(Event e)
    {
        for(int i = 0; i < _events.size(); i++)
            if (e.equals(_events.get(i)))
                _events.remove(i);
    }
    
    public DefaultListModel updateListModel()
    {
        for(int i = 0; i < _events.size(); i++)
        {
            listModel.addElement(_events.get(i));
        }
        
        return listModel;
    }
    
    public void inputEventsFile()
    {
        File f = new File("Resources/events.txt");
        String[] words;
        String[] date;
        int month;
        int day;
        int year;
        String name;
        String location;
        
        try
        {
            BufferedReader rdr = new BufferedReader(new FileReader(f));
            String line;
            while((line = rdr.readLine()) != null)
            {
                words = line.split(" ");
                date = words[0].split("/");
                
                month = Integer.parseInt(date[0]);
                day = Integer.parseInt(date[1]);
                year = Integer.parseInt(date[2]);
                
                name = words[1];
                
                words[3].replaceAll("at:", "");
                
                location = words[3];
                
                _events.add(new Event(name, location, month, day, year));
            }
            
            rdr.close();
        }
        catch (Exception e)
        {
            System.out.println("IO Error!");
        }
    }
    
    public void outputEventsFile()
    {
        File f = new File("Resources/events.txt");
        
        try
        {
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(f));
            
            for (int i = 0; i < _events.size(); i++)
            {
                wrtr.write(_events.get(i).toString());
            }
        }
        catch (Exception e)
        {
            System.out.println("IO Error!");
        }
    }
}
