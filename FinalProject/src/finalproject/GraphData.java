/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import java.awt.Color;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


/**
 *
 * @author Joseph
 */
public class GraphData {
    
    public JFreeChart graph(String[][] data, String[] names)
    {
        //DefaultCategoryDataset chartData = new DefaultCategoryDataset();
        XYSeries mySeries = new XYSeries("Data");
        int j = 0;
        
        for (int i = 0; i < data.length; i++)
        {
                if (data[i][j] != null && data[i][j+1] != null)
                    mySeries.add(convertTime(data[i][j]), 
                            Integer.parseInt(data[i][j+1]));
                    //chartData.addValue(Integer.parseInt(data[j][i]), names[0], names[1]);
        }
        
        XYSeriesCollection xyCollection = new XYSeriesCollection();
        xyCollection.addSeries(mySeries);
        
        XYDataset xyDataset = xyCollection;
        
        
        JFreeChart chart = ChartFactory.createXYLineChart("Numbers vs Other_Numbers", 
                names[0], names[1], xyDataset /*chartData*/, 
                PlotOrientation.VERTICAL, true, true, false);
        
        XYPlot plot = (XYPlot)chart.getPlot();
        plot.setBackgroundPaint(Color.white);
        plot.setDomainGridlinePaint(Color.BLACK);
        plot.setRangeGridlinePaint(Color.BLACK);

        
        return chart;
        
    }
    
    
    public int convertTime(String time)
    {
        int hour = 24;
        
        switch(time)
        {
            case "12:00 am":
                hour = 0;
                break;
            case "1:00 am":
                hour = 1;
                break;
            case "2:00 am":
                hour = 2;
                break;
            case "3:00 am":
                hour = 3;
                break;
            case "4:00 am":
                hour = 4;
                break;
            case "5:00 am":
                hour = 5;
                break;
            case "6:00 am":
                hour = 6;
                break;
            case "7:00 am":
                hour = 7;
                break;
            case "8:00 am":
                hour = 8;
                break;
            case "9:00 am":
                hour = 9;
                break;
            case "10:00 am":
                hour = 10;
                break;
            case "11:00 am":
                hour = 11;
                break;
            case "12:00 pm":
                hour = 12;
                break;
            case "1:00 pm":
                hour = 13;
                break;
            case "2:00 pm":
                hour = 14;
                break;
            case "3:00 pm":
                hour = 15;
                break;
            case "4:00 pm":
                hour = 16;
                break;
            case "5:00 pm":
                hour = 17;
                break;
            case "6:00 pm":
                hour = 18;
                break;
            case "7:00 pm":
                hour = 19;
                break;
            case "8:00 pm":
                hour = 20;
                break;
            case "9:00 pm":
                hour = 21;
                break;
            case "10:00 pm":
                hour = 22;
                break;
            case "11:00 pm":
                hour = 23;
                break;
        }
        
        return hour;
    }
}

