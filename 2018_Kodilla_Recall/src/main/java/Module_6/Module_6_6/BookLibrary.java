package Module_6.Module_6_6;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {

    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment){

        List<Book> bookList = new ArrayList<Book>();

        if(titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);

        if( resultList.size() > 20 ) return bookList;
        System.out.println("BookList: " + bookList.size());
        bookList =  resultList;
        System.out.println("BookList: " + bookList.size());

        return bookList;
    }

}
