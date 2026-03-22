package ch01.A1;

public class Book {
    private String name;
    private String genre;
    private int year;
    private double price;

    //기존 생성자 유지
    public Book(String name) {
        this.name = name;
        this.genre="";
        this.year=0;
        this.price=0.0;
    }
    //새 필드를 모두 받는 오버로딩 생성자
    public Book(String name, String genre, int year, double price) {
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.price = price;
    }
    //Getter (setter 없음 - 불변 객체 유지)
    public String getName() {return name; }
    public String getGenre(){return genre; }
    public int  getYear(){return year; }
    public double getPrice(){return price; }

}
