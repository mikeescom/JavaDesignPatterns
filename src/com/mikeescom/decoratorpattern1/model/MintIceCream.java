package com.mikeescom.decoratorpattern1.model;

import com.mikeescom.decoratorpattern1.interfaces.IceCream;
import com.mikeescom.decoratorpattern1.interfaces.IceCreamDecorator;

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
