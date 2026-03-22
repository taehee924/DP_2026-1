package ch01.A1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookShelf implements Iterable<Book> {
    private List<Book> books;

    public BookShelf(int initialsize) {
        this.books = new ArrayList<>(initialsize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }

    // Step 3: 장르 필터 Iterator 반환
    public Iterator<Book> iteratorByGenre(String genre) {
        return new GenreIterator(this, genre);
    }

    // Step 3: 출판연도 역순 Iterator 반환
    public Iterator<Book> iteratorByYear() {
        return new YearDescIterator(this);
    }
}