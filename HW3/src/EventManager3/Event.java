/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventManager3;

import java.util.Comparator;

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
    
    /**
     * Constructor
     * @param name
     * @param location
     * @param month
     * @param day
     * @param year
     * @throws Exception 
     */
    public Event(String name, String location, int month, int day, int year) throws Exception
    {
        setName(name);
        setLocation(location);
        setMonth(month);
        setDay(day, month, year);
        setYear(year);
    }
    
    /**
     * Overrides the Object method "equals"
     * @param o
     * @return 
     */
    @Override
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
    
    /**
     * Overrides the Object method "toString"
     * @return 
     */
    @Override
    public String toString()
    {
        return (getMonth() + "/" + getDay() + "/" + getYear() + " " + getName() 
                + " at: " + getLocation());
    }
    
    /**
     * Sets the name of the event
     * @param name 
     */
    public void setName(String name){_name = name;}
    
    /**
     * sets the location of the event
     * @param location 
     */
    public void setLocation(String location){_location = location;}
    
    /**
     * Sets the month of the event
     * @param month
     * @throws Exception 
     */
    public void setMonth(int month) throws Exception
    {
        if (month < 0)
            throw new Exception();
        _month = month;
    }
    
    /**
     * Sets the year of the event
     * @param year
     * @throws Exception 
     */
    public void setYear(int year) throws Exception
    { 
        if (year < 0)
            throw new Exception();
        _year = year; 
    } 
    
    /**
     * Sets the day of the event
     * @param day
     * @param month
     * @param year
     * @throws Exception 
     */
    public void setDay(int day, int month, int year) throws Exception
    {
        checkDay(day, month, year);
        _day = day;
    }
    
    /**
     * returns the name of the event
     * @return 
     */
    public String getName(){return _name;}
    
    /**
     * returns the location of the event
     * @return 
     */
    public String getLocation(){return _location;}
    
    /**
     * returns the month of the event
     * @return 
     */
    public int getMonth(){return _month;}
    
    /**
     * returns the day of the event
     * @return 
     */
    public int getDay(){return _day;}
    
    /**
     * returns the year of the event
     * @return 
     */
    public int getYear(){return _year;}
    
    /**
     * creates a new Comparator object and overrides the compare method
     * This compares the events by name
     */
    public static Comparator<Event> nameComparator = new Comparator() {
       @Override
        public int compare(Object o1, Object o2)
        {
            Event e1 = (Event)o1;
            Event e2 = (Event)o2;
            
            int comp = e1.getName().compareToIgnoreCase(e2.getName());
            return comp;
        }
    };
    
    /**
     * creates a new Comparator object and overrides the compare method
     * This compares the events by location
     */
    public static Comparator<Event> locationComparator = new Comparator() 
    {
        @Override
        public int compare(Object o1, Object o2)
        {
            Event e1 = (Event)o1;
            Event e2 = (Event)o2;
            
            int comp = e1.getLocation().compareToIgnoreCase(e2.getLocation());
            return comp;
        }
    };
    
    /**
     * creates a new Comparator object and overrides the compare method
     * this compares the events by dates
     */
    public static Comparator<Event> dateComparator = new Comparator() 
    {
        @Override
        public int compare(Object o1, Object o2)
        {
            Event e1 = (Event)o1;
            Event e2 = (Event)o2;
            
            int comp;
            if (e1.getYear() > e2.getYear())
                return -1;
            else if (e1.getYear() < e2.getYear())
                return 1;
            else
            {
                if (e1.getMonth() > e2.getMonth())
                    return 1;
                else if (e1.getMonth() < e2.getMonth())
                    return -1;
                else
                {
                    if (e1.getDay() > e2.getDay())
                        return 1;
                    else if (e1.getDay() < e2.getDay())
                        return -1;
                    else
                        return 0;
                }
            }
        }
    };
    
    /**
     * checks the day to make sure there is such a day in that month. 
     * ie. not February 31st or December 250th
     * @param day
     * @param month
     * @param year
     * @throws Exception 
     */
    public void checkDay(int day, int month, int year) throws Exception
    {   
        if (day < 0)
            throw new Exception();
        else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 
                || month == 10 || month == 12) && day > 31)
            throw new Exception();
        else if ((month == 4 || month == 6 || month == 9 || month == 11) && day > 30)
            throw new Exception();
        else if (month == 2)
        {
            if ( checkLeapYear(year) && day > 29)
                throw new Exception();
            else if ( !(checkLeapYear(year)) && day > 28 )
                throw new Exception();
        }            
    }
    
    /**
     * Checks to see if the year is a leap year. 
     * That way there is a February 29th
     * @param year
     * @return 
     */
    public boolean checkLeapYear(int year)
    {
        if (year % 4 == 0)
            return true;
        else
            return false;
    }
}
