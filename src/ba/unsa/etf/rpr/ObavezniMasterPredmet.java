package ba.unsa.etf.rpr;

public class ObavezniMasterPredmet extends MasterPredmet {
    public ObavezniMasterPredmet(String nazivPredmeta, String sifraPredmeta, int ects, int maxBrojStudenata) {
        super(nazivPredmeta, sifraPredmeta, ects, maxBrojStudenata);
    }

    @Override
    public String ispisiPredmet() {
        return ("ObavezniMaster" + super.ispisiPredmet());
    }

    public String ispisiStudenteNaPredmetu() {
        String rezultat = new String("");
        for (MasterStudent ms : this.getStudenti())
            rezultat += ms.ispisiStudenta() + "\n";
        return rezultat;
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
