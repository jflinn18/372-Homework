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
    private String[][] data = {
        {"12:00 am", null}, {"1:00 am", null}, {"2:00 am", null}, 
        {"3:00 am", null}, {"4:00 am", null}, {"5:00 am", null}, 
        {"6:00 am", null}, {"7:00 am", null}, {"8:00 am", null}, 
        {"9:00 am", null}, {"10:00 am", null}, {"11:00 am", null}, 
        {"12:00 pm", null}, {"1:00 pm", null}, {"2:00 pm", null}, 
        {"3:00 pm", null}, {"4:00 pm", null}, {"5:00 pm", null}, 
        {"6:00 pm", null}, {"7:00 pm", null}, {"8:00 pm", null}, 
        {"9:00 pm", null}, {"10:00 pm", null}, {"11:00 pm", null}
        };
    
    
    public String getDate() {return date;}
    public void outputToFile(String date, String[][] data)
    {
        File f = new File("Resources/" + date + ".txt");
        
        try
        {
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(f));
            
            wrtr.write(date);
            wrtr.newLine();
            
            for (int i = 0; i < 24; i++)
            {
                if(data[i][1] != null)
                {
                    wrtr.write(data[i][0] + "%" + data[i][1]);
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
    
    public String[][] inputFromFile(File f)
    {
        //File f = new File(filename);
        
        try
        {
            BufferedReader rdr = new BufferedReader(new FileReader(f));
            String s;
            String[] sa;
            
            date = rdr.readLine();
            
            while((s = rdr.readLine()) != null)
            {

                sa = s.split("%");
                    
                for (int j = 0; j < 24; j++)
                {
                    if (data[j][0].equals(sa[0]))
                    {
                        data[j][1] = sa[1];
                        break;
                    }
                }
            }
            
            rdr.close();
        }
        catch (Exception ex)
        {
            System.out.println("Input Error!");
        }
        
        return data;
    }
    
    public void saveGraph(String date)
    {
        /*
        int width=640; // Width of the image 
        int height=480; // Height of the image               
        File lineChart=new File(date + "Chart.png");              
        ChartUtilities.saveChartAsPNG(lineChart,lineChartObject,width,height);
        */
    }
}
