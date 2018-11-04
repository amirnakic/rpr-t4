package ba.unsa.etf.rpr;

public class IzborniMasterPredmet extends MasterPredmet {
    public IzborniMasterPredmet(String nazivPredmeta, String sifraPredmeta, int ects, int maxBrojStudenata) {
        super(nazivPredmeta, sifraPredmeta, ects, maxBrojStudenata);
    }

    @Override
    public String ispisiPredmet() {
        return ("IzborniMaster" + super.ispisiPredmet());
    }
}
