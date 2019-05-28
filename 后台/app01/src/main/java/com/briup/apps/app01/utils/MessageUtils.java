package com.briup.apps.app01.utils;

import java.util.Date;

public class MessageUtils {
    public static Message success(String msg){
        return new Message(200,msg,null,new Date().getTime());
    }
    public static Message success(String msg,Object data){
        return new Message(200,msg,data,new Date().getTime());
    }
    public static Message success(Object data){
        return new Message(200,"success",data,new Date().getTime());
    }
    public static Message error(String msg){
        return new Message(200,msg,null,new Date().getTime());
    }
}
