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

    public void upisi(Upis u) throws IllegalArgumentException {
        getUpisani().add(u);
    }

    public int dajEctsBodoveStudentaUSemestru(Student s, int brojSemestra) {
        int ukupanBrojEctsBodova = 0;
        for (Upis u : getUpisani())
            if (u.getStudent().equals(s) && u.getPlanStudija().getPlanStudija().get(brojSemestra).contains(u.getPredmet()))
                ukupanBrojEctsBodova += u.getPredmet().getEcts();
        return ukupanBrojEctsBodova;
    }

    public Set<Student> dajUpisaneStudente() {
        Set<Student> rezultat = new HashSet<>();
        for (Upis u : getUpisani())
            rezultat.add(u.getStudent());
        return rezultat;
    }

    public Set<Predmet> dajUpisanePredmete() {
        Set<Predmet> rezultat = new HashSet<>();
        for (Upis u : getUpisani())
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
