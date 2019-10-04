package com.mikeescom.mediatorpattern;

public class Main {
    public static void main(String[] args)
    {
        IChatRoom chatRoom = new ChatRoom();

        User user1 = new ChatUser(chatRoom,"1", "Alex");
        User user2 = new ChatUser(chatRoom,"2", "Brian");
        User user3 = new ChatUser(chatRoom,"3", "Charles");
        User user4 = new ChatUser(chatRoom,"4", "David");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);
        chatRoom.addUser(user4);

        user1.send("Hello brian", "2");
        user2.send("Hey buddy", "1");
    }
}
