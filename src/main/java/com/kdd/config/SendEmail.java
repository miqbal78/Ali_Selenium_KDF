package com.kdd.config;

import java.io.IOException;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendEmail implements GlobalVariables {

	public void SendEmailReport() {

		final String username = "ahayder.it@gmail.com";
		final String password = "@Royaloak2022";

		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		// This will handle the complete authentication
		Session session = Session.getDefaultInstance(props,
				new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(username, password);
					}
				});

		try {

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(username));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("meeraparvin@gmail.com"));
			message.setSubject("Automation Test Report");

			BodyPart messageBodyPart1 = new MimeBodyPart();
			messageBodyPart1.setText("Hello All,\n\nAutomation scripts has been executed. Please find the attached HTML report below. \n\nThanks,\nQA Automation Team");

			// 4) create new MimeBodyPart object and set DataHandler object to this object
			MimeBodyPart messageBodyPart2 = new MimeBodyPart();

			javax.activation.DataSource source = new FileDataSource(htmlReportFile);
			messageBodyPart2.setDataHandler(new DataHandler(source));
			messageBodyPart2.setFileName(htmlReportFile);

			// 5) create Multipart object and add MimeBodyPart objects to this object
			Multipart multipart = new MimeMultipart();
			multipart.addBodyPart(messageBodyPart1);
			multipart.addBodyPart(messageBodyPart2);
			
			MimeBodyPart messageBodyPartExcel = new MimeBodyPart();
			messageBodyPartExcel.attachFile(testDataPath);
			multipart.addBodyPart(messageBodyPartExcel); message.setContent(multipart);

			// 6) set the multiplart object to the message object
			message.setContent(multipart);
			Transport.send(message);

			System.out.println("********* Email Sent Successfully ********");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
