package com.mikeescom.facadepattern;

public class CPU {
    public void freeze() {
        System.out.println("Freeze");
    }
    public void jump(long position) {
        System.out.println("Jumping " + position + " positions");
    }
    public void execute() {
        System.out.println("Execute");
    }
}
