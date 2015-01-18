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
    
    public Restaurant(String name, String address, String notes, int stars)
    {
        this.name = name;
        this.address = address;
        this.notes = notes;
        this.stars = stars;
    }
    
    public Restaurant(String s)
    {
        String[] rest = s.split("\n");
        
        name = rest[0];
        address = rest[1];
        notes = rest[2];
        stars = Integer.parseInt(rest[3]);
    }
    
    @Override
    public String toString()
    {
        return getName() + "\n" + getAddress() + "\n" + getNotes() + "\n" +
                getStars();
    }
    
    
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getNotes() { return notes; }
    public int getStars() { return stars; }
    
    public void setName(String s) { name = s; }
    public void setAddress(String s) {address = s; }
    public void setNotes(String s) { notes = s; }
    public void setStars(int i) { stars = i; }
}
