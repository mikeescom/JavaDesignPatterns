package com.mikeescom.mediatorpattern;

public interface IChatRoom {
    void sendMessage(String msg, String userId);
    void addUser(User user);
}
