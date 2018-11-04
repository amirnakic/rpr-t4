package ba.unsa.etf.rpr;

public class Predmet {
    private String nazivPredmeta = "", sifraPredmeta = "";
    private int trenutniBrojStudenata = 0;
    private final int ECTS_BODOVI;
    private final int MAX_BROJ_STUDENATA;

    public Predmet(String nazivPredmeta, String sifraPredmeta, int ects, int maxBrojStudenata) {
        this.nazivPredmeta = nazivPredmeta;
        this.sifraPredmeta = sifraPredmeta;
        this.ECTS_BODOVI = ects;
        this.MAX_BROJ_STUDENATA = maxBrojStudenata;
    }
}
