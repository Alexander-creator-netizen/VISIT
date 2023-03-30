package visit.main;

import visit.house.House;
import visit.house.Library;
import visit.house.MagazineStore;
import visit.person.Person;
import visit.wastepaper.Book;
import visit.wastepaper.Journal;
import visit.wastepaper.PrintedProduct;

import java.util.ArrayList;
import java.util.Random;

public interface Visiting {

    static void visit(Person person, ArrayList<House> houses) {
            System.out.println("\n" + person.getName() + " посещает:");

            for (House house : houses) {
                if (house instanceof Library) {
                    System.out.println("библиотеку " + ((Library) house).getName());

                    person.getMyPackage().add(getRandomBookLibrary((Library) house));

                } else if (house instanceof MagazineStore) {
                    System.out.println("магазин журналов " + ((MagazineStore) house).getName());

                    person.getMyPackage().add(getRandomJournalStore((MagazineStore) house));
                }
            }

            System.out.println("\n" + person.getName() + " читает:");
            for (PrintedProduct printedProduct : person.getMyPackage()) {
                if (printedProduct instanceof Book) {
                    System.out.println("Книгу: " + printedProduct.getName() + ".");
                } else if (printedProduct instanceof Journal) {
                    System.out.println("Журнал: " + printedProduct.getName() + ".");
                }
            }
        }

    static Book getRandomBookLibrary(Library library) {
        Random random = new Random();
        int choice = random.nextInt(library.getBooks().size());
        Book book = library.getBooks().get(choice);
        library.getBooks().remove(choice);
        return book;
    }

    static Journal getRandomJournalStore(MagazineStore magazineStore) {
        Random random = new Random();
        int choice = random.nextInt(magazineStore.getJournals().size());
        Journal journal = magazineStore.getJournals().get(choice);
        magazineStore.getJournals().remove(choice);
        return journal;
    }
    }
