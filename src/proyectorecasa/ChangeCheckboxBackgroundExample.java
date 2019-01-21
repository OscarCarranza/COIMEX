/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectorecasa;
import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.Color;
 
 
/*
<applet code="ChangeCheckboxBackgroundExample" width=200 height=200>
</applet>
*/
public class ChangeCheckboxBackgroundExample extends Applet{
 
	public void init(){
		
		//create checkboxes
		Checkbox checkbox1 = new Checkbox("");
		Checkbox checkbox2 = new Checkbox("Checkbox 2");
		
		/*
		 * To change background color of a checkbox use
		 * setBackground(Color c) method.
		 */
		
		checkbox1.setBackground(Color.red);
		checkbox2.setBackground(Color.green);
		
		//add checkboxes
		add(checkbox1);
		add(checkbox2);
	}
}