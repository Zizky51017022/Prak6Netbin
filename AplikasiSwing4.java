/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasiswing4;

/**
 *
 * @author ASUS
 */

import javax.swing.*;
import java.awt.event.*;

public class AplikasiSwing4 implements ActionListener{

    /**
     * @param args the command line arguments
     */
    private static void createAndShowGUI() {
        // TODO code application logic here
    JFrame frame = new JFrame ("I Am A JFrame"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(20,30,300,100);
    frame.getContentPane().setLayout(null);
    //make a button
    JButton butt=new JButton("Click me");
    frame.getContentPane().add(butt);
    butt.setBounds(20, 20, 200,20);
    
    AplikasiSwing4 app = new AplikasiSwing4() {};
    app.label = new JLabel ("0 Clicks");
    app.label.setBounds(20, 40, 200,20);
    frame.getContentPane().add(app.label);
    
    butt.addActionListener(app);
    frame.setVisible(true); 
    }
    
        
    public static void main (String[] args){
        SwingUtilities.invokeLater(new Runnable () {
    public void run () {
            createAndShowGUI();
    }
    
    });
    
    }
    int clickCount=0;
    JLabel label;

    @Override
    public void actionPerformed(ActionEvent e) {
        clickCount++;
        label.setText("Clicks = "+clickCount);
    }
}