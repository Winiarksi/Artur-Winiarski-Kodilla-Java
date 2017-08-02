package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemDecorator ){
     String result;
        result = poemDecorator.decorate( text);
    }
}
/*
metodę beautify, której jako parametry będzie
 można przekazać tekst do upiększenia oraz
 wyrażenie lambda upiększające tekst.
 */