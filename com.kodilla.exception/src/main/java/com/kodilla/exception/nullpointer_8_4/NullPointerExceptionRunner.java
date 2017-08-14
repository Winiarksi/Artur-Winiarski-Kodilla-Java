package com.kodilla.exception.nullpointer_8_4;

public class NullPointerExceptionRunner {
    public static void main(String[] args) {

        User user = null;
        MessageSender messageSender = new MessageSender();

        try {
            messageSender.sendMessageTo(user, "Hello!");
        } catch (MessageNotSentException e) {
            System.out.println("Message is nor send, "
                    + "but my program still running very well!");
        }
        System.out.println("Processing other logic!");
    }
}