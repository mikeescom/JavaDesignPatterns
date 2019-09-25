package com.mikeescom.observerpattern.interfaces;

public interface Observer {
    public void update();
    public void setSubject(Subject subject);
}
