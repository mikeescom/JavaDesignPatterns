package com.mikeescom.strategypattern;

public class PaypalAlgorithm implements Payment {
    private String email;
    private String password;

    public PaypalAlgorithm(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " pay with Paypal");
    }
}
