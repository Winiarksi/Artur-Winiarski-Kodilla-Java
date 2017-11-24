package com.kodilla.patterns2.observer.homework;

public class KodillaUser implements MentorObserver{
    private final String mentorName;
    private int messagesNumber;

    public KodillaUser(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(KodillaModule kodillaModule) {

    }

    public String getMentorName() {
        return mentorName;
    }

    public int getMessagesNumber() {
        return messagesNumber;
    }

}
