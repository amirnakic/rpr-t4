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

    public int getBrojSemestra() {
        return brojSemestra;
    }

    public void setBrojSemestra(int brojSemestra) {
        this.brojSemestra = brojSemestra;
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

    public String ispisiStudenteNaPredmetu() {
        String rezultat = "Studenti na predmetu " + getImePredmeta() + " su:\n";
        for (Student s : getStudentiNaPredmetu())
            rezultat += s.ispisiStudenta() + "\n";
        return rezultat;
    }
}
