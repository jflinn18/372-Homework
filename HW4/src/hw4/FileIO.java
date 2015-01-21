/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

/**
 *
 * @author Joseph
 */
public class FileIO {

    private String input;
    private List<String> files = new ArrayList<String>();
    
    /**
     * Couldn't get this to work correctly
     * @param filename 
     */
    public void delete(String filename)
    {
        File file = new File("Resource/Restaurant" + filename);
        file.delete();
    }
    
    /**
     * Writes the restaurant data to a file
     * @param o 
     */
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
    
    /**
     * Reads the Restaurant data from a file
     * @param s 
     */
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
    
    /**
     * Returns the names of files in the directory where the restaurant data is stored.
     * @return 
     */
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
    
    /**
     * returns member variable "input"
     * @return 
     */
    public String getInput() { return input; }
}
