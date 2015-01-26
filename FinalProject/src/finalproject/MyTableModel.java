/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.File;
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
    private String date;
    private String notes;
    
    
    /**
     * Constructor
     */
    public MyTableModel()
    {
        tabModEv = new TableModelEvent(this);
    }
    
    /**
     * Returns how many rows there are
     * @return 
     */
    @Override
    public int getRowCount() { return myData.length; }
    
    /**
     * Returns how may columns there are
     * @return 
     */
    @Override
    public int getColumnCount() { return names.length;}
    
    /**
     * Returns the value at the given indexes.
     * @param row
     * @param col
     * @return 
     */
    @Override
    public Object getValueAt(int row, int col) { return myData[row][col]; }
    
    /**
     * Returns if the given cell is Editable
     * @param row
     * @param col
     * @return 
     */
    @Override
    public boolean isCellEditable(int row, int col)
    {
        if (col > 0)
            return true;
        else
            return false;
    }
    
    /**
     * Sets the value of the cell at the given row and column
     * @param value
     * @param row
     * @param col 
     */
    @Override
    public void setValueAt(Object value, int row, int col)
    {
        String i = value.toString();
        //int i = Integer.parseInt(value.toString());
        
        if (i.equals(""))
            myData[row][col] = null;
        else
            myData[row][col] = i;
        
        fireTableCellUpdated(row, col);
    }
    
    /**
     * Checks to see if the date is an actual date
     * @throws Exception 
     */
    public void checkDateValidity() throws Exception
    {
        String [] as;
        int[] ai = new int[3];
        
        if (date.contains("-"))
            as = date.split("-");
        else if (date.contains("/"))
            as = date.split("/");
        else
            throw new Exception();
        
        if (as.length < 3 || as.length > 3)
            throw new Exception();
        
        for (int i = 0; i < 3; i++ )
            ai[i] = Integer.parseInt(as[i]);
        
        if (ai[0] > 12 || ai[0] < 1)
            throw new Exception();
        if(( ai[0] == 1 || ai[0] == 3 || ai[0] == 5 || ai[0] == 7 || 
                ai[0] == 8 || ai[0] == 10 || ai[0] == 12) && (ai[1] > 31 || ai[1] < 1))
            throw new Exception();
        if(( ai[0] == 4 || ai[0] == 6 || ai[0] == 9 || ai[0] == 11 ) && ( ai[1] > 30 || ai[1] < 1))
            throw new Exception();
        
        if((ai[0] == 2 && ( ai[2] % 4 == 0)) && ai[1] > 29)
            throw new Exception();
        
        
        if ( ai[2] < 0)
            throw new Exception();
            
    }
     
    /**
     * Sets the value of notes
     * @param notes 
     */
    public void setNotes(String notes) { this.notes = notes; }
    
    /**
     * Sets the date and makes sure that there is a date there
     * @param date
     * @throws Exception 
     */
    public void setDate(String date)  throws Exception
    { 
        if (date.equals(""))
            throw new Exception();
        else
            this.date = date.replace('/', '-');
    }
    
    /**
     * Sets the date to an empty string
     */
    public void resetDate() {date = "";}
    
    /**
     * Returns the data stored in the model
     * @return 
     */
    public String[][] getMyData(){ return myData; }
    
    /**
     * Returns the names of the columns 
     * @return 
     */
    public String[] getNames(){ return names; }
    
    /**
     * Returns the notes
     * @return 
     */
    public String getNotes() {return notes;}
    
    /**
     * Returns the date
     * @return
     * @throws Exception 
     */
    public String getDate() throws Exception
    { 
        if (date.equals(""))
            throw new Exception();
        
        checkDateValidity();
        return date;
    }
    
    /**
     * Returns the data from the file that is passed in
     * @param f 
     */
    public void getDataFromFile(File f) 
    { 
        FileIO fio = new FileIO();
        myData = fio.inputFromFile(f);
        date = fio.getDate();
        notes = fio.getNotes();
    }
}
