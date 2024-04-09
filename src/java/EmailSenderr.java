/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Abuti-Small
 */

import javax.mail.*;
import javax.mail.internet.*;
import java.util.*;


public class EmailSenderr {
    public static void main(String[] args) {
        // Sender's email address
        String from = "siphonhata@gmail.com";
        // Recipient's email address
        String to = "siphonhata@gmail.com";
        // Sender's email password
        String password = "jvln nqcl iuzk niyp";

        // Set up properties for the mail server
        Properties props = new Properties();
        props.put("mail.debug", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com"); // Change to your SMTP server
        props.put("mail.smtp.port", "587"); // Change to your SMTP port

        // Create a session with the mail server
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        try {
            // Create a MimeMessage object
            Message message = new MimeMessage(session);
            // Set From: header field of the header
            message.setFrom(new InternetAddress(from));
            // Set To: header field of the header
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
            // Set Subject: header field
            message.setSubject("Testing Java EE Email");
            // Now set the actual message
            message.setText("This is a test email sent from Java EE.");

            // Send message
            Transport.send(message);
            System.out.println("Email sent successfully.");
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
}
