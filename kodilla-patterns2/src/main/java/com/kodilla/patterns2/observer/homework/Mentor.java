package com.kodilla.patterns2.observer.homework;

public class Mentor implements MentorObserver{
    private final String mentorName;
    private int messagesNumber;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(TaskQueue taskQueue) {

    }

    public String getMentorName() {
        return mentorName;
    }

    public int getMessagesNumber() {
        return messagesNumber;
    }

}
