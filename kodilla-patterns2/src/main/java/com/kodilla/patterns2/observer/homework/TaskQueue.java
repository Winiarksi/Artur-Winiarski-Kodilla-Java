package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements ObservableStudent{
    private final List<MentorObserver> mentorObservers;
    private final List<String> messages;
    private final String messageTask;

    public TaskQueue(String messageTask) {
        mentorObservers = new ArrayList<>();
        messages = new ArrayList<>();
        this.messageTask = messageTask;
    }

    public void addRequest(String request){
        messages.add(request);
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
        mentorObservers.add(mentorObserver);
    }
}
