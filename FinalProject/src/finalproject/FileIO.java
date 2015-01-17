/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.*;
/**
 *
 * @author Joseph
 */
public class FileIO {
    
    private String filename;
    private String date;
    private String[][] data;
    
    public void outputToFile(String date, String[][] data)
    {
        File f = new File(filename);
        
        try
        {
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(f));
            
            wrtr.write(date);
            
            for (int i = 0; i < 2; i++)
            {
                for (int j = 0; j < 24; j++)
                {
                    wrtr.write(data[j][i]);
                    wrtr.newLine();
                }
            }
            
            wrtr.close();
        }
        catch (Exception ex)
        {
            System.out.println("Output Error!");
        }
    }
    
    public void inputFromFile()
    {
        File f = new File(filename);
        
        try
        {
            BufferedReader rdr = new BufferedReader(new FileReader(f));
            String s;
            
            date = rdr.readLine();
            
            while(rdr.readLine() != null)
            {
                for (int i = 0; i < 2; i++)
                {
                    for (int j = 0; j < 24; j++)
                    {
                        data[j][i] = rdr.readLine();
                    }
                }
            }
            
            rdr.close();
        }
        catch (Exception ex)
        {
            System.out.println("Input Error!");
        }
    }
}
