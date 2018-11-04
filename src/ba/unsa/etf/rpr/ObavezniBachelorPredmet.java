package ba.unsa.etf.rpr;

public class ObavezniBachelorPredmet extends BachelorPredmet {
    public ObavezniBachelorPredmet(String nazivPredmeta, String sifraPredmeta, int ects, int maxBrojStudenata) {
        super(nazivPredmeta, sifraPredmeta, ects, maxBrojStudenata);
    }

    @Override
    public String ispisiPredmet() {
        return ("ObavezniBachelor" + super.ispisiPredmet());
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof ObavezniMasterPredmet) {
            ObavezniMasterPredmet omp = (ObavezniMasterPredmet) o;
            if (omp.getNazivPredmeta().equals(this.getNazivPredmeta()) && omp.getSifraPredmeta().equals(this.getSifraPredmeta()) && omp.getECTS_BODOVI() == this.getECTS_BODOVI() && omp.getMAX_BROJ_STUDENATA() == this.getMAX_BROJ_STUDENATA())
                return true;
        }
        return false;
    }
}
