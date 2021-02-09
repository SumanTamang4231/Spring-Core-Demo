package com.vastika.controller;

import com.vastika.Service.EmailService;
import com.vastika.Service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

public class MessageController {


  private   MessageService messageService  ;

 // @Autowired
 // public void setMessageService(MessageService messageService){
    //  this.messageService = messageService;
//  }

    

    public void send(){
        messageService.sendMessage("hello,I am good");
    }
}
