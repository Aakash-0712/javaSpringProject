package com.example.SpringBootEmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceClass implements EmailService{

	
	@Autowired
	private JavaMailSender mailSender;
	
	@Value("${spring.mail.username}")
	private String sender;
	
	@Override
	public String sendSimpleMail(UserEmail details) {
		
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setFrom(sender);
		mailMessage.setTo(details.getRecipent());
		mailMessage.setText(details.getMsgBody());
		mailMessage.setSubject(details.getSubject());
		mailSender.send(mailMessage);
		return "success";
		
	}
}
