package visit.wastepaper;

public class Book extends PrintedProduct {

    public Book(String name) {
        super(name);
    }

    @Override
    public void listPrintedProduct() {
        System.out.println("Книга с названием: " + getName());
    }
}
