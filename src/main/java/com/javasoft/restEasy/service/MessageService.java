/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javasoft.restEasy.service;

import com.javasoft.restEasy.database.DatabaseUtil;
import com.javasoft.restEasy.vao.Message;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ayojava
 */
public class MessageService {

    private Map<Long, Message> messages = DatabaseUtil.getMessages();

    public MessageService() {
        messages.put(1L, new Message(1, "Hello World-1 ", "Ayojava - 1"));
        messages.put(2L, new Message(2, "Hello World-2 ", "Ayojava - 2"));
        messages.put(3L, new Message(3, "Hello World-3 ", "Ayojava - 3"));
        messages.put(4L, new Message(4, "Hello World-4 ", "Ayojava - 4"));
        messages.put(5L, new Message(5, "Hello World-5 ", "Ayojava - 5"));
        messages.put(6L, new Message(6, "Hello World-6 ", "Ayojava - 6"));
    }

    public List<Message> getAllMessages() {
        return new ArrayList<>(messages.values());
    }

    public Message getMessage(long id) {
        return messages.get(id);
    }

    public Message addMessage(Message message) {
        message.setMsgID(messages.size() + 1);
        messages.put(message.getMsgID(), message);
        return message;
    }

    public Message updateMessage(Message message) {
        if (message.getMsgID()<= 0) {
            return null;
        }
        messages.put(message.getMsgID(), message);
        return message;
    }

    public Message removeMessage(long id) {
        return messages.remove(id);
    }
}
