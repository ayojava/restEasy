/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.javasoft.restEasy;

import com.javasoft.restEasy.service.MessageService;
import com.javasoft.restEasy.vao.Message;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ayojava
 */
public class Hello implements HelloInterface{

    MessageService messageService ;
    
    public Hello(){
        messageService = new MessageService();
    }
    
    @Override
    public String sayHelloWorld() {
        return "Hello World, the time is "+ new Date();
    }

    @Override
    public String sayHelloName(String name) {
       return " Hello [ " + name + "] ";
    }

    @Override
    public List<Message> getAllMessages() {
        return messageService.getAllMessages();
    }

    @Override
    public Message getMessage(long id) {
       return messageService.getMessage(id);
    }
    
    
    
}
