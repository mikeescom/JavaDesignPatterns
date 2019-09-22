package com.mikeescom.decoratorpattern1.model;

import com.mikeescom.decoratorpattern1.interfaces.IceCream;
import com.mikeescom.decoratorpattern1.interfaces.IceCreamDecorator;

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
