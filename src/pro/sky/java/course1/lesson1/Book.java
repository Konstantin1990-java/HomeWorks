package pro.sky.java.course1.lesson1;

public class Book {
    private String bookName;
    private Author author;
    private int publishingYear;

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return bookName;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public Book(String bookName, Author author, int publishingYear) {
        this.bookName = bookName;
        this.author = author;
        this.publishingYear = publishingYear;
    }
}
