package com.kodilla.stream.immutable_7_2;

public final class ForumUser {
    private final String username;
    private final String realName;

    public ForumUser (final String username, final String realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }
}
