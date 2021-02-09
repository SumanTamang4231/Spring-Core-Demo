package com.vastika.Service;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String msg) {
        System.out.println(msg+"is send via email");
    }
}
