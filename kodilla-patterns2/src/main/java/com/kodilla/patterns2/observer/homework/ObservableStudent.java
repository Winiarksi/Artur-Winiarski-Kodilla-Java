package com.kodilla.patterns2.observer.homework;

public interface ObservableStudent {
    void registerMentorObserver(MentorObserver mentorObserver);
    void notifyMentorObserver();
    void removeMentorObserver(MentorObserver mentorObserver);
}
