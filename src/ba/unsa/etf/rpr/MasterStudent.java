package ba.unsa.etf.rpr;

public class MasterStudent extends Student {
    public MasterStudent(String ime, String prezime, int brojIndeksa) {
        super(ime, prezime, brojIndeksa);
    }

    @Override
    public String ispisiStudenta() {
        return ("Master" + super.ispisiStudenta());
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof MasterStudent) {
            MasterStudent ms = (MasterStudent) o;
            if (this.getIme().equals(ms.getIme()) && this.getPrezime().equals(ms.getPrezime()) && this.getBrojIndeksa() == ms.getBrojIndeksa())
                return true;
        }
        return false;
    }
}
