package com.mikeescom.strategypattern2;

import com.mikeescom.strategypattern2.controller.CreditCardAlgorithm;
import com.mikeescom.strategypattern2.controller.PaypalAlgorithm;
import com.mikeescom.strategypattern2.controller.ShoppingCart;
import com.mikeescom.strategypattern2.model.Product;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product pants = new Product("234", 25);
        Product shirt = new Product("987", 15);

        cart.addProduct(pants);
        cart.addProduct(shirt);

        // paypal
        cart.pay(new PaypalAlgorithm("msmik@gmail.com", "hueiu12h"));

        //creditcard
        cart.pay(new CreditCardAlgorithm("Miguel", "1873987231"));
    }
}
