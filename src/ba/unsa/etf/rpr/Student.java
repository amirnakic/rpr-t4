package ba.unsa.etf.rpr;

public class Student {
    private String ime = "", prezime = "";
    private int brojIndeksa = 0;

    public Student(String ime, String prezime, int brojIndeksa) {
        this.setIme(ime);
        this.setPrezime(prezime);
        this.setBrojIndeksa(brojIndeksa);
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
        return ("Student: " + this.getIme() + " " + this.getPrezime() + "(" + this.getBrojIndeksa() + ")");
    }
}
