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
import java.util.Random;
import java.util.Set;

public class Visit {

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

        visit(personOne, house);
        visit(personTwo, house);
    }

    private static void listHouse(ArrayList<House> houses) {
        for (House house : houses) {
            house.getListPrintedProduct();
        }
    }

    private static void visit(Person person, ArrayList<House> houses) {
        System.out.println("\n" + person.getName() + " посещает:");
        for (House house : houses) {
            house.getNameHouse();
            person.getMyPackage().add(house.getRandomPrintedProduct());
        }

        System.out.println("\n" + person.getName() + " читает:");
        for (PrintedProduct printedProduct : person.getMyPackage()) {
            printedProduct.listPrintedProduct();
        }
    }
}
