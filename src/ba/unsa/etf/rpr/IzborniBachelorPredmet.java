package ba.unsa.etf.rpr;

public class IzborniBachelorPredmet extends BachelorPredmet {
    public IzborniBachelorPredmet(String nazivPredmeta, String sifraPredmeta, int ects, int maxBrojStudenata) {
        super(nazivPredmeta, sifraPredmeta, ects, maxBrojStudenata);
    }

    @Override
    public String ispisiPredmet() {
        return ("IzborniBachelor" + super.ispisiPredmet());
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof IzborniBachelorPredmet) {
            IzborniBachelorPredmet omp = (IzborniBachelorPredmet) o;
            if (omp.getNazivPredmeta().equals(this.getNazivPredmeta()) && omp.getSifraPredmeta().equals(this.getSifraPredmeta()) && omp.getECTS_BODOVI() == this.getECTS_BODOVI() && omp.getMAX_BROJ_STUDENATA() == this.getMAX_BROJ_STUDENATA())
                return true;
        }
        return false;
    }
}
