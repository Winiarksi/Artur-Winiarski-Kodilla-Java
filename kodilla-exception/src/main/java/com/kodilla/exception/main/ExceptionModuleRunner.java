package com.kodilla.exception.main;

        import com.kodilla.exception.io_8_1.FileReader;

        import java.nio.file.Path;

public class ExceptionModuleRunner {
    public static void main(String args[]) {
        FileReader fileReader = new FileReader();
        fileReader.readFile();

    }
}
