package ba.unsa.etf.rpr.staro;

public class Semestar {
    private int brojSemestra = 0;
    protected int trenutniBrojECTSBodova = 0, trenutniBrojObaveznihPredmeta = 0, trenutniBrojIzbornihPredmeta = 0;
    private final int UKUPAN_BROJ_ECTS_BODOVA, BROJ_OBAVEZNIH_PREDMETA, BROJ_IZBORNIH_PREDMETA;

    public Semestar(int brojSemestra, int ectsBodovi, int brojObaveznihPredmeta, int brojIzbornihPredmeta) throws IllegalArgumentException {
        if (ectsBodovi < 30)
            throw new IllegalArgumentException("Broj ECTS-bodova u semestru ne smije biti manji od 30.");
        else {
            this.UKUPAN_BROJ_ECTS_BODOVA = ectsBodovi;
            this.brojSemestra = brojSemestra;
            this.BROJ_OBAVEZNIH_PREDMETA = brojObaveznihPredmeta;
            this.BROJ_IZBORNIH_PREDMETA = brojIzbornihPredmeta;
            this.trenutniBrojECTSBodova = 0;
            this.trenutniBrojObaveznihPredmeta = 0;
            this.trenutniBrojIzbornihPredmeta = 0;
        }
    }

    public int getBrojSemestra() {
        return brojSemestra;
    }

    public int getTrenutniBrojECTSBodova() {
        return trenutniBrojECTSBodova;
    }

    public int getTrenutniBrojObaveznihPredmeta() {
        return trenutniBrojObaveznihPredmeta;
    }

    public int getTrenutniBrojIzbornihPredmeta() {
        return trenutniBrojIzbornihPredmeta;
    }

    public int getUKUPAN_BROJ_ECTS_BODOVA() {
        return UKUPAN_BROJ_ECTS_BODOVA;
    }

    public int getBROJ_OBAVEZNIH_PREDMETA() {
        return BROJ_OBAVEZNIH_PREDMETA;
    }

    public int getBROJ_IZBORNIH_PREDMETA() {
        return BROJ_IZBORNIH_PREDMETA;
    }

    public void setTrenutniBrojECTSBodova(int trenutniBrojECTSBodova) {
        this.trenutniBrojECTSBodova = trenutniBrojECTSBodova;
    }

    public void setTrenutniBrojObaveznihPredmeta(int trenutniBrojObaveznihPredmeta) {
        this.trenutniBrojObaveznihPredmeta = trenutniBrojObaveznihPredmeta;
    }

    public void setTrenutniBrojIzbornihPredmeta(int trenutniBrojIzbornihPredmeta) {
        this.trenutniBrojIzbornihPredmeta = trenutniBrojIzbornihPredmeta;
    }

    public String ispisiSemestar() {
        return ("Semestar broj " + getBrojSemestra() + " sa ukupno " + getBROJ_OBAVEZNIH_PREDMETA() + " obaveznih i " + getBROJ_IZBORNIH_PREDMETA() + " izbornih predmeta koji nose ukupno " + getUKUPAN_BROJ_ECTS_BODOVA() + " ECTS-bodova.");
    }
}
