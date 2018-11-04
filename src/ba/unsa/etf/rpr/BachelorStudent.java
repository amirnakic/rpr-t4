package ba.unsa.etf.rpr;

public class BachelorStudent extends Student {
    public BachelorStudent(String ime, String prezime, int brojIndeksa) {
        super(ime, prezime, brojIndeksa);
    }
    @Override
    public String ispisiStudenta() {
        return ("Bachelor" + super.ispisiStudenta());
    }
}
