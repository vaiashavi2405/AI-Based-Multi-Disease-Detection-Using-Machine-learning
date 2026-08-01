/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medbot;

import java.awt.Dimension;
import static java.awt.Frame.MAXIMIZED_BOTH;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JTextPane;


public class Main {
    
     
    public static void main(String[] args)
    {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        MedBotFrame mf=new MedBotFrame(); 
        mf.setLocation(dim.width/2-mf.getSize().width/2, 200);
        mf.setVisible(true);
        mf.setSize(420, 650);
        

        
    }
    
}
