package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class MasterPredmet extends Predmet {
    private List<MasterStudent> studenti;

    public MasterPredmet(String nazivPredmeta, String sifraPredmeta, int ects, int maxBrojStudenata) {
        super(nazivPredmeta, sifraPredmeta, ects, maxBrojStudenata);
        this.studenti = new ArrayList<>(this.getTrenutniBrojStudenata());
    }

    public List<MasterStudent> getStudenti() {
        return studenti;
    }

    public void dodajStudenta(MasterStudent s) throws IllegalArgumentException {
        if (getStudenti().contains(s)) throw new IllegalArgumentException(s.ispisiStudenta() + " je već upisan na ovaj predmet.");
        else getStudenti().add(s);
    }
}
