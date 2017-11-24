package com.kodilla.patterns2.observer.homework;

public class KodillaMentor implements MentorObserver{
    private final String mentorName;
    private String lastMessage;

    public KodillaMentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(KodillaStudent kodillaStudent) {
        System.out.println("Montor " + mentorName + " was notified by "
                + kodillaStudent.getStudentName() + ": ");

        lastMessage = kodillaStudent.getMessages().get(kodillaStudent.getMessages().size() -1);

        System.out.println(lastMessage);
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public String getMentorName() {
        return mentorName;
    }
}
