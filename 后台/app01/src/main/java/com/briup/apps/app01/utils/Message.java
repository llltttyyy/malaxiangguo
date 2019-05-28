package com.briup.apps.app01.utils;

public class Message {
    private Integer status;
    private String message;
    private Object date;
    private Long timestamp;

    public Message() {}

    public Message(Integer status, String message, Object date, Long timestamp) {
        this.status = status;
        this.message = message;
        this.date = date;
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Message{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", date=" + date +
                ", timestamp=" + timestamp +
                '}';
    }
}
