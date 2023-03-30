package visit.wastepaper;

import java.util.ArrayList;

public class PaperPlant implements PlantWork {

    PrintedProduct bookOne = new Book("\"Сказка о рыбаке и рыбке\"");
    PrintedProduct bookTwo = new Book("\"Мастер и Маргарита\"");
    PrintedProduct bookThree = new Book("\"Евгений Онегин\"");
    PrintedProduct bookFour = new Book("\"Мёртвые души\"");

    PrintedProduct jourOne = new Journal("\"PlayBoy\"");
    PrintedProduct jourTwo = new Journal("\"Звёзды эстрады\"");
    PrintedProduct jourThree = new Journal("\"Винни-Пух и все, все, все\"");
    PrintedProduct jourFour = new Journal("\"Дюймовочка\"");

    private final ArrayList<Book> books = new ArrayList<>();
    private final ArrayList<Journal> journals = new ArrayList<>();

    ArrayList<Book> carForLibOne = new ArrayList<>();
    ArrayList<Book> carForLibTwo = new ArrayList<>();

    ArrayList<Journal> carForMagOne = new ArrayList<>();
    ArrayList<Journal> carForMagTwo = new ArrayList<>();

    @Override
    public void sortWastePaper(ArrayList<PrintedProduct> array) {
        System.out.println("Waste paper is sorted, please wait.");

        for (PrintedProduct ar : array) {
            if (ar instanceof Book) {
                books.add((Book) ar);
            } else if (ar instanceof Journal) {
                journals.add((Journal) ar);
            }
        }

        System.out.println("\nThe sorting was successful.\n");
    }

    @Override
    public void transitLib() {

        do {
            carForLibOne.add(books.get(0));
            books.remove(0);
        } while (carForLibOne.size() < 2);

        carForLibTwo.addAll(books);
        System.out.println("Books have been delivered to libraries.");
    }

    @Override
    public void transitMagStore() {
        do {
            carForMagOne.add(journals.get(0));
            journals.remove(0);
        } while (carForMagOne.size() < 2);

        carForMagTwo.addAll(journals);
        System.out.println("Journals have been delivered to stores.\n");
    }

    public PrintedProduct getBookOne() {
        return bookOne;
    }

    public PrintedProduct getBookTwo() {
        return bookTwo;
    }

    public PrintedProduct getBookThree() {
        return bookThree;
    }

    public PrintedProduct getBookFour() {
        return bookFour;
    }

    public PrintedProduct getJourOne() {
        return jourOne;
    }

    public PrintedProduct getJourTwo() {
        return jourTwo;
    }

    public PrintedProduct getJourThree() {
        return jourThree;
    }

    public PrintedProduct getJourFour() {
        return jourFour;
    }

    public ArrayList<Book> getCarForLibOne() {
        return carForLibOne;
    }

    public ArrayList<Book> getCarForLibTwo() {
        return carForLibTwo;
    }

    public ArrayList<Journal> getCarForMagOne() {
        return carForMagOne;
    }

    public ArrayList<Journal> getCarForMagTwo() {
        return carForMagTwo;
    }
}
