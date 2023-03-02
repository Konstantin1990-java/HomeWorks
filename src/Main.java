import pro.sky.java.course1.lesson1.Author;
import pro.sky.java.course1.lesson1.Book;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Николай Васильевич", "Гоголь");
        Author author2 = new Author("Александр Сергеевич", "Пушкин");
        Book book1 = new Book("Мертвые души", author1, 1852);
        Book book2 = new Book("Евгений Онегин", author2, 1832);
        book2.setPublishingYear(1852); // меняем год публикации у объекта book2
        System.out.println(book1);
        System.out.println(book1.equals(book2));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());

    }
}