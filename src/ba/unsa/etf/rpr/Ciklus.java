package ba.unsa.etf.rpr;

public class Ciklus {
    protected int trenutniBrojSemestara = 0;
    private final int BROJ_SEMESTARA;

    public Ciklus(int brojSemestara) {
        this.BROJ_SEMESTARA = brojSemestara;
        this.trenutniBrojSemestara = 0;
    }
}
