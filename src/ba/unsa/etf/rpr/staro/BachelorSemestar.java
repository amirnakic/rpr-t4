package ba.unsa.etf.rpr.staro;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BachelorSemestar extends Semestar {
    private List<ObavezniBachelorPredmet> obavezniPredmeti;
    private List<IzborniBachelorPredmet> izborniPredmeti;

    public BachelorSemestar(int brojSemestra, int ectsBodovi, int brojObaveznihPredmeta, int brojIzbornihPredmeta) {
        super(brojSemestra, ectsBodovi, brojObaveznihPredmeta, brojIzbornihPredmeta);
        this.obavezniPredmeti = new ArrayList<>(this.getTrenutniBrojObaveznihPredmeta());
        this.izborniPredmeti = new ArrayList<>(this.getTrenutniBrojIzbornihPredmeta());
    }

    public List<ObavezniBachelorPredmet> getObavezniPredmeti() {
        return obavezniPredmeti;
    }

    public List<IzborniBachelorPredmet> getIzborniPredmeti() {
        return izborniPredmeti;
    }

    public boolean provjeriKorektnostSemestra() {
        if (getObavezniPredmeti().size() == this.getBROJ_OBAVEZNIH_PREDMETA() && getIzborniPredmeti().size() == this.getBROJ_IZBORNIH_PREDMETA() && this.getUKUPAN_BROJ_ECTS_BODOVA() != this.getTrenutniBrojECTSBodova())
            return false;
        return true;
    }

    public void dodajPredmet(BachelorPredmet bp) throws IllegalArgumentException, ArrayStoreException {
        if (bp instanceof ObavezniBachelorPredmet) {
            if (getObavezniPredmeti().contains(bp))
                throw new IllegalArgumentException(bp.ispisiPredmet() + " je već dodan u ovaj semestar.");
            else if (getObavezniPredmeti().size() == getBROJ_OBAVEZNIH_PREDMETA())
                throw new ArrayStoreException(bp.ispisiPredmet() + " nije dodan, jer je popunjen broj obaveznih predmeta u semestru.");
            else {
                getObavezniPredmeti().add((ObavezniBachelorPredmet) bp);
                this.setTrenutniBrojObaveznihPredmeta(this.getTrenutniBrojObaveznihPredmeta() + 1);
                this.setTrenutniBrojECTSBodova(this.getTrenutniBrojECTSBodova() + bp.getECTS_BODOVI());
            }
        } else {
            if (getIzborniPredmeti().contains(bp))
                throw new IllegalArgumentException(bp.ispisiPredmet() + " je već dodan u ovaj semestar.");
            else if (getIzborniPredmeti().size() == getBROJ_IZBORNIH_PREDMETA())
                throw new ArrayStoreException(bp.ispisiPredmet() + " nije dodan, jer je popunjen broj obaveznih predmeta u semestru.");
            else {
                getIzborniPredmeti().add((IzborniBachelorPredmet) bp);
                this.setTrenutniBrojIzbornihPredmeta(this.getTrenutniBrojIzbornihPredmeta() + 1);
                this.setTrenutniBrojECTSBodova(this.getTrenutniBrojECTSBodova() + bp.getECTS_BODOVI());
            }
        }
        if (!provjeriKorektnostSemestra()) {
            getObavezniPredmeti().clear();
            getIzborniPredmeti().clear();
            throw new IllegalArgumentException("Unesite ponovo predmete u semestar. Predmeti u zbiru moraju imati preko 30 ECTS-bodova.");
        }
    }

    public void brisiPredmet(BachelorPredmet bp) throws IllegalArgumentException {
        if (bp instanceof ObavezniBachelorPredmet) {
            Iterator it = getObavezniPredmeti().iterator();
            while (it.hasNext()) {
                ObavezniBachelorPredmet obp1 = (ObavezniBachelorPredmet) it.next();
                if (obp1.equals(bp)) {
                    getObavezniPredmeti().remove(bp);
                    setTrenutniBrojObaveznihPredmeta(this.getTrenutniBrojObaveznihPredmeta() - 1);
                    setTrenutniBrojECTSBodova(this.getUKUPAN_BROJ_ECTS_BODOVA() - bp.getECTS_BODOVI());
                    return;
                }
            }
            throw new IllegalArgumentException(bp.ispisiPredmet() + " nije dodan u ovaj semestar.");
        } else {
            Iterator it = getIzborniPredmeti().iterator();
            while (it.hasNext()) {
                IzborniBachelorPredmet ibp1 = (IzborniBachelorPredmet) it.next();
                if (ibp1.equals(bp)) {
                    getIzborniPredmeti().remove(bp);
                    setTrenutniBrojIzbornihPredmeta(this.getTrenutniBrojIzbornihPredmeta() - 1);
                    setTrenutniBrojECTSBodova(this.getUKUPAN_BROJ_ECTS_BODOVA() - bp.getECTS_BODOVI());
                    return;
                }
            }
            throw new IllegalArgumentException(bp.ispisiPredmet() + " nije dodan u ovaj semestar.");
        }
    }

    @Override
    public String ispisiSemestar() {
        return ("Bachelor" + super.ispisiSemestar());
    }

    public String ispisiPredmeteUSemestru() {
        String rezultat = new String("");
        for (ObavezniBachelorPredmet obp : getObavezniPredmeti()) rezultat += obp.ispisiPredmet() + "\n";
        for (IzborniBachelorPredmet ibp : getIzborniPredmeti()) rezultat += ibp.ispisiPredmet() + "\n";
        return rezultat;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof BachelorSemestar) {
            BachelorSemestar bs = (BachelorSemestar) o;
            if (bs.getBrojSemestra() == this.getBrojSemestra())
                return true;
        }
        return false;
    }
}
