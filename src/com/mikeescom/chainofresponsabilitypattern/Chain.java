package com.mikeescom.chainofresponsabilitypattern;

public interface Chain {
    void setNext(Chain nextInChain);
    void process(Number request);
}
