/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class Render extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, 
            boolean isSelected, boolean hasFocus, int row, int column) {
        
        if(value instanceof JButton){
            JButton btn = (JButton)value;
            if(isSelected){

            }else{
                
                btn.setFont(new Font("Segoe UI", Font.BOLD, 14));
                btn.setForeground(Color.white);
                
                
                if(btn.getName().equals("m")){
                   btn.setBackground(new Color (189,144,45));
                }
                else if(btn.getName().equals("contact") || btn.getName().equals("r")){
                   btn.setBackground(new Color(83,70,156));
                }
                else if(btn.getName().equals("a")){
                   btn.setBackground(new Color(127,219,46));
                }
                
                else if(btn.getName().equals("b")){
                    btn.setBackground(new Color (0,0,0,0));
                    btn.setBorder(BorderFactory.createLineBorder(new Color(0,0,0,0)));
                }
                
                else {
                   btn.setBackground(new Color (247,30,77));
                }
                
                
            }
            return btn;
        }
        
        if(value instanceof JComboBox){
            JComboBox cb = (JComboBox)value;
            if(isSelected){
                
            }
            else{
                if(cb.getName().equals("stat")){
                    cb.setBackground(Color.white);
                    cb.setBorder(BorderFactory.createLineBorder(new Color(0,0,0,0)));
                }
            }
        }
        
        if(value instanceof JLabel){
            JLabel label = (JLabel)value;
            if(isSelected){

            }else{
                
                if(label.getName().equals("car1")){
                   ImageIcon image = new ImageIcon(getClass().getResource("/Imgs/car1.png")); 
                   label.setIcon(image);                
                }
                
                else if(label.getName().equals("car2")){
                   ImageIcon image = new ImageIcon(getClass().getResource("/Imgs/car2.png")); 
                   label.setIcon(image);                
                }
                
                else if(label.getName().equals("car3")){
                   ImageIcon image = new ImageIcon(getClass().getResource("/Imgs/car3.png")); 
                   label.setIcon(image);     
                }
                
                else if(label.getName().equals("car4")){
                   ImageIcon image = new ImageIcon(getClass().getResource("/Imgs/car4.png")); 
                   label.setIcon(image);
                }
                
                else{
                   
                }
                
            }
            return label;
        }
        
        
        return super.getTableCellRendererComponent(table, value, isSelected, 
                hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
    }

    
}
