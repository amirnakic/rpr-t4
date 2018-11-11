package ba.unsa.etf.rpr.novo;

public class Student {
    private String ime, prezime;
    private int brojIndeksa;

    public Student(String ime, String prezime, int brojIndeksa) {
        setIme(ime);
        setPrezime(prezime);
        setBrojIndeksa(brojIndeksa);
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }

    public String ispisiStudenta() {
        return getIme() + " " + getPrezime() + " (" + getBrojIndeksa() + ")";
    }

    @Override
    public boolean equals(Object o) {
        Student s = (Student) o;
        if (this.getIme().equals(s.getIme()) && this.getPrezime().equals(s.getPrezime()) && this.getBrojIndeksa() == s.getBrojIndeksa())
            return true;
        return false;
    }
}
