package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class KodillaStudent implements ObservableStudent{
    private final List<MentorObserver> mentorObservers;
    private final List<String> messages;
    private final String studentName;

    public KodillaStudent(final String studentName) {
        mentorObservers = new ArrayList<>();
        messages = new ArrayList<>();
        this.studentName = studentName;
    }

    public void addMessage(String message){
        messages.add(message);
        notifyMentorObserver();
    }

    @Override
    public void registerMentorObserver(MentorObserver mentorObserver) {
        mentorObservers.add(mentorObserver);
    }

    @Override
    public void notifyMentorObserver() {
        for(MentorObserver mentorObserver : mentorObservers){
            mentorObserver.update(this);
        }
    }

    @Override
    public void removeMentorObserver(MentorObserver mentorObserver) {
        mentorObservers.remove(mentorObserver);
    }

    public List<String> getMessages() {
        return messages;
    }

    public String getStudentName() {
        return studentName;
    }

    public List<MentorObserver> getMentorObservers() {
        return mentorObservers;
    }
}
