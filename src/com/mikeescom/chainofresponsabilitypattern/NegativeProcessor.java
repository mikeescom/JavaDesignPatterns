package com.mikeescom.chainofresponsabilitypattern;

public class NegativeProcessor implements Chain {
    private Chain nextInChain;

    @Override
    public void setNext(Chain c) {
        nextInChain = c;
    }

    @Override
    public void process(Number request) {
        if (request.getNumber() < 0) {
            System.out.println("NegativeProcessor : " + request.getNumber());
        } else {
            nextInChain.process(request);
        }
    }
}
