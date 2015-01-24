/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ErrorGUIs;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jflinn18
 */
public class Popup {
 
    private JPanel panel;
    
    public Popup()
    {
        panel = new JPanel(new GridLayout(0, 1));
    }
    
    public void add(String message)
    {
        panel.add(new JLabel(String.format("%s", message)));
    }
    
    public void display()
    {
        JOptionPane.showMessageDialog(null, panel);
    }

} 

