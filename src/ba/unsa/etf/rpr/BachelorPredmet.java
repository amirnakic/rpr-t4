package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class BachelorPredmet extends Predmet {
    private List<BachelorStudent> studenti;

    public BachelorPredmet(String nazivPredmeta, String sifraPredmeta, int ects, int maxBrojStudenata) {
        super(nazivPredmeta, sifraPredmeta, ects, maxBrojStudenata);
        this.studenti = new ArrayList<>(this.getTrenutniBrojStudenata());
    }

    public List<BachelorStudent> getStudenti() {
        return studenti;
    }

    public void dodajStudenta(BachelorStudent bs) throws IllegalArgumentException {
        if (getStudenti().contains(bs)) throw new IllegalArgumentException(bs.ispisiStudenta() + " je već upisan na ovaj predmet.");
        else {
            getStudenti().add(bs);
            setTrenutniBrojStudenata(getTrenutniBrojStudenata() + 1);
        }
    }
}
