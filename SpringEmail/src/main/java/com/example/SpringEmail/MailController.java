package com.example.SpringEmail;

import java.io.IOException;
import java.util.Date;
import java.util.Properties;

import javax.mail.*;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {
	
	@RequestMapping(value = "/sendemail")
	public String sendEmail() throws AddressException, MessagingException, IOException
	{
		send();
		return "Email Sent Successfully";
	}
	
	private void send() throws AddressException, MessagingException, IOException
	{
		Properties props = new Properties();
		   props.put("mail.smtp.auth", "true");
		   props.put("mail.smtp.starttls.enable", "true");
		   props.put("mail.smtp.host", "smtp.gmail.com");
		   props.put("mail.smtp.port", "587");
		   
		   Session session = Session.getInstance(props, new javax.mail.Authenticator() {
		      protected PasswordAuthentication getPasswordAuthentication() {
		         return new PasswordAuthentication("yourusername", "yourpassword");
		      }
		   });
		   Message msg = new MimeMessage(session);
		   msg.setFrom(new InternetAddress("yourusername", false));

		   msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("tousername"));
		   msg.setSubject("Testing Mail using Spring Boot");
		   msg.setContent("Testing Mail using Spring Boot", "text/html");
		   msg.setSentDate(new Date());

		   MimeBodyPart messageBodyPart = new MimeBodyPart();
		   messageBodyPart.setContent("Testing Mail using Spring Boot", "text/html");

		   Multipart multipart = new MimeMultipart();
		   multipart.addBodyPart(messageBodyPart);
		  // MimeBodyPart attachPart = new MimeBodyPart();

		   //attachPart.attachFile("<directory>");
		   //multipart.addBodyPart(attachPart);
		   msg.setContent(multipart);
		   Transport.send(msg);   
	}

}
