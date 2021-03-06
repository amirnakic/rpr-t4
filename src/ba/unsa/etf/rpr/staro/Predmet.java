package ba.unsa.etf.rpr.staro;

public class Predmet {
    private String nazivPredmeta = "", sifraPredmeta = "";
    protected int trenutniBrojStudenata = 0;
    private final int ECTS_BODOVI;
    private final int MAX_BROJ_STUDENATA;

    public Predmet(String nazivPredmeta, String sifraPredmeta, int ects, int maxBrojStudenata) {
        this.setNazivPredmeta(nazivPredmeta);
        this.setSifraPredmeta(sifraPredmeta);
        this.trenutniBrojStudenata = 0;
        this.ECTS_BODOVI = ects;
        this.MAX_BROJ_STUDENATA = maxBrojStudenata;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public String getSifraPredmeta() {
        return sifraPredmeta;
    }

    public int getTrenutniBrojStudenata() {
        return trenutniBrojStudenata;
    }

    public int getECTS_BODOVI() {
        return ECTS_BODOVI;
    }

    public int getMAX_BROJ_STUDENATA() {
        return MAX_BROJ_STUDENATA;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public void setSifraPredmeta(String sifraPredmeta) {
        this.sifraPredmeta = sifraPredmeta;
    }

    public void setTrenutniBrojStudenata(int trenutniBrojStudenata) {
        this.trenutniBrojStudenata = trenutniBrojStudenata;
    }

    public String ispisiPredmet() {
        return ("Predmet: " + this.getNazivPredmeta() + "(" + this.getSifraPredmeta() + " - " + this.getECTS_BODOVI() + " ECTS - " + this.getTrenutniBrojStudenata() + "/" + this.getMAX_BROJ_STUDENATA() + ")");
    }
}
