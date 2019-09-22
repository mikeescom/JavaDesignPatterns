package com.mikeescom.factorypattern;

import com.mikeescom.factorypattern.interfaces.HamburgerStore;
import com.mikeescom.factorypattern.model.Hamburger;
import com.mikeescom.factorypattern.model.JamHamburgerstore;
import com.mikeescom.factorypattern.model.MozHamburgerStore;

public class Main {

    public static void main(String[] args) {

        HamburgerStore mozambicanBurgerStore = new MozHamburgerStore();
        HamburgerStore jamaicanBurgerStore = new JamHamburgerstore();

        Hamburger hamburger = mozambicanBurgerStore.orderHamburger("cheese");
        System.out.println("Paulo ordered " + hamburger.getName() + "\n" );

        hamburger = jamaicanBurgerStore.orderHamburger("veggie");
        System.out.println("James Bond ordered: " + hamburger.getName() + "\n");
    }
}
