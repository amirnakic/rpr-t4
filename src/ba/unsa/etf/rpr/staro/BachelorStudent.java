package ba.unsa.etf.rpr.staro;

public class BachelorStudent extends Student {
    public BachelorStudent(String ime, String prezime, int brojIndeksa) {
        super(ime, prezime, brojIndeksa);
    }

    @Override
    public String ispisiStudenta() {
        return ("Bachelor" + super.ispisiStudenta());
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof BachelorStudent) {
            BachelorStudent bs = (BachelorStudent) o;
            if (this.getIme().equals(bs.getIme()) && this.getPrezime().equals(bs.getPrezime()) && this.getBrojIndeksa() == bs.getBrojIndeksa())
                return true;
        }
        return false;
    }
}
