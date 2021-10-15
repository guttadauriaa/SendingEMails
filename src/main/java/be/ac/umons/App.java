package be.ac.umons;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;

/**
 * Sending emails in Java
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "How to send mail in Java !" );

        String to = "another.one@example.org";
        String from = "sender@mydomain.local";
        String host = "smtp.mydomain.local";

        String user = "myaccount@mydomain.local";
        String pass = "change this password";

        Properties properties = System.getProperties();

        properties.setProperty("mail.smtp.host", host);
        properties.setProperty("mail.user", user);
        properties.setProperty("mail.password", pass);

        Session session = Session.getDefaultInstance(properties);

        try {
            MimeMessage message = new MimeMessage(session);

            message.setFrom(new InternetAddress(from));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

            message.setSubject("This is the subject");

            message.setText("This is the message");

            Transport.send(message);

            System.out.println("Sent message successfully ...");

        } catch(MessagingException e) {
            e.printStackTrace();
        }
    }
}
