package ch01.A1;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        BookShelf bookShelf = new BookShelf(10);
        bookShelf.appendBook(new Book("클린코드",             "기술", 2008, 30000));
        bookShelf.appendBook(new Book("해리포터와 마법사의 돌", "소설", 1997, 15000));
        bookShelf.appendBook(new Book("사피엔스",             "역사", 2011, 18000));
        bookShelf.appendBook(new Book("이펙티브 자바",         "기술", 2018, 36000));
        bookShelf.appendBook(new Book("객체지향의 사실과 오해", "기술", 2015, 20000));
        bookShelf.appendBook(new Book("레미제라블",            "소설", 1862, 12000));
        bookShelf.appendBook(new Book("총균쇠",               "역사", 1997, 22000));
        bookShelf.appendBook(new Book("리팩터링",              "기술", 2018, 34000));
        bookShelf.appendBook(new Book("로마인 이야기",          "역사", 1992, 25000));
        bookShelf.appendBook(new Book("어린왕자",              "소설", 1943,  9000));

        // [4-2] 장르 필터 테스트 — 소설
        System.out.println("=== 장르: 소설 ===");
        Iterator<Book> genreIt = bookShelf.iteratorByGenre("소설");
        while (genreIt.hasNext()) {
            Book book = genreIt.next();
            System.out.printf("제목: %-20s | 장르: %s | 출판연도: %d | 가격: %.0f원%n",
                    book.getName(), book.getGenre(), book.getYear(), book.getPrice());
        }
        System.out.println();

        // [4-3] 출판연도 역순 테스트
        System.out.println("=== 출판연도 최신순 ===");
        Iterator<Book> yearIt = bookShelf.iteratorByYear();
        while (yearIt.hasNext()) {
            Book book = yearIt.next();
            System.out.printf("제목: %-20s | 장르: %s | 출판연도: %d | 가격: %.0f원%n",
                    book.getName(), book.getGenre(), book.getYear(), book.getPrice());
        }
    }
}