/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectorecasa;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;

public class Render extends DefaultTableCellRenderer{

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, 
            boolean isSelected, boolean hasFocus, int row, int column) {
        
        if(value instanceof JButton){
            JButton btn = (JButton)value;
            if(isSelected){

            }else{
                
                btn.setFont(new Font("Verdana", Font.BOLD, 13));
                btn.setForeground(Color.white);
                
                
                if(btn.getName().equals("m")){
                   btn.setBackground(new Color (74,140,200));
                }
                else if(btn.getName().equals("contact") || btn.getName().equals("r")){
                   btn.setBackground(new Color(83,70,156));
                }
                else if(btn.getName().equals("a")){
                   btn.setBackground(new Color(127,219,46));
                }
                
                else if(btn.getName().equals("b")){
                   btn.setBackground(new Color(9,198,85));
                   btn.setFont(new Font("Verdana", Font.BOLD, 13));
                }
                
                else {
                   btn.setBackground(new Color (54,51,148));
                }
                
                
            }
            return btn;
        }
        
        
        if(value instanceof JCheckBox){
            JCheckBox ch = (JCheckBox)value;
            return ch;
        }
        
        
        return super.getTableCellRendererComponent(table, value, isSelected, 
                hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
    }

    
}
