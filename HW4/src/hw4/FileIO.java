/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;
import java.io.*;
import java.util.*;

/**
 *
 * @author Joseph
 */
public class FileIO {
    
    private String filename;
    private String input;
    private List<String> files = new ArrayList<String>();
 
    public String getFilename() { return filename; }
    public void setFilename(String filename) { this.filename = filename; }
    
    public void write(Object o)
    {
        Restaurant r = (Restaurant)o;
        File file = new File("Resources/Restaurant/" + r.getName());
        
        try
        {
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(file));
            
            wrtr.write(r.toStringWrite());
            
            wrtr.close();
        }
        catch (Exception ex)
        {
            System.out.println("Output Error!");
        }
    }
    
    public void read(String s)
    {
        File file = new File("Resources/Restaurant/" + s);
        String input = "";
        String line = "";
        
        try 
        {
            BufferedReader rdr = new BufferedReader(new FileReader(file));
            
            while ((line = rdr.readLine()) != null)
            {
                input += line;
                input += "%";
            }
            
            rdr.close();
            
            this.input = input;
        }
        catch (Exception ex)
        {
            System.out.println("Input Error!");
        }
    }
    
    public List getDir()
    {
        File directory = new File("Resources/Restaurant/");
        File[] dir = directory.listFiles();
        
        for (File f : dir)
        {
            if (f.isFile())
            {
                files.add(f.getName());
            }
        }
        
        return files;
    }
    
    public String getInput() { return input; }
}
