package com.mikeescom.visitorpattern;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
