package com.vastika.configuration;

import com.vastika.Service.EmailService;
import com.vastika.Service.MessageService;
import com.vastika.controller.MessageController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfiguration {


    @Bean
    public MessageController messageController(){
         return new MessageController();
    }
    @Bean
    public MessageService messageService (){
        return new EmailService();
    }
}
