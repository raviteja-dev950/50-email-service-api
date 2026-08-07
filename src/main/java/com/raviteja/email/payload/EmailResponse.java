package com.raviteja.email.payload;
public class EmailResponse { private String to; private String status; private String message;
public EmailResponse(String to, String status, String msg){this.to=to; this.status=status; this.message=msg;}
public String getTo(){return to;} public String getStatus(){return status;} public String getMessage(){return message;}
}