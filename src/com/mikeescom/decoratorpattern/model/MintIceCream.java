package com.mikeescom.decoratorpattern.model;

import com.mikeescom.decoratorpattern.interfaces.IceCream;
import com.mikeescom.decoratorpattern.interfaces.IceCreamDecorator;

public class MintIceCream extends IceCreamDecorator {
    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding mint ice cream");
        return 1.5 + super.cost();
    }
}
