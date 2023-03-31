package visit.house;

import visit.wastepaper.Book;

import java.util.ArrayList;
import java.util.Random;

public class Library extends House {
    private final String name;
    private final ArrayList<Book> books;

    public Library(String name, ArrayList<Book> book) {
        this.name = name;
        books = book;
    }

    @Override
    public void getNameHouse() {
        System.out.println("Библиотеку " + getName());
    }

    @Override
    public void getListPrintedProduct() {
        System.out.println("Библиотека на улице " +
                getStreet() + " " + getName() +
                " имеет в наличии: ");
        getNameBook();
        System.out.println();
    }

    private void getNameBook() {
        int count = 1;
        for (Book book : books) {
            System.out.println(count + ". " + book.getName());
            count++;
        }
    }

    @Override
    public Book getRandomPrintedProduct() {
        Random random = new Random();
        int choice = random.nextInt(getBooks().size());
        Book book = getBooks().get(choice);
        getBooks().remove(choice);
        return book;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }
}
