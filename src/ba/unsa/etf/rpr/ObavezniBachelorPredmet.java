package ba.unsa.etf.rpr;

public class ObavezniBachelorPredmet extends BachelorPredmet {
    public ObavezniBachelorPredmet(String nazivPredmeta, String sifraPredmeta, int ects, int maxBrojStudenata) {
        super(nazivPredmeta, sifraPredmeta, ects, maxBrojStudenata);
    }

    @Override
    public String ispisiPredmet() {
        return ("ObavezniBachelor" + super.ispisiPredmet());
    }
}
