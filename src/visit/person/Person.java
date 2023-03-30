package visit.person;

import visit.wastepaper.PrintedProduct;

import java.util.Set;

public class Person {
    private final String name;
    private final Set<PrintedProduct> myPackage;

    public Person(String name, Set<PrintedProduct> printedProducts) {
        this.name = name;
        this.myPackage = printedProducts;
    }

    public Set<PrintedProduct> getMyPackage() {
        return myPackage;
    }

    public String getName() {
        return name;
    }

}
