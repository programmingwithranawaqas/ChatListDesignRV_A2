package com.example.chatlistdesignrv_a2;

import java.util.Date;

public class ContactChat {
    private String imgUrl, name, msg;
    private int notification;
    private Date time;
    private boolean status; // online or offline

    public ContactChat() {
    }

    public ContactChat(String imgUrl, String name, String msg, int notification, Date time, boolean status) {
        this.imgUrl = imgUrl;
        this.name = name;
        this.msg = msg;
        this.notification = notification;
        this.time = time;
        this.status = status;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getNotification() {
        return notification;
    }

    public void setNotification(int notification) {
        this.notification = notification;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
