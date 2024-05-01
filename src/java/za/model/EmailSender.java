package za.model;

import java.io.File;
import java.io.IOException;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//public class EmailSender {
//
//    public static void main(String[] args) 
//    {
//
//         EmailUtil email = new EmailUtil();
//    
//      email.createAndSendEmail("siphonhata@gmail.com", "Test email subject",
//      "Congratulations !!! \nThis is test email sent by java class.");
//        //String senderPassword = "edqw txuc aibl jsnt";
//
//    }
//}


public class EmailSender 
{
 
    private String emailAddressTo = new String();
    private String msgSubject = new String();
    private String msgText = new String();
    private ExecutorService executorService;

        //hscbgaedfkfufwot
    final String USER_NAME = "siphonhata@gmail.com";   
    final String PASSSWORD = "jvln nqcl iuzk niyp";  
    //final String FROM_ADDRESS = "siphonhata@gmail.com";  
 
    public EmailSender() 
    {
        executorService = Executors.newSingleThreadExecutor();
    }

    
    public void createAndSendEmailAsync(String emailAddressTo, String msgSubject, String msgText) 
    {
        // Execute email sending task asynchronously
        executorService.submit(() -> createAndSendEmail(emailAddressTo, msgSubject, msgText));
    }
   
    
    private void createAndSendEmail(String emailAddressTo, String msgSubject, String msgText) 
    {
        this.emailAddressTo = emailAddressTo;
        this.msgSubject = msgSubject;
        this.msgText = msgText;
        sendEmailMessage();
    }
 
    private void sendEmailMessage() 
    {
    
        Properties props = new Properties();
        //props.put("mail.debug", "true");
        
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.ssl.protocols", "TLSv1.2");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
  
        Session session = Session.getInstance(props,new javax.mail.Authenticator()
        {
            @Override
            protected PasswordAuthentication getPasswordAuthentication()
            {
                return new PasswordAuthentication(USER_NAME, PASSSWORD);
            }
        });
    
        try 
        {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(USER_NAME)); 
            message.setContent(msgText,"text/html");
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(emailAddressTo));    
            message.setSubject(msgSubject); 
    
            Multipart multipart = new MimeMultipart();
            MimeBodyPart attachmentPart = new MimeBodyPart();
            MimeBodyPart textPart = new MimeBodyPart();
            try
            {
                File f = new File("C:\\Users\\Abuti-Small\\Downloads\\sipho.jpeg");
                attachmentPart.attachFile(f);
                textPart.setText("Picture");
                multipart.addBodyPart(textPart);
                multipart.addBodyPart(attachmentPart);
                message.setContent(multipart);
                Transport.send(message); 
            }
            catch(MessagingException | IOException ex)
            {
                System.out.println("Error:" + ex.getMessage());
            }
            System.out.println("sent email successfully!");
        } 
        catch (MessagingException e)
        {
            throw new RuntimeException(e);
        }
    }

    public void setEmailAddressTo(String emailAddressTo)
    {
        this.emailAddressTo = emailAddressTo;
    }

    public void setSubject(String subject)
    {
        this.msgSubject = subject;
    }

    public void setMessageText(String msgText)
    {
        this.msgText = msgText;
    }
 
}
