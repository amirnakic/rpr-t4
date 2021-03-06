package ba.unsa.etf.rpr.staro;

public class Ciklus {
    protected int trenutniBrojSemestara = 0;
    private final int BROJ_SEMESTARA;

    public Ciklus(int brojSemestara) {
        this.BROJ_SEMESTARA = brojSemestara;
        this.trenutniBrojSemestara = 0;
    }

    public int getTrenutniBrojSemestara() {
        return trenutniBrojSemestara;
    }

    public int getBROJ_SEMESTARA() {
        return BROJ_SEMESTARA;
    }

    public void setTrenutniBrojSemestara(int trenutniBrojSemestara) {
        this.trenutniBrojSemestara = trenutniBrojSemestara;
    }

    public String ispisiCiklus() {
        return ("Ciklus se sastoji iz sljedećeg broja semestara: " + getBROJ_SEMESTARA());
    }
}
