/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
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
                    mySeries.add(Integer.parseInt(data[i][j]), 
                            Integer.parseInt(data[i][j+1]));
                    //chartData.addValue(Integer.parseInt(data[j][i]), names[0], names[1]);
        }
        
        XYSeriesCollection xyCollection = new XYSeriesCollection();
        xyCollection.addSeries(mySeries);
        
        XYDataset xyDataset = xyCollection;
        
        
        JFreeChart chart = ChartFactory.createXYLineChart("Numbers vs Other_Numbers", 
                names[1], names[0], xyDataset /*chartData*/, 
                PlotOrientation.VERTICAL, true, true, false);

        
        return chart;
        
    }
    
}

