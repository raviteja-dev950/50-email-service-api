package com.raviteja.email.payload;
import jakarta.validation.constraints.NotBlank;
public class EmailRequest {
@NotBlank private String to; @NotBlank private String subject; @NotBlank private String body;
public String getTo(){return to;} public void setTo(String to){this.to=to;}
public String getSubject(){return subject;} public void setSubject(String s){this.subject=s;}
public String getBody(){return body;} public void setBody(String b){this.body=b;}
}