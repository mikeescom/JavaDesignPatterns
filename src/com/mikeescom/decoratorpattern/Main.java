package com.mikeescom.decoratorpattern;

import com.mikeescom.decoratorpattern.interfaces.IceCream;
import com.mikeescom.decoratorpattern.model.BasicIceCream;
import com.mikeescom.decoratorpattern.model.MintIceCream;
import com.mikeescom.decoratorpattern.model.VanillaIceCream;

public class Main {
    public static void main(String[] args) {
        IceCream basicIceCream = new BasicIceCream();
        System.out.println("Basic ice cream cost $" + basicIceCream.cost());

        // Add vanilla to the order
        IceCream vanilla = new VanillaIceCream(basicIceCream); // wrapping vanilla
        System.out.println("Adding vanilla - cost is " + vanilla.cost());

        // Add mint to the order
        IceCream mint = new MintIceCream(vanilla); // wrapping mint
        System.out.println("Adding mint - cost is " + mint.cost());
    }
}
