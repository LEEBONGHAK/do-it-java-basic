package chapter11.object;

class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title + ", " + author;
    }
}

public class ToStringFx {
    public static void main(String[] args) {
        Book book = new Book("book", "author");
        System.out.println(book);

        String str = new String("test");
        System.out.println(str);
    }
}
