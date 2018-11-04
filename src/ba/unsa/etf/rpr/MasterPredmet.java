package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Iterator;
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
        if (getStudenti().contains(ms))
            throw new IllegalArgumentException(ms.ispisiStudenta() + " je već upisan na ovaj predmet.");
        else {
            getStudenti().add(ms);
            setTrenutniBrojStudenata(getTrenutniBrojStudenata() + 1);
        }
    }

    public void brisiStudenta(MasterStudent ms) throws IllegalArgumentException {
        Iterator it = getStudenti().iterator();
        while (it.hasNext()) {
            MasterStudent ms1 = (MasterStudent) it.next();
            if (ms1.equals(ms)) {
                getStudenti().remove(ms);
                return;
            }
        }
        throw new IllegalArgumentException(ms.ispisiStudenta() + " nije upisan na ovaj predmet.");
    }

    public MasterStudent dajStudentaPoIndeksu(int brojIndeksa) throws IllegalArgumentException {
        Iterator it = getStudenti().iterator();
        while(it.hasNext()) {
            MasterStudent ms = (MasterStudent) it.next();
            if (ms.getBrojIndeksa() == brojIndeksa) return ms;
        }
        throw new IllegalArgumentException("Student sa indeksom " + brojIndeksa + " nije upisan na ovaj predmet.");
    }

    public String ispisiStudenteNaPredmetu() {
        String rezultat = new String("");
        for (MasterStudent ms : this.getStudenti())
            rezultat += ms.ispisiStudenta() + "\n";
        return rezultat;
    }
}
