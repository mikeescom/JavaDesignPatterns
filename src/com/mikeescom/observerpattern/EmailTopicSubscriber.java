package com.mikeescom.observerpattern;

import com.mikeescom.observerpattern.Observer;
import com.mikeescom.observerpattern.Subject;

public class EmailTopicSubscriber implements Observer {
    private String name;

    // Reference to our subject class
    private Subject topic;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String)topic.getUpdate(this);
        if (msg == null) {
            System.out.println(name + " No new message on this topic!");
        } else {
            System.out.println(name + " Retrieving message: " + msg);
        }
    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
