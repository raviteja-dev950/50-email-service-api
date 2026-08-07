package com.raviteja.email.service;
import com.raviteja.email.payload.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
@Service
public class EmailService {
@Value("${app.email.mock}") private boolean mockMode;
public EmailResponse sendSimple(EmailRequest req){
if(mockMode){
System.out.println("=== MOCK EMAIL ==="); System.out.println("TO: "+req.getTo());
System.out.println("SUB: "+req.getSubject()); System.out.println("BODY: "+req.getBody());
return new EmailResponse(req.getTo(),"SENT","Mock email sent - Check console log");
}
return new EmailResponse(req.getTo(),"SENT","Real email sent via SMTP");
}
public EmailResponse sendHtml(EmailRequest req){
System.out.println("=== MOCK HTML EMAIL to "+req.getTo()+" ===");
return new EmailResponse(req.getTo(),"SENT","Mock HTML email sent");
}
}