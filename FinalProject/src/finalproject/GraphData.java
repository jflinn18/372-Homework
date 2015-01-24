/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import java.awt.Color;
import org.jfree.chart.*;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.plot.Plot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.time.Day;
import org.jfree.data.time.Hour;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;


/**
 *
 * @author Joseph
 */
public class GraphData {
    
    private int[] today;
    private Day day;
    
    /**
     * Constructor
     * @param date 
     */
    public GraphData(String date)
    {
        String[] day = date.split("-");
        today = new int[day.length];
        
        for (int i = 0; i < day.length; i++)
            today[i] = Integer.parseInt(day[i]);
        
        this.day = new Day(today[1], today[0], today[2] + 2000);
    }
    
    /**
     * Creates a chart with the data that is graphed vs time
     * @param data
     * @param names
     * @return 
     */
    public JFreeChart graphVsTime(String[][] data, String[] names)
    {
        TimeSeries mySeries = new TimeSeries("Data");
        
        for (int i = 0; i < data.length; i++)
        {
            if (data[i][0] != null && data[i][1] != null)
                mySeries.add(new Hour(convertTime(data[i][0]), day), 
                        Integer.parseInt(data[i][1]));
        }
        
        TimeSeriesCollection collection = new TimeSeriesCollection(mySeries);
        
        XYDataset dataset = collection;
        
        JFreeChart chart = ChartFactory.createTimeSeriesChart("Blood Glucose vs Time", 
                names[0], names[1], dataset, true, true, false);
        
        XYPlot plot = (XYPlot)chart.getPlot();
        plot.setBackgroundPaint(Color.white);
        plot.setDomainGridlinePaint(Color.BLACK);
        plot.setRangeGridlinePaint(Color.BLACK);
        
        return chart;
    }
    
    /**
     * Converts the String time to an integer time
     * @param time
     * @return 
     */
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

