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

    /*public void upisi(Upis u) throws IllegalArgumentException {
        if (dajEctsBodoveStudenta(u.getStudent()) + u.getPredmet().getEcts() < 30)
            getUpisani().add(u);
    }

    public void izbaciStudenta(Student s) {
        for (Upis u : getUpisani())
            if (u.getStudent().equals(s))
                upisani.remove(u);
    }

    public int dajEctsBodoveStudenta(Student s) {
        int ukupanBrojEctsBodova = 0;
        for (Upis u : getUpisani())
            if (u.getStudent().equals(s))
                ukupanBrojEctsBodova += u.getPredmet().getEcts();
        return ukupanBrojEctsBodova;
    }*/

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
