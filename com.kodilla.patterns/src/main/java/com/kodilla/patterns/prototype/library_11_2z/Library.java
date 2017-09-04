package com.kodilla.patterns.prototype.library_11_2z;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library  extends Prototype {
    String name;
    Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public String toString(){
        String s = "Library [" + name + "]\n";
        for (Book book : books) {
        s = s + book.toString() + "\n";
        }
        return s;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library)super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library cloneLibrary = (Library)super.clone();
        cloneLibrary.books = new HashSet<>();
        for ( Book book : books){
            cloneLibrary.getBooks().add(book);
        }
        return cloneLibrary;
    }
}