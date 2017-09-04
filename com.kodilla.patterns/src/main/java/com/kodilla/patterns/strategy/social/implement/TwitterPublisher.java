package com.kodilla.patterns.strategy.social.implement;

import com.kodilla.patterns.strategy.social.SocialPublisher;
//  niech wyświetlają nazwę medium społecznego, którego używają
public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Twitter";
    }
}
