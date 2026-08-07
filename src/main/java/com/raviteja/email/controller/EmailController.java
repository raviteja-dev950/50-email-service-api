package com.raviteja.email.controller;
import com.raviteja.email.payload.*;
import com.raviteja.email.service.EmailService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController @RequestMapping("/api/email")
public class EmailController {
private final EmailService service; public EmailController(EmailService s){this.service=s;}
@GetMapping("/test") public String test(){return "Email Service API is working! Mock Mode ON";}
@PostMapping("/send") public ResponseEntity<EmailResponse> send(@Valid @RequestBody EmailRequest req){return ResponseEntity.ok(service.sendSimple(req));}
@PostMapping("/send-html") public ResponseEntity<EmailResponse> sendHtml(@Valid @RequestBody EmailRequest req){return ResponseEntity.ok(service.sendHtml(req));}
}