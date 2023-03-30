package visit.main;

import visit.house.House;
import visit.house.Library;
import visit.house.MagazineStore;
import visit.person.Person;
import visit.wastepaper.Book;
import visit.wastepaper.Journal;
import visit.wastepaper.PaperPlant;
import visit.wastepaper.PrintedProduct;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Visit implements Visiting {

    static Set<PrintedProduct> packagePersonOne = new HashSet<>();
    static Set<PrintedProduct> packagePersonTwo = new HashSet<>();

    public static void main(String[] args) {

        PaperPlant plant = new PaperPlant();

        ArrayList<PrintedProduct> products = new ArrayList<>();

        products.add(plant.getBookOne());
        products.add(plant.getBookTwo());
        products.add(plant.getBookThree());
        products.add(plant.getBookFour());
        products.add(plant.getJourOne());
        products.add(plant.getJourTwo());
        products.add(plant.getJourThree());
        products.add(plant.getJourFour());

        plant.sortWastePaper(products);
        plant.transitLib();
        plant.transitMagStore();

        House libOne = new Library("им. Пушкина", plant.getCarForLibOne());
        House libTwo = new Library("им. Есенина", plant.getCarForLibTwo());

        House magStoreOne = new MagazineStore("\"Глянцевое чудо\"", plant.getCarForMagOne());
        House magStoreTwo = new MagazineStore("\"Для детей\"", plant.getCarForMagTwo());

        ArrayList<House> house = new ArrayList<>();

        house.add(libOne);
        house.add(libTwo);
        house.add(magStoreOne);
        house.add(magStoreTwo);

        listHouse(house);

        Person personOne = new Person("Александр", packagePersonOne);
        Person personTwo = new Person("Дмитрий", packagePersonTwo);

        Visiting.visit(personOne, house);
        Visiting.visit(personTwo, house);
    }

    private static void listHouse(ArrayList<House> houses) {
        for (House house : houses) {
            if (house instanceof Library) {
                System.out.println("Библиотека на улице " +
                        house.getStreet() + " " + ((Library) house).getName() +
                        " имеет в наличии: ");
                getBookLibrary(((Library) house).getBooks());
                System.out.println();
            } else if (house instanceof MagazineStore) {
                System.out.println("Магазин журналов на улице " +
                        house.getStreet() + " " + ((MagazineStore) house).getName() +
                        " имеет в наличии: ");
                getJournalMagStore(((MagazineStore) house).getJournals());
                System.out.println();
            }
        }
    }

    private static void getBookLibrary(ArrayList<Book> books) {
        int count = 1;
        for (Book book : books) {
            System.out.println(count + ". " + book.getName());
            count++;
        }
    }

    private static void getJournalMagStore(ArrayList<Journal> journals) {
        int count = 1;
        for (Journal journal : journals) {
            System.out.println(count + ". " + journal.getName());
            count++;
        }
    }

//    public void visit(Person, ArrayList<House> houses) {
//        System.out.println("\n" + person.getName() + " посещает:");
//
//        for (House house : houses) {
//            if (house instanceof Library) {
//                System.out.println("библиотеку " + ((Library) house).getName());
//
//                person.getMyPackage().add(getRandomBookLibrary((Library) house));
//
//            } else if (house instanceof MagazineStore) {
//                System.out.println("магазин журналов " + ((MagazineStore) house).getName());
//
//                person.getMyPackage().add(getRandomJournalStore((MagazineStore) house));
//            }
//        }
//
//        System.out.println("\n" + person.getName() + " читает:");
//        for (PrintedProduct printedProduct : person.getMyPackage()) {
//            if (printedProduct instanceof Book) {
//                System.out.println("Книгу: " + printedProduct.getName() + ".");
//            } else if (printedProduct instanceof Journal) {
//                System.out.println("Журнал: " + printedProduct.getName() + ".");
//            }
//        }
//    }

//    public Book getRandomBookLibrary(Library library) {
//        Random random = new Random();
//        int choice = random.nextInt(library.getBooks().size());
//        Book book = library.getBooks().get(choice);
//        library.getBooks().remove(choice);
//        return book;
//    }
//
//    public Journal getRandomJournalStore(MagazineStore magazineStore) {
//        Random random = new Random();
//        int choice = random.nextInt(magazineStore.getJournals().size());
//        Journal journal = magazineStore.getJournals().get(choice);
//        magazineStore.getJournals().remove(choice);
//        return journal;
//    }
}
