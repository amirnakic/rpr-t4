package ba.unsa.etf.rpr.novo;

import java.util.HashSet;
import java.util.Set;

public class Fakultet {
    private String imeFakulteta;
    private Set<Upis> upisani;

    public Fakultet(String imeFakulteta, Set<Upis> upisani) {
        setImeFakulteta(imeFakulteta);
        setUpisani(upisani);
    }

    public void upisi(Upis u) {
        getUpisani().add(u);
    }

    public void ispisiStudentaSaPredmeta(Student s, Predmet p) throws IllegalArgumentException {
        for (Upis u : getUpisani())
            if (u.getStudent().equals(s) && u.getPredmet().equals(p)) {
                getUpisani().remove(u);
                return;
            }
        throw new IllegalArgumentException("Nije pronađen student upisan na navedeni predmet.");
    }

    public int dajEctsBodoveStudentaUSemestru(Student s, int brojSemestra) {
        int ukupanBrojEctsBodova = 0;
        for (Upis u : getUpisani())
            if (u.getStudent().equals(s) && u.getPlanStudija().getPlanStudija().get(brojSemestra).contains(u.getPredmet()))
                ukupanBrojEctsBodova += u.getPredmet().getEcts();
        return ukupanBrojEctsBodova;
    }

    public Set<Student> dajStudenteUpisaneNaFakultet() {
        Set<Student> rezultat = new HashSet<>();
        for (Upis u : getUpisani())
            rezultat.add(u.getStudent());
        return rezultat;
    }

    public Set<Predmet> dajPredmeteNaKojeSuUpisaniStudenti() {
        Set<Predmet> rezultat = new HashSet<>();
        for (Upis u : getUpisani())
            rezultat.add(u.getPredmet());
        return rezultat;
    }

    public Set<Student> dajStudenteUpisaneUSemestar(int brojSemestra) {
        Set<Student> rezultat = new HashSet<>();
        for (Upis u : getUpisani())
            if (u.getPlanStudija().getPlanStudija().get(brojSemestra).contains(u.getPredmet()))
                rezultat.add(u.getStudent());
        return rezultat;
    }

    public Set<Predmet> dajPredmeteUSemestruNaKojeSuUpisaniStudenti(int brojSemestra) {
        Set<Predmet> rezultat = new HashSet<>();
        for (Upis u : getUpisani())
            if (u.getPlanStudija().getPlanStudija().get(brojSemestra).contains(u.getPredmet()))
                rezultat.add(u.getPredmet());
        return rezultat;
    }

    public Set<Student> dajStudenteUpisaneNaPredmet(Predmet p) {
        Set<Student> rezultat = new HashSet<>();
        for (Upis u : getUpisani())
            if (u.getPredmet().equals(p))
                rezultat.add(u.getStudent());
        return rezultat;
    }

    public Set<Predmet> dajPredmeteNaKojeJeUpisanStudent(Student s) {
        Set<Predmet> rezultat = new HashSet<>();
        for (Upis u : getUpisani())
            if (u.getStudent().equals(s))
                rezultat.add(u.getPredmet());
        return rezultat;
    }

    public String getImeFakulteta() {
        return imeFakulteta;
    }

    public void setImeFakulteta(String imeFakulteta) {
        this.imeFakulteta = imeFakulteta;
    }

    public Set<Upis> getUpisani() {
        return upisani;
    }

    public void setUpisani(Set<Upis> upisani) {
        this.upisani = upisani;
    }
}
