package Paneles;


import java.awt.BorderLayout;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kris
 */
public class Paneles {
        public static void Show(JPanel container, JPanel panel){
        
         int XSize = 1360;
         int YSize = 670;
            
        panel.setSize(XSize, YSize);
        panel.setLocation(0, 0);

        container.removeAll();
        container.add(panel); //BorderLayout.CENTER);
        container.revalidate();
        container.repaint();
        
    }
}
