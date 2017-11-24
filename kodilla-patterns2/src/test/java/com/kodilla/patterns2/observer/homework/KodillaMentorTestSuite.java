package com.kodilla.patterns2.observer.homework;


import org.junit.Assert;
import org.junit.Test;

public class KodillaMentorTestSuite {

    @Test
    public void testUpdate(){
        // Given
        KodillaMentor mentorObserver = new KodillaMentor("Krzysztof Słoneczny");
        KodillaMentor mentorObserver2 = new KodillaMentor("Andrzej Konieczny");
        KodillaStudent observableStudent = new KodillaStudent("Maciek Kowalski");

        // When
        observableStudent.registerMentorObserver(mentorObserver);
        observableStudent.registerMentorObserver(mentorObserver2);
        observableStudent.addMessage("Hepl me!");
        observableStudent.addMessage("Nie daję rady");
        observableStudent.removeMentorObserver(mentorObserver);
        observableStudent.addMessage("A jednak dałem :)");

        //Then
        Assert.assertEquals("Nie daję rady", mentorObserver.getLastMessage());
        Assert.assertEquals(1, observableStudent.getMentorObservers().size());
        Assert.assertFalse(mentorObserver.getLastMessage(), mentorObserver.getLastMessage().equals("A jednak dałem :)"));
    }
}

