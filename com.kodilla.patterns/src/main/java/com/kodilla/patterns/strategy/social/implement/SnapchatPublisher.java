package com.kodilla.patterns.strategy.social.implement;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "Snapchat";
    }
}
