package com.kodilla.exception.nullpointer_8_4;
// checked
public class MessageNotSentException extends Exception {
    public MessageNotSentException(final String message) {
        super(message);
    }
}