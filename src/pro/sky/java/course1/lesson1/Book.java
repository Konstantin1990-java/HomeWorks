package pro.sky.java.course1.lesson1;

public class Book {
    private final String bookName;
    private final Author author;
    private int publishingYear;

    public Book(String bookName, Author author, int publishingYear) {
        this.bookName = bookName;
        this.author = author;
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

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Название книги - " + this.bookName + ", "
                + this.author + ", год публикации - " + this.publishingYear;
    }

    @Override
    // переопределили метод так, чтобы если годы публикации будут равны то и объекты будут равны
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        return this.getPublishingYear() == ((Book) obj).getPublishingYear();
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(publishingYear);
    }
}
