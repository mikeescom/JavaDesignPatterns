package com.mikeescom.decoratorpattern1.model;

import com.mikeescom.decoratorpattern1.interfaces.IceCream;

public class BasicIceCream implements IceCream {

    public BasicIceCream() {
        System.out.println("Creating basic ice cream");
    }

    @Override
    public double cost() {
        return 0.5;
    }
}
