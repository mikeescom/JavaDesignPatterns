package com.mikeescom.observerpattern;

public interface Observer {
    void update();
    void setSubject(Subject subject);
}
