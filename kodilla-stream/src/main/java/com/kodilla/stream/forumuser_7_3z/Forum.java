package com.kodilla.stream.forumuser_7_3z;

//import com.kodilla.stream.immutable_7_2.ForumUser;

import java.util.ArrayList;
import java.util.List;

//   która będzie zawierała listę użytkowników, czyli listę obiektów ForumUser.
public final class Forum {
    private final List<ForumUser> theForumUser = new ArrayList<>();

    public Forum() {
        theForumUser.add( new ForumUser( 1, "Roman Barbarzyńca", 'M',
                2009, 1, 01,
                121));
        theForumUser.add( new ForumUser( 2, "Stefan", 'M',
                1997, 2, 01,
                121));
        theForumUser.add( new ForumUser( 3, "Marianna", 'F',
                1982, 3, 23,
                21));
        theForumUser.add( new ForumUser( 4, "Krzysztof", 'M',
                2000, 12, 13,
                213));
        theForumUser.add( new ForumUser( 5, "Aleksandra", 'F',
                2005, 10, 01,
                3));
        theForumUser.add( new ForumUser( 6, "Paulina", 'F',
                2003, 6, 19,
                16));
        theForumUser.add( new ForumUser( 7, "GallAnonim", 'M',
                1050, 1, 1,
                0));
    }
    public List<ForumUser> getUserList(){
        return new ArrayList<>(theForumUser);}
}
    //
//  która będzie zwracała kolekcję z użytkownika forum
