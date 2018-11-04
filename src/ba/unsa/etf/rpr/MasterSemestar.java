package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MasterSemestar extends Semestar {
    private List<ObavezniMasterPredmet> obavezniPredmeti;
    private List<IzborniMasterPredmet> izborniPredmeti;

    public MasterSemestar(int brojSemestra, int ectsBodovi, int brojObaveznihPredmeta, int brojIzbornihPredmeta) {
        super(brojSemestra, ectsBodovi, brojObaveznihPredmeta, brojIzbornihPredmeta);
        obavezniPredmeti = new ArrayList<>(this.getTrenutniBrojObaveznihPredmeta());
        izborniPredmeti = new ArrayList<>(this.getTrenutniBrojIzbornihPredmeta());
    }

    public List<ObavezniMasterPredmet> getObavezniPredmeti() {
        return obavezniPredmeti;
    }

    public List<IzborniMasterPredmet> getIzborniPredmeti() {
        return izborniPredmeti;
    }

    public boolean provjeriKorektnostSemestra() {
        if (getObavezniPredmeti().size() == this.getBROJ_OBAVEZNIH_PREDMETA() && getIzborniPredmeti().size() == this.getBROJ_IZBORNIH_PREDMETA() && this.getUKUPAN_BROJ_ECTS_BODOVA() != this.getTrenutniBrojECTSBodova())
            return false;
        return true;
    }

    public void dodajPredmet(MasterPredmet mp) throws IllegalArgumentException, ArrayStoreException {
        if (mp instanceof ObavezniMasterPredmet) {
            if (getObavezniPredmeti().contains(mp))
                throw new IllegalArgumentException(mp.ispisiPredmet() + " je već dodan u ovaj semestar.");
            else if (getObavezniPredmeti().size() == getBROJ_OBAVEZNIH_PREDMETA())
                throw new ArrayStoreException(mp.ispisiPredmet() + " nije dodan, jer je popunjen broj obaveznih predmeta u semestru.");
            else {
                getObavezniPredmeti().add((ObavezniMasterPredmet) mp);
                this.setTrenutniBrojObaveznihPredmeta(this.getTrenutniBrojObaveznihPredmeta() + 1);
                this.setTrenutniBrojECTSBodova(this.getTrenutniBrojECTSBodova() + mp.getECTS_BODOVI());
            }
        } else {
            if (getIzborniPredmeti().contains(mp))
                throw new IllegalArgumentException(mp.ispisiPredmet() + " je već dodan u ovaj semestar.");
            else if (getIzborniPredmeti().size() == getBROJ_IZBORNIH_PREDMETA())
                throw new ArrayStoreException(mp.ispisiPredmet() + " nije dodan, jer je popunjen broj obaveznih predmeta u semestru.");
            else {
                getIzborniPredmeti().add((IzborniMasterPredmet) mp);
                this.setTrenutniBrojIzbornihPredmeta(this.getTrenutniBrojIzbornihPredmeta() + 1);
                this.setTrenutniBrojECTSBodova(this.getTrenutniBrojECTSBodova() + mp.getECTS_BODOVI());
            }
        }
        if (!provjeriKorektnostSemestra()) {
            getObavezniPredmeti().clear();
            getIzborniPredmeti().clear();
            throw new IllegalArgumentException("Unesite ponovo predmete u semestar. Predmeti u zbiru moraju imati preko 30 ECTS-bodova.");
        }
    }

    public void brisiPredmet(MasterPredmet mp) throws IllegalArgumentException {
        if (mp instanceof ObavezniMasterPredmet) {
            Iterator it = getObavezniPredmeti().iterator();
            while (it.hasNext()) {
                ObavezniMasterPredmet omp1 = (ObavezniMasterPredmet) it.next();
                if (omp1.equals(mp)) {
                    getObavezniPredmeti().remove(mp);
                    setTrenutniBrojObaveznihPredmeta(this.getTrenutniBrojObaveznihPredmeta() - 1);
                    setTrenutniBrojECTSBodova(this.getUKUPAN_BROJ_ECTS_BODOVA() - mp.getECTS_BODOVI());
                    return;
                }
            }
            throw new IllegalArgumentException(mp.ispisiPredmet() + " nije dodan u ovaj semestar.");
        } else {
            Iterator it = getIzborniPredmeti().iterator();
            while (it.hasNext()) {
                IzborniMasterPredmet imp1 = (IzborniMasterPredmet) it.next();
                if (imp1.equals(mp)) {
                    getIzborniPredmeti().remove(mp);
                    setTrenutniBrojIzbornihPredmeta(this.getTrenutniBrojIzbornihPredmeta() - 1);
                    setTrenutniBrojECTSBodova(this.getUKUPAN_BROJ_ECTS_BODOVA() - mp.getECTS_BODOVI());
                    return;
                }
            }
            throw new IllegalArgumentException(mp.ispisiPredmet() + " nije dodan u ovaj semestar.");
        }
    }

    @Override
    public String ispisiSemestar() {
        return ("Master" + super.ispisiSemestar());
    }

    public String ispisiPredmeteUSemestru() {
        String rezultat = new String("");
        for (ObavezniMasterPredmet omp : getObavezniPredmeti()) rezultat += omp.ispisiPredmet() + "\n";
        for (IzborniMasterPredmet imp : getIzborniPredmeti()) rezultat += imp.ispisiPredmet() + "\n";
        return rezultat;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof MasterSemestar) {
            MasterSemestar bs = (MasterSemestar) o;
            if (bs.getBrojSemestra() == this.getBrojSemestra())
                return true;
        }
        return false;
    }
}
