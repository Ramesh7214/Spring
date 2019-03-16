package com.gbn.mail;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailParseException;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class SendMail {

	   private JavaMailSender mail;

	   
	   public void setMail(JavaMailSender mail)
	   {
		   this.mail = mail;
	   }

	   public void sendMail(String from, String to, String subject, String msg) 
	   { try{
		   
           MimeMessage Mimemessage = mail.createMimeMessage();

           MimeMessageHelper message = new MimeMessageHelper(Mimemessage, true);

           message.setFrom(from);
           message.setTo(to);
           message.setSubject(subject);
           message.setText(msg);
           //message.addBcc("BCC email");
           //message.addCc("CC email");

           FileSystemResource file = new FileSystemResource("ram.txt");
           message.addAttachment(file.getFilename(), file);

           mail.send(Mimemessage);    

          }catch (MessagingException e) {
               throw new MailParseException(e);
          }

           System.out.println("Mail Sent Successfully With Attachment.....!");
       }
}

