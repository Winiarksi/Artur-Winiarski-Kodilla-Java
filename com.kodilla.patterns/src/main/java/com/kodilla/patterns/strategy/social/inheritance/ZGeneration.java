package com.kodilla.patterns.strategy.social.inheritance;

import com.kodilla.patterns.strategy.social.User;
import com.kodilla.patterns.strategy.social.implement.TwitterPublisher;

public class ZGeneration extends User {

    public ZGeneration(String name) {
        super(name);
        this.socialPublisher = new TwitterPublisher();
    }
}
