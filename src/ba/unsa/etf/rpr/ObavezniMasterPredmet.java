package ba.unsa.etf.rpr;

public class ObavezniMasterPredmet extends MasterPredmet {
    public ObavezniMasterPredmet(String nazivPredmeta, String sifraPredmeta, int ects, int maxBrojStudenata) {
        super(nazivPredmeta, sifraPredmeta, ects, maxBrojStudenata);
    }

    @Override
    public String ispisiPredmet() {
        return ("ObavezniMaster" + super.ispisiPredmet());
    }

}
