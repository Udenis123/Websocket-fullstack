package com.ckeck.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import com.ckeck.Model.Message;


@Controller
public class ChatController {
	
	
	@Autowired
	private SimpMessagingTemplate simple;
	
    @MessageMapping("/message") // The endpoint where the client sends the message
    @SendTo("/chatroom/public")   // The destination to which the server sends the message
    public Message receivePublicMessage(@Payload Message message) {
        return message;
    }
    
    
    
    @MessageMapping("/private-message")
    public Message receivePrivateMessage(@Payload Message message) {
    	simple.convertAndSendToUser(message.getReciverName(), "/private", message);
    	
        return message;
    }
    
}
