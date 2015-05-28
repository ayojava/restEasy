/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javasoft.restEasy.vao;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ayojava
 */
@XmlRootElement
public class Message {

    private long msgID;

    private String message;

    private Date created;

    private String author;

    public Message() {

    }

    public Message(long msgID, String message, String author) {
        this.msgID = msgID;
        this.message = message;
        this.author = author;
        this.created = new Date();
    }

    public long getMsgID() {
        return msgID;
    }

    public void setMsgID(long msgID) {
        this.msgID = msgID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
