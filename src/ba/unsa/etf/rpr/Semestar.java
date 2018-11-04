package ba.unsa.etf.rpr;

public class Semestar {
    private int brojSemestra = 0;
    protected int trenutniBrojECTSBodova = 0, trenutniBrojObaveznihPredmeta = 0, trenutniBrojIzbornihPredmeta = 0;
    private final int UKUPAN_BROJ_ECTS_BODOVA, BROJ_OBAVEZNIH_PREDMETA, BROJ_IZBORNIH_PREDMETA;

    public Semestar(int brojSemestra, int ectsBodovi, int brojObaveznihPredmeta, int brojIzbornihPredmeta) {
        this.brojSemestra = brojSemestra;
        this.UKUPAN_BROJ_ECTS_BODOVA = ectsBodovi;
        this.BROJ_OBAVEZNIH_PREDMETA = brojObaveznihPredmeta;
        this.BROJ_IZBORNIH_PREDMETA = brojIzbornihPredmeta;
        this.trenutniBrojECTSBodova = 0;
        this.trenutniBrojObaveznihPredmeta = 0;
        this.trenutniBrojIzbornihPredmeta = 0;
    }
}
