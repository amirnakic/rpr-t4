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

    public void dodajStudenta(MasterStudent ms) throws IllegalArgumentException {
        if (getStudenti().contains(ms)) throw new IllegalArgumentException(ms.ispisiStudenta() + " je već upisan na ovaj predmet.");
        else {
            getStudenti().add(ms);
            setTrenutniBrojStudenata(getTrenutniBrojStudenata() + 1);
        }
    }

    public void brisiStudenta(MasterStudent ms) throws IllegalArgumentException {
        int indeks = 0;
        for (MasterStudent ms1 : getStudenti()) {
            if (ms1.equals(ms)) {
                getStudenti().remove(indeks);
                setTrenutniBrojStudenata(getTrenutniBrojStudenata() - 1);
            }
            indeks++;
        }
        if (indeks == getStudenti().size()) throw new IllegalArgumentException(ms.ispisiStudenta() + " nije upisan na ovaj predmet.");
    }

    public String ispisiStudenteNaPredmetu() {
        String rezultat = new String("");
        for (MasterStudent ms : this.getStudenti())
            rezultat += ms.ispisiStudenta() + "\n";
        return rezultat;
    }
}
