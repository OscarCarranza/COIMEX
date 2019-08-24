/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * https://www.google.com/settings/security/lesssecureapps
 */

package proyecto;

/**
 *
 * @author Naveen
 */
import java.awt.Color;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public final class EmailSend {

    public EmailSend(){
    }
    
    public void send(String destination, JPanel panel_email, JLabel label_send, JLabel imageEmail, JLabel other, JDialog dialog){    
       
        try{
           
            
            String host ="smtp.gmail.com" ;
            String user = "oscarncr96@gmail.com";
            String pass = "oncr0496";
            String to = destination;
            String from = "oscarncr96@gmail.com";
            String subject = "Cotización";
            String messageText = "Your Is Test Email :";
            boolean sessionDebug = false;

            Properties props = System.getProperties();

            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", host);
            props.put("mail.smtp.port", "587");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.required", "true");

            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(sessionDebug);
            Message msg = new MimeMessage(mailSession);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject); msg.setSentDate(new Date());
            msg.setText(messageText);

           Transport transport=mailSession.getTransport("smtp");
           transport.connect(host, user, pass);
           transport.sendMessage(msg, msg.getAllRecipients());
           transport.close();
           
           System.out.println("email sent");
           
           // JFRAME
           label_send.setText("!Correo enviado!");
           panel_email.setBackground(new Color(43,226,95));
           ImageIcon image = new ImageIcon(getClass().getResource("/Imgs/emailSent.png"));
           imageEmail.setIcon(image);

        }catch(Exception ex)
        {
            System.out.println("error email not sent");
            label_send.setText("!Correo fallido!");
            other.setText("Inténtalo de nuevo");
            panel_email.setBackground(new Color(233,35,95));
            ImageIcon image = new ImageIcon(getClass().getResource("/Imgs/emailSent.png"));
            imageEmail.setIcon(image);
        }
        
    }
}
