package com.kodilla.stream;

import com.kodilla.stream.forumuser_7_3z.Forum;
import com.kodilla.stream.forumuser_7_3z.ForumUser;

import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
    Forum theForum = new Forum();
    String theResultStringOfUser = theForum.getUserList().stream()
            .filter(forumUser -> forumUser.getSex()=='M')
            .filter(forumUser -> forumUser.getBirthDate().getYear() > 1997)
                    .map(ForumUser::toString)
            .collect(Collectors.joining(",\n","* * * * *\n","\n* * * * *"));
            // jak tu zrobić Nr rosnąco po jedynce ?
            System.out.println(theResultStringOfUser);
    }
}

/*
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        BookDirectory theBookDirectory = new BookDirectory();

        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<- "," ->>"));

        System.out.println(theResultStringOfBooks);
    }
}

public class StreamMain {
    public static void main(String[] args) {
                BookDirectory theBookDirectory = new BookDirectory();

                Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
                        .filter(book -> book.getYearOfPublication() > 2005)
                        .collect(Collectors.toMap(Book::getSignature, book -> book));

                System.out.println("# elements: " + theResultMapOfBooks.size());
                theResultMapOfBooks.entrySet().stream()
                        .map(entry -> entry.getKey() + ": " + entry.getValue())
                        .forEach(System.out::println);
            }
    }


import com.kodilla.stream.book_7_3.BookDirectory;
public class StreamMain {
    public static void main(String[] args) {
        BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);
    }


import com.kodilla.stream.person_7_3.People;
        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                    .forEach(System.out::println);
            }
        }

import com.kodilla.stream.beautifier_7_1.PoemBeautifier;
import com.kodilla.stream.iterate_7_2.NumbersGenerator;
import com.kodilla.stream.lambda_7_1.ExpressionExecutor;
import com.kodilla.stream.reference_7_1.FunctionalCalculator;


        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify("*** ", (text) -> text.substring(1).replace("*", "###@@@###@@@###@@@###")));
        System.out.println(poemBeautifier.beautify("Kwiatki, bratki i stokrotki", (text) -> text.toUpperCase()));
        System.out.println(poemBeautifier.beautify("  Ale  że o chodzi z tym dekorowaniem?", (text) -> text.trim().toLowerCase().replace("?", "?!?")));
        System.out.println(poemBeautifier.beautify(" *** XXX  ***", (text) -> text.trim()));
        System.out.println("");
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

*/
