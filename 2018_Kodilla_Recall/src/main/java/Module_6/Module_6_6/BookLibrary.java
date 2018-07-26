package Module_6.Module_6_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BookLibrary {

    LibraryDatabase libraryDatabase;
    private HashMap<LibraryUser, Book> listBooksInHandsUser = new HashMap<LibraryUser, Book>();

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        System.out.println("Title fragment: " + titleFragment);
        List<Book> bookOfList = new ArrayList<Book>();

        if (titleFragment.length() < 3) return bookOfList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);

        if (resultList.size() > 21) return bookOfList;

        bookOfList = resultList;

        return bookOfList;
    }

    public List<Book> listBooksInHands(LibraryUser libraryUser) {

        System.out.println("Library: " + libraryUser.toString());
        List<Book> emptyList = new ArrayList<>();
        if (libraryUser.getPeselId().length() < 8) return emptyList;

        List<Book> resultList = libraryDatabase.listBooksInHandsOf(libraryUser);

        if (resultList.size() > 21) return emptyList;

        emptyList = resultList;
        return emptyList;
    }
}


