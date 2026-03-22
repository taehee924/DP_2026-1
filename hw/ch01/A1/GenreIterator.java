package ch01.A1;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

public class GenreIterator implements Iterator<Book> {
    private BookShelf bookShelf;
    private String    targetGenre;
    private int       index;
    private Book      nextBook;

    public GenreIterator(BookShelf bookShelf, String targetGenre) {
        this.bookShelf   = bookShelf;
        this.targetGenre = targetGenre;
        this.index       = 0;
        advance();
    }

    private void advance() {
        nextBook = null;
        while (index < bookShelf.getLength()) {
            Book book = bookShelf.getBookAt(index);
            index++;
            if (book != null && Objects.equals(book.getGenre(), targetGenre)) {
                nextBook = book;
                break;
            }
        }
    }

    @Override
    public boolean hasNext() {
        return nextBook != null;
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Book currentBook = nextBook;
        advance();
        return currentBook;
    }
}