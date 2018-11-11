package ba.unsa.etf.rpr.novo;

import java.util.List;
import java.util.ArrayList;

public class Predmet {
    private String imePredmeta;
    private int ects, brojSemestra;
    private final int MAX_BROJ_STUDENATA = 60;
    private List<Student> studentiNaPredmetu = new ArrayList<>();

    public Predmet(String imePredmeta, int ects, int brojSemestra, List<Student> studenti) {
        setImePredmeta(imePredmeta);
        setEcts(ects);
        setBrojSemestra(brojSemestra);
        setStudentiNaPredmetu(studenti);
    }

    public int getBrojSemestra() {
        return brojSemestra;
    }

    public void setBrojSemestra(int brojSemestra) {
        this.brojSemestra = brojSemestra;
    }

    public String getImePredmeta() {
        return imePredmeta;
    }

    public void setImePredmeta(String imePredmeta) {
        this.imePredmeta = imePredmeta;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public int getMAX_BROJ_STUDENATA() {
        return MAX_BROJ_STUDENATA;
    }

    public List<Student> getStudentiNaPredmetu() {
        return studentiNaPredmetu;
    }

    public void setStudentiNaPredmetu(List<Student> studentiNaPredmetu) {
        this.studentiNaPredmetu = studentiNaPredmetu;
    }

    public void dodajStudenta(Student s) throws ArrayStoreException {
        if (getStudentiNaPredmetu().size() == 60) throw new ArrayStoreException("Kapacitet predmeta je popunjen.");
        else getStudentiNaPredmetu().add(s);
    }

    public String ispisiStudenteNaPredmetu() {
        String rezultat = "Studenti na predmetu " + getImePredmeta() + " su:\n";
        for (Student s : getStudentiNaPredmetu())
            rezultat += s.ispisiStudenta() + "\n";
        return rezultat;
    }

    @Override
    public boolean equals(Object o) {
        Predmet p = (Predmet) o;
        if (this.getImePredmeta().equals(p.getImePredmeta()) && this.getStudentiNaPredmetu().equals(p.getStudentiNaPredmetu()) &&
                this.getMAX_BROJ_STUDENATA() == p.getMAX_BROJ_STUDENATA() && this.getBrojSemestra() == p.getBrojSemestra() && this.getEcts() == p.getEcts())
            return true;
        return false;
    }
}
