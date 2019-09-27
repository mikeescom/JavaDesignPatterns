package com.mikeescom.facadepattern;

public class Memory {
    public void load(long position, byte[] data) {
        System.out.println("Loading " + data.toString() + " at position " + position);
    }
}
