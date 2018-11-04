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
        else {
            getStudenti().add(s);
            setTrenutniBrojStudenata(getTrenutniBrojStudenata() + 1);
        }
    }

    public void brisiStudenta(MasterStudent s) throws IllegalArgumentException {
        int indeks = 0;
        for (MasterStudent ms : getStudenti()) {
            if (ms.equals(s)) {
                getStudenti().remove(indeks);
                setTrenutniBrojStudenata(getTrenutniBrojStudenata() - 1);
            }
            indeks++;
        }
        if (indeks == getStudenti().size()) throw new IllegalArgumentException(s.ispisiStudenta() + " nije upisan na ovaj predmet.");
    }
    
}
