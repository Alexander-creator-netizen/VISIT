package visit.house;

import visit.wastepaper.Book;

import java.util.ArrayList;

public class Library extends House {
    private final String name;
    private final ArrayList<Book> books;

    public Library(String name, ArrayList<Book> book) {
        this.name = name;
        books = book;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
