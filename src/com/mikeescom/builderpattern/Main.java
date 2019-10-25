package com.mikeescom.builderpattern;

public class Main {
    public static void main(String[] arg) {
        Email email = new Email.EmailBuilder()
                .addRecipient("miguel.l@partner.samsung.com")
                .setMainText("Check the builder pattern")
                .setGreeting("Hi John!")
                .setClosing("Regards")
                .setTitle("Builder pattern resources")
                .create();
        System.out.print(email);
    }
}
