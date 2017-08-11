package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {
    public void readFile() {
        ClassLoader classLoader = getClass().getClassLoader();

        try {

        File file = new File(classLoader.getResource("fil/names.txt").getFile());
        //Path path = Paths.get(file.getPath().replace("%20", " "));
        Stream<String> fileLines = Files.lines(Paths.get(file.getPath().replace("%20", " ")));
        fileLines.forEach(System.out::println);

        } catch ( IOException e) {
            System.out.println("Oh no! Something went wrong!" + e);
        }finally {
            System.out.println("I'm gonna be here, always!");
        }

    }
}
