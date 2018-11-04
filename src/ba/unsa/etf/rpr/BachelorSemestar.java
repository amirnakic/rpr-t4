package ba.unsa.etf.rpr;

import java.util.ArrayList;
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

    public void dodajPredmet(BachelorPredmet bp) throws IllegalArgumentException, ArrayStoreException {
        if (bp instanceof ObavezniBachelorPredmet) {
            if (getObavezniPredmeti().contains(bp)) throw new IllegalArgumentException(bp.ispisiPredmet() + " je već dodan u ovaj semestar.");
            else if (getObavezniPredmeti().size() == getBROJ_OBAVEZNIH_PREDMETA()) throw new ArrayStoreException(bp.ispisiPredmet() + " nije dodan, jer je popunjen broj obaveznih predmeta u semestru.");
            else {
                getObavezniPredmeti().add((ObavezniBachelorPredmet)bp);
                this.setTrenutniBrojObaveznihPredmeta(this.getTrenutniBrojObaveznihPredmeta() + 1);
                this.setTrenutniBrojECTSBodova(this.getTrenutniBrojECTSBodova() + bp.getECTS_BODOVI());
            }
        }
        else {
            if (getIzborniPredmeti().contains(bp)) throw new IllegalArgumentException(bp.ispisiPredmet() + " je već dodan u ovaj semestar.");
            else if (getIzborniPredmeti().size() == getBROJ_IZBORNIH_PREDMETA()) throw new ArrayStoreException(bp.ispisiPredmet() + " nije dodan, jer je popunjen broj obaveznih predmeta u semestru.");
            else {
                getIzborniPredmeti().add((IzborniBachelorPredmet)bp);
                this.setTrenutniBrojIzbornihPredmeta(this.getTrenutniBrojIzbornihPredmeta() + 1);
                this.setTrenutniBrojECTSBodova(this.getTrenutniBrojECTSBodova() + bp.getECTS_BODOVI());
            }
        }
    }

    
}
