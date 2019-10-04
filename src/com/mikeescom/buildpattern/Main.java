package com.mikeescom.buildpattern;

public class Main {
    public static void main(String[] arg) {
        Email email = new EmailBuilder()
                .addRecipient("john@Doe.com")
                .setMainText("Check the builder pattern")
                .setGreeting("Hi John!")
                .setClosing("Regards")
                .setTitle("Builder pattern resources")
                .create();
        System.out.print(email);
    }
}
