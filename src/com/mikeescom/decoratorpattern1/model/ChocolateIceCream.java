package com.mikeescom.decoratorpattern1.model;

import com.mikeescom.decoratorpattern1.interfaces.IceCream;
import com.mikeescom.decoratorpattern1.interfaces.IceCreamDecorator;

public class ChocolateIceCream extends IceCreamDecorator {
    public ChocolateIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding chocolate ice cream");
        return 1.0 + super.cost();
    }
}
