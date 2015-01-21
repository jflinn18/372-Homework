/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import javax.swing.event.TableModelEvent;

/**
 *
 * @author Joseph
 */
public class MyTableModel extends javax.swing.table.AbstractTableModel{
    private String[] names = {"Time", "Blood Glucose"};
    private String[][] myData = {
        {"12:00 am", null}, {"1:00 am", null}, {"2:00 am", null}, 
        {"3:00 am", null}, {"4:00 am", null}, {"5:00 am", null}, 
        {"6:00 am", null}, {"7:00 am", null}, {"8:00 am", null}, 
        {"9:00 am", null}, {"10:00 am", null}, {"11:00 am", null}, 
        {"12:00 pm", null}, {"1:00 pm", null}, {"2:00 pm", null}, 
        {"3:00 pm", null}, {"4:00 pm", null}, {"5:00 pm", null}, 
        {"6:00 pm", null}, {"7:00 pm", null}, {"8:00 pm", null}, 
        {"9:00 pm", null}, {"10:00 pm", null}, {"11:00 pm", null}
        };/*= new String[24][2];*/
    private TableModelEvent tabModEv;
    
    
    public MyTableModel()
    {
        tabModEv = new TableModelEvent(this);
        
//        myData[][] = {
//        {"12:00 am", ""}, {"1:00 am", ""}, {"2:00 am", ""}, 
//        {"3:00 am", ""}, {"4:00 am", ""}, {"5:00 am", ""}, 
//        {"6:00 am", ""}, {"7:00 am", ""}, {"8:00 am", ""}, 
//        {"9:00 am", ""}, {"10:00 am", ""}, {"11:00 am", ""}, 
//        {"12:00 pm", ""}, {"1:00 pm", ""}, {"2:00 pm", ""}, 
//        {"3:00 pm", ""}, {"4:00 pm", ""}, {"5:00 pm", ""}, 
//        {"6:00 pm", ""}, {"7:00 pm", ""}, {"8:00 pm", ""}, 
//        {"9:00 pm", ""}, {"10:00 pm", ""}, {"11:00 pm", ""}
//        };
    }
    
    @Override
    public int getRowCount() { return myData.length; }
    @Override
    public int getColumnCount() { return names.length;}
    @Override
    public Object getValueAt(int row, int col) { return myData[row][col]; }
    @Override
    public boolean isCellEditable(int row, int col)
    {
        if (col > 0)
            return true;
        else
            return false;
    }
    @Override
    public void setValueAt(Object value, int row, int col)
    {
        String i = value.toString();
        //int i = Integer.parseInt(value.toString());
        
        myData[row][col] = i;
        fireTableCellUpdated(row, col);
    }
    
    public String[][] getMyData(){ return myData; }
    public String[] getNames(){ return names; }
}
