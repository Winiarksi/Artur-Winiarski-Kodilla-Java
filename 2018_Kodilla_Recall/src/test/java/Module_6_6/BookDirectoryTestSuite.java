package Module_6_6;

import Module_6.Module_6_6.Book;
import Module_6.Module_6_6.BookLibrary;
import Module_6.Module_6_6.LibraryDatabase;
import Module_6.Module_6_6.LibraryUser;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {

    @Test
    public void testListBooksWithConditionsReturnList() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> resultListOfBooks = new ArrayList<Book>();
        resultListOfBooks.add(new Book("Secrets of Alamo", "John Smith", 2008));
        resultListOfBooks.add(new Book("Secretaries and Directors", "Dilbert Michigan", 2012));
        resultListOfBooks.add(new Book("Secret life of programmers", "Steve Wolkowitz", 2016));
        resultListOfBooks.add(new Book("W pustyni i dzungli", "Steve Wolkowitz", 2016));
        resultListOfBooks.add(new Book("Secrets of Java", "Ian Tenewitch", 2010));

        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(5, theListOfBooks.size());
    }

    @Ignore
    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> resultListOfBooks = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf41Books = generateListOfNBooks(41);

        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks")).thenReturn(resultListOfBooks);
        when(libraryDatabaseMock.listBooksWithCondition("FortyOneBooks")).thenReturn(resultListOf41Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks41 = bookLibrary.listBooksWithCondition("FortyOneBooks");

        // Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks41.size());

        assertTrue(false);
    }

    @Ignore
    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);

        when(libraryDatabaseMock.listBooksWithCondition(anyString())).thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("Pi");

        // Then
        assertEquals(0, theListOfBooks10.size());
//        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
        verify(libraryDatabaseMock, never()).listBooksWithCondition(anyString());
    }

    @Test
    public void testListBooksInHands(){
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> listBook1 = generateListOfNBooks(0);
        List<Book> listBook2 = generateListOfNBooks(1);
        List<Book> listBook3 = generateListOfNBooks(5);
        List<LibraryUser> listUser = new ArrayList<>();

        listUser.add(new LibraryUser("Marianna", "Kowalska", "810511004636"));
        listUser.add(new LibraryUser("Robert", "Urbanowicz", "790111001245"));
        listUser.add(new LibraryUser("Krysztof", "Stefaniak", "830105004236"));

        when(libraryDatabaseMock.listBooksInHandsOf(listUser.get(0))).thenReturn(listBook1);
        when(libraryDatabaseMock.listBooksInHandsOf(listUser.get(1))).thenReturn(listBook2);
        when(libraryDatabaseMock.listBooksInHandsOf(listUser.get(2))).thenReturn(listBook3);

        // When
        List<Book> resutlBooksHands = bookLibrary.listBooksInHands(new LibraryUser("Marianna", "Kowalska", "810511004636"));
        List<Book> resutlBooksHands1 = bookLibrary.listBooksInHands(new LibraryUser("Robert", "Urbanowicz", "790111001245"));
        List<Book> resutlBooksHands5 = bookLibrary.listBooksInHands(listUser.get(2));

        // Then
        assertEquals(0, resutlBooksHands.size());
        assertEquals(1, resutlBooksHands1.size());
        assertEquals(5, resutlBooksHands5.size());

    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }
}
