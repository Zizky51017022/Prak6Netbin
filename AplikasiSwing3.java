/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasiswing3;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author ASUS
 */
public abstract class AplikasiSwing3 implements ActionListener {

    /**
     * @param args the command line arguments
     */
    private static void createAndShowGUI(){
        // TODO code application logic here
    JFrame frame = new JFrame ("I Am A JFrame"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBounds(20,30,300,100);
    frame.getContentPane().setLayout(null);
    //make a button
    JButton butt=new JButton("Click me");
    frame.getContentPane().add(butt);
    butt.setBounds(20, 20, 200,20);
    
    AplikasiSwing3 app = new AplikasiSwing3() {};
    app.label = new JLabel ("0 Clicks");
    app.label.setBounds(20, 40, 200,20);
    frame.getContentPane().add(app.label);
    
    butt.addActionListener(app);
    frame.setVisible(true); 
    }
    
    public void actionPerformed(ActionEvent e)
    {
        label.setText("Nama Saya Zizky Yuningsih Sistem Informasi 2017");
    }

    public static void main (String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            public void run () {
                createAndShowGUI ();
            }
    });
    }
JLabel label;
} 

