package Module_6.Module_6_6;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {

    LibraryDatabase lIbraryDatabase;

    public BookLibrary(LibraryDatabase lIbraryDatabase) {
        this.lIbraryDatabase = lIbraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment){
        List<Book> bookList = new ArrayList<Book>();
        bookList.add(new Book("The book title", "The book author" , 2000));

        return bookList;
    }

}
