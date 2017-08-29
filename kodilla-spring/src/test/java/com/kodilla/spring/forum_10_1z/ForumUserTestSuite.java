package com.kodilla.spring.forum_10_1z;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest  // inormuje Spring-a, że test dotyczy aplikacji opartej o Spring Boot
public class ForumUserTestSuite {
    @Test
    public void testGetUsername(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");

        ForumUser forumUser = context.getBean(ForumUser.class);
        // Czemu tu trzeba było potórzyć tą samą klasę, tzn zainicjować ją a potem wrzucić do getBean?

        //When
        String name = forumUser.getUsername();

        //Then
        Assert.assertEquals("John Smith", name);
    }
}
