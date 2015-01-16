/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventManager3;
import static EventManager3.Event.dateComparator;
import static EventManager3.Event.locationComparator;
import static EventManager3.Event.nameComparator;
import java.util.*;
import java.io.*;
import javax.swing.*;
/**
 *
 * @author Joseph
 */
public class EventManager {
    private List _events = new ArrayList<Event>();
    
    /**
     * Constructor
     */
    public EventManager()
    {
        inputEventsFile();
    }
    
    /**
     * Adds an event to the List member variable
     * @param e 
     */
    public void addEvent(Event e) { _events.add(e);}
    
    /**
     * Removes an event from the List member variable
     * @param i 
     */
    public void removeEvent(int i) { _events.remove(i); }
    
    /**
     * Sorts the list depending on how the user wants to sort the list
     * @param s 
     */
    public void sortList(String s)
    {
        if (s.equals("Date"))
            Collections.sort(_events, dateComparator);
        else if (s.equals("Location"))
            Collections.sort(_events, locationComparator);
        else if (s.equals("Name"))
            Collections.sort(_events, nameComparator);
    }
    
    /**
     * returns the List
     * @return 
     */
    public List getList() { return _events; }
    
    /**
     * Gets the event data from a file
     */
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
                
                
                location = words[3];
                

                _events.add(new Event(name, location, month, day, year));

            }
            
            rdr.close();
        }
        catch (Exception e)
        {
            System.out.println("Input Error!");
        }
    }
    
    /**
     * Stores the event data in a file
     */
    public void outputEventsFile()
    {
        File f = new File("Resources/events.txt");
        
        try
        {
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(f));
            
            for (int i = 0; i < _events.size(); i++)
            {
                wrtr.write(_events.get(i).toString());
                wrtr.newLine();
            }
            
            wrtr.close();
        }
        catch (Exception e)
        {
            System.out.println("Output Error!");
        }
    }
}
