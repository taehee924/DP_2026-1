package ch01.A1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class YearDescIterator implements Iterator<Book> {
    private List<Book> sortedBooks;
    private int        index;

    public YearDescIterator(BookShelf bookShelf) {
        sortedBooks = new ArrayList<>();
        for (int i = 0; i < bookShelf.getLength(); i++) {
            Book book = bookShelf.getBookAt(i);
            if(book.getGenre().equals("소설")){//소설만 추가
            sortedBooks.add(book);
            }
        }
        sortedBooks.sort(Comparator.comparingInt(Book::getYear).reversed());
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < sortedBooks.size();
    }

    @Override
    public Book next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return sortedBooks.get(index++);
    }
}