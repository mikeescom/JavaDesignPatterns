package com.mikeescom.factorypattern.model;

import com.mikeescom.factorypattern.interfaces.HamburgerStore;

public class JamHamburgerstore extends HamburgerStore {
    @Override
    public Hamburger createHamburger(String type) {

        if (type.equals("cheese")) {
            return new JamaicanCheeseBurger();
        }else if (type.equals("veggie")) {
            return new JamaicanVeggieBurger();

        }else  return null;
    }
}
