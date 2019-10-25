package com.mikeescom.builderpattern;

import java.util.HashSet;
import java.util.Set;

public class Email {
    private final String title;
    private final String recipients;
    private final String message;

    public Email(String title, String recipients, String message) {
        this.title = title;
        this.recipients = recipients;
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public String getRecipients() {
        return recipients;
    }

    public String getMessage() {
        return message;
    }

    public void send() {
    }

    public static class EmailBuilder {
        private Set recipients = new HashSet();
        private String title;
        private String greeting;
        private String mainText;
        private String closing;

        public EmailBuilder addRecipient(String recipient) {
            this.recipients.add(recipient);
            return this;
        }

        public EmailBuilder removeRecipient(String recipient) {
            this.recipients.remove(recipient);
            return this;
        }

        public EmailBuilder setTitle(String title) {
            this.title = title;
            return this;
        }

        public EmailBuilder setGreeting(String greeting) {
            this.greeting = greeting;
            return this;
        }

        public EmailBuilder setMainText(String mainText) {
            this.mainText = mainText;
            return this;
        }

        public EmailBuilder setClosing(String closing) {
            this.closing = closing;
            return this;
        }

        public Email create() {
            String message = greeting+"\n"+mainText+"\n"+closing;
            String recipientSection = commaSeparatedRecipients();
            return new Email(title,recipientSection,message);
        }

        private String commaSeparatedRecipients() {
            StringBuilder sb = new StringBuilder();
            for(Object recipient : recipients) {
                sb.append(",").append(recipient.toString());
            }
            return sb.toString().replaceFirst(",","");
        }
    }
}
