package ba.unsa.etf.rpr.staro;

import java.util.ArrayList;
import java.util.Iterator;
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

    public void dodajStudenta(BachelorStudent bs) throws IllegalArgumentException, ArrayStoreException {
        if (getStudenti().contains(bs))
            throw new IllegalArgumentException(bs.ispisiStudenta() + " je već upisan na ovaj predmet.");
        else if (getStudenti().size() == this.getMAX_BROJ_STUDENATA())
            throw new ArrayStoreException(bs.ispisiStudenta() + " nije upisan jer je popunjen kapacitet predmeta.");
        else {
            getStudenti().add(bs);
            setTrenutniBrojStudenata(getTrenutniBrojStudenata() + 1);
        }
    }

    public void brisiStudenta(BachelorStudent bs) throws IllegalArgumentException {
        Iterator it = getStudenti().iterator();
        while (it.hasNext()) {
            BachelorStudent bs1 = (BachelorStudent) it.next();
            if (bs1.equals(bs)) {
                getStudenti().remove(bs);
                return;
            }
        }
        throw new IllegalArgumentException(bs.ispisiStudenta() + " nije upisan na ovaj predmet.");
    }

    public BachelorStudent dajStudentaPoIndeksu(int brojIndeksa) throws IllegalArgumentException {
        Iterator it = getStudenti().iterator();
        while (it.hasNext()) {
            BachelorStudent ms = (BachelorStudent) it.next();
            if (ms.getBrojIndeksa() == brojIndeksa) return ms;
        }
        throw new IllegalArgumentException("Student sa indeksom " + brojIndeksa + " nije upisan na ovaj predmet.");
    }

    public String ispisiStudenteNaPredmetu() {
        String rezultat = new String("");
        for (BachelorStudent bs : this.getStudenti())
            rezultat += bs.ispisiStudenta() + "\n";
        return rezultat;
    }
}
