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
    
    
    public void playGame(int bet, String guess, Di one, Di two)
    {
        try
        {
            _one = one;
            _two = two;

            makeGuess(guess);
            placeBet(bet);

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
    
    public void makeGuess(String guess) throws Exception
    {
            if(guess.equalsIgnoreCase("under"))
                _intGuess = 0;
            else if (guess.equalsIgnoreCase("over"))
                _intGuess = 12;
            else if (guess.equalsIgnoreCase("seven") || guess.equalsIgnoreCase("7"))
                _intGuess = 7;
            else
                throw new Exception();

            
    }
    
    public void placeBet(int bet) throws Exception
    {
        if (bet > _money)
            throw new Exception();
        
        if (_intGuess == 0 || _intGuess == 12)
            _betValue = bet;
        else if ( _intGuess == 7)
            _betValue = bet * 4;
    }
    
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
    
    public void getPlayer(String user)
    {
        File f = new File("Resources/" + user + ".txt");
        
        try
        {
            BufferedReader in = new BufferedReader(new FileReader(f));
            
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
    
    public void save()
    {
        File f = new File("Resources/" + _user + ".txt");
        
        try
        {
            BufferedWriter in = new BufferedWriter(new FileWriter(f));
            
            in.write(_user + "\n");
            in.write(_money + "\n");
            
            in.close();
        }
        catch (Exception ex)
        {
            System.out.println("IO Error!");
        }
        
    }
    
    public int getMoney() { return _money; }

    
    
    
}
