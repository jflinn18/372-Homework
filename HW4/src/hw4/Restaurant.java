/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;

/**
 *
 * @author Joseph
 */
public class Restaurant {
    
    private String name;
    private String address; 
    private String notes;
    private int stars;
    
    /**
     * Constructor
     * @param name
     * @param address
     * @param notes
     * @param stars 
     */
    public Restaurant(String name, String address, String notes, int stars)
    {
        this.name = name;
        this.address = address;
        this.notes = notes;
        this.stars = stars; //PT -- should check here that stars is in [1,5]
    }
    
    /**
     * Constructor
     * @param s 
     */
    public Restaurant(String s)
    {
        String[] rest = s.split("%");
        
        setName(rest[0]);
        setAddress(rest[1]);
        setNotes(rest[2]);
        setStars(Integer.parseInt(rest[3]));
    }
    
    /**
     * A toString method that writes all of the restaurant data to a string
     * to be output to a file
     * @return 
     */
    public String toStringWrite()
    {
        return getName() + "%" + getAddress() + "%" + getNotes() + "%" +
                getStars();
    }
    
    /**
     * Overrides the Object toString method to return just the name
     * This lets the Jlist display only the name and not all of the data
     * @return 
     */
    @Override
    public String toString() { return getName(); }
    
    /**
     * A toString method for the number of stars given to a restaurant
     * @return 
     */
    public String toStringStars()
    {
        if(getStars() == 1)
            return getStars() + " Star";
        else
            return getStars() + " Stars";
    }
    
    
    /**
     * Returns the name of the Restaurant
     * @return 
     */
    public String getName() { return name; }
    
    /**
     * Returns the address of the Restaurant
     * @return 
     */
    public String getAddress() { return address; }
    
    /**
     * Returns the notes on the Restaurant
     * @return 
     */
    public String getNotes() { return notes; }
    
    /**
     * Returns the number of stars given to the restaurant
     * @return 
     */
    public int getStars() { return stars; }
    
    
    /**
     * Sets the name of the Restaurant
     * @param s 
     */
    public void setName(String s) { name = s; }
    
    /**
     * Sets the address of the Restaurant
     * @param s 
     */
    public void setAddress(String s) {address = s; }
    
    /**
     * Sets the notes for the restaurant
     * @param s 
     */
    public void setNotes(String s) { notes = s; }
    
    /**
     * Sets the number of stars
     * @param i 
     */
    public void setStars(int i) { stars = i; } //PT -- and a check here that i is in [1,5]
}
