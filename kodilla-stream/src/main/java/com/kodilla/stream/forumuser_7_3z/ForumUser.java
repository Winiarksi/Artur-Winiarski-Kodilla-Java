package com.kodilla.stream.forumuser_7_3z;


import java.time.LocalDate;

public class ForumUser {
    private final int IdUser;
    private final String nameUser;
    private final char sex;
    private final LocalDate birthDate;
    private final int publishedPosts;

    public ForumUser(final int idUser,final String nameUser,final char sex,
                     final int yearOfBirth, final int monthOfBirth, final int dayOfBirth,
                     final int publishedPosts) {
        IdUser = idUser;
        this.nameUser = nameUser;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.publishedPosts = publishedPosts;
    }

    public int getIdUser() {
        return IdUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPublishedPosts() {
        return publishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser: " +
                "IdUser" + IdUser +
                ", nameUser '" + nameUser + '\'' +
                ", sex " + sex +
                ", birthDate " + birthDate +
                ", publishedPosts " + publishedPosts;
    }
}