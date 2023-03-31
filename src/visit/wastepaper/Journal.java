package visit.wastepaper;

public class Journal extends PrintedProduct {

    public Journal(String name) {
        super(name);
    }

    @Override
    public void listPrintedProduct() {
        System.out.println("Журнал с названием: " + getName());
    }
}
