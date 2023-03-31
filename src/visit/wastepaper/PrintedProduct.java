package visit.wastepaper;

public abstract class PrintedProduct {
    private final String name;

    public PrintedProduct(String name) {
        this.name = name;
    }

    public void listPrintedProduct() {
    }

    public String getName() {
        return name;
    }
}
