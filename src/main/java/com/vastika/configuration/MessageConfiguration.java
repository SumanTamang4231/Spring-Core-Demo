package com.vastika.configuration;

import com.vastika.Service.EmailService;
import com.vastika.Service.MessageService;
import com.vastika.controller.MessageController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(value = "com.vastika")
@PropertySource(value="classpath:message.properties")
public class MessageConfiguration {


//    @Bean
//    public MessageController messageController(){
//         return new MessageController();
//    }

//    @Bean
//    public MessageService messageService (){
//        return new EmailService();
//    }
}
