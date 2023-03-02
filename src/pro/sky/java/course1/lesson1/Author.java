package pro.sky.java.course1.lesson1;

public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Имя и отчество автора - " + this.name + ", фамилия автора - " + this.surname;
    }

    @Override
    // переопределили метод так, чтобы если фамилии будут равны то и объекты будут равны
    public boolean equals(Object obj) {
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        return this.getSurname().equals(((Author) obj).getSurname());
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(surname);
    }
}
