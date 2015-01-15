/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midterm;
import java.io.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Joseph
 */
public class UnderOver {
    
    private String _user;
    private int _money = 0;
    private int _betValue;
    private int _intGuess;
    private Di _one;
    private Di _two;
    private GuessErrorGUI geg = new GuessErrorGUI();
    
    /**
     * This method handles all of the operations to play the game
     * @param bet
     * @param guess
     * @param one
     * @param two 
     */
    public void playGame(int bet, String guess, Di one, Di two)
    {
        // handles an exception from makeGuess or placeBet
        try
        {
            _one = one;
            _two = two;

            makeGuess(guess);
            placeBet(bet);

            // adds or subtracts the correct amount of money.
            if (winLose())
                _money += _betValue;
            else
                _money -= _betValue;
        }
        catch (Exception ex)
        {
            geg.reportError();
        }
    }
    
    /**
     * This makes sure that the guess is a valid guess.
     * It then converts so that it is easier to compare.
     * @param guess
     * @throws Exception 
     */
    public void makeGuess(String guess) throws Exception
    {
        // makes sure the guess is valid and initiates a member variable to a value
        // to compare later.
            if(guess.equalsIgnoreCase("under"))
                _intGuess = 0;
            else if (guess.equalsIgnoreCase("over"))
                _intGuess = 12;
            else if (guess.equalsIgnoreCase("seven") || guess.equalsIgnoreCase("7"))
                _intGuess = 7;
            else
                throw new Exception();      
    }
    
    /**
     * Makes sure the user has enough money to bet
     * Then creates the amount that the user is betting depending 
     * on if the user is guessing 7 or not.
     * @param bet
     * @throws Exception 
     */
    public void placeBet(int bet) throws Exception
    {
        // checks to see if the user is betting more than they have
        if (bet > _money)
            throw new Exception();
        
        // sets the value of the bet
        if (_intGuess == 0 || _intGuess == 12)
            _betValue = bet;
        else if ( _intGuess == 7)
            _betValue = bet * 4;
    }
    
    /**
     * Returns whether the user won or lost
     * @return 
     */
    public boolean winLose()
    {
        if (_one.getValue() + _two.getValue() > 7 && _intGuess == 12)
            return true;
        else if (_one.getValue() + _two.getValue() < 7 && _intGuess == 0)
            return true;
        else if (_one.getValue() + _two.getValue() == 7 && _intGuess == 7)
            return true;
        else
            return false;
    }
    
    /**
     * Gets the player name and money value from a file
     * @param user 
     */
    public void getPlayer(String user)
    {
        File f = new File("Resources/" + user + ".txt");
        
        // handles an io exception
        try
        {
            BufferedReader in = new BufferedReader(new FileReader(f));
            
            // reads in data
            _user = in.readLine();
            _money = Integer.parseInt(in.readLine());
            
            
            in.close();
        }
        catch (Exception ex)
        {
            _user = user;
            _money = 500;
            System.out.println("Either the file doesn't exist, or there is nothing in it.");
        }
    }
    
    /**
     * Saves the user's data to a .txt file
     */
    public void save()
    {
        // opens a file according to the name of the user
        File f = new File("Resources/" + _user + ".txt");
        
        // handles any io exception
        try
        {
            BufferedWriter in = new BufferedWriter(new FileWriter(f));
            
            // writes the data to the file
            in.write(_user + "\n");
            in.write(_money + "\n");
            
            in.close();
        }
        catch (Exception ex)
        {
            System.out.println("IO Error!");
        }
        
    }
    
    /**
     * returns the value of _money
     * @return 
     */
    public int getMoney() { return _money; }
    
    /**
     * Sets the money when the player goes below 0
     */
    public void setMoney() {_money = 500;}

    
    
    
}
