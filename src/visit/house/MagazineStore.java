package visit.house;

import visit.wastepaper.Journal;

import java.util.ArrayList;

public class MagazineStore extends House {
    private final String name;
    private final ArrayList<Journal> journals;

    public MagazineStore(String name, ArrayList<Journal> journals) {
        this.name = name;
        this.journals = journals;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Journal> getJournals() {
        return journals;
    }
}
