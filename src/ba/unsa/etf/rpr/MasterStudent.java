package ba.unsa.etf.rpr;

public class MasterStudent extends Student {
    public MasterStudent(String ime, String prezime, int brojIndeksa) {
        super(ime, prezime, brojIndeksa);
    }

    @Override
    public String ispisiStudenta() {
        return ("Master" + super.ispisiStudenta());
    }
}
