/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventManager;

/**
 *
 * @author Joseph
 */
public class Event {
    
    private String _name;
    private String _location;
    private int _month;
    private int _day;
    private int _year;
    
    
    public Event(String name, String location, int month, int day, int year)
    {
        setName(name);
        setLocation(location);
        setMonth(month);
        setDay(day);
        setYear(year);
    }
    
    public boolean equals(Object o)
    {
        Event e = (Event)o;
        if(e.getName().equalsIgnoreCase(this.getName()) &&
                e.getLocation().equalsIgnoreCase(this.getLocation()) &&
                e.getDay() == this.getDay() && e.getMonth() == this.getMonth() &&
                e.getYear() == this.getYear())
            return true;
        else 
            return false;
    }
    
    public String toString()
    {
        return (getMonth() + "/" + getDay() + "/" + getYear() + " " + getName() 
                + " at: " + getLocation());
    }
    
    
    public void setName(String name){_name = name;}
    public void setLocation(String location){_location = location;}
    public void setMonth(int month){_month = month;}
    public void setDay(int day){_day = day;}
    public void setYear(int year){_year = year;}
    
    public String getName(){return _name;}
    public String getLocation(){return _location;}
    public int getMonth(){return _month;}
    public int getDay(){return _day;}
    public int getYear(){return _year;}
}
