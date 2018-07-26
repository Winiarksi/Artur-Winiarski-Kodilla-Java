package Module_6.Module_6_6;

import java.util.List;

public interface LibraryDatabase {

    List<Book> listBooksWithCondition(String titleFragment);
    List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    boolean rentABook(LibraryUser libraryUser, Book book);

    int returnBooks(LibraryUser libraryUser);
}
