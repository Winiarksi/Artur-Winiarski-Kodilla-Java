package com.kodilla.patterns.strategy.social.inheritance;

import com.kodilla.patterns.strategy.social.User;
import com.kodilla.patterns.strategy.social.implement.SnapchatPublisher;

public class YGeneration extends User {

    public YGeneration(String name) {
        super(name);
        this.socialPublisher = new SnapchatPublisher();
    }
}
