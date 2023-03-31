package visit.house;

import visit.wastepaper.Book;
import visit.wastepaper.Journal;
import visit.wastepaper.PrintedProduct;

import java.util.ArrayList;
import java.util.Random;

public class MagazineStore extends House {
    private final String name;
    private final ArrayList<Journal> journals;

    public MagazineStore(String name, ArrayList<Journal> journals) {
        this.name = name;
        this.journals = journals;
    }

    @Override
    public void getNameHouse() {
        System.out.println("Магазин журналов " + getName());
    }

    @Override
    public void getListPrintedProduct() {
        System.out.println("Магазин журналов на улице " +
                getStreet() + " " + getName() +
                " имеет в наличии: ");
        getNameJournal();
        System.out.println();
    }

    private void getNameJournal() {
        int count = 1;
        for (Journal journal : journals) {
            System.out.println(count + ". " + journal.getName());
            count++;
        }
    }

    @Override
    public Journal getRandomPrintedProduct() {
        Random random = new Random();
        int choice = random.nextInt(getJournals().size());
        Journal journal = getJournals().get(choice);
        getJournals().remove(choice);
        return journal;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Journal> getJournals() {
        return journals;
    }
}
