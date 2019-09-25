package com.mikeescom.decoratorpattern.model;

import com.mikeescom.decoratorpattern.interfaces.IceCream;
import com.mikeescom.decoratorpattern.interfaces.IceCreamDecorator;

public class VanillaIceCream extends IceCreamDecorator {
    public VanillaIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding vanilla ice cream");
        return 1.0 + super.cost();
    }
}
