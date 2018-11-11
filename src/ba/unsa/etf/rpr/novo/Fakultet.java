package ba.unsa.etf.rpr.novo;

import java.util.Set;

public class Fakultet {
    private String imeFakulteta;
    private Set<Upis> upisani;

    public Fakultet(String imeFakulteta, Set<Upis> upisani) {
        setImeFakulteta(imeFakulteta);
        setUpisani(upisani);
    }

    public void upisiStudenta(Upis u, int brojSemestra) {
        if (provjeriEctsBodoveStudenta(u, brojSemestra))
            getUpisani().add(u);
    }

    

    public boolean provjeriEctsBodoveStudenta(Upis test, int brojSemestra) {
        int ukupanBrojEctsBodova = 0;
        for (Predmet p : test.getPlanStudija().getPlanStudija().get(brojSemestra))
            ukupanBrojEctsBodova += p.getEcts();
        if (ukupanBrojEctsBodova >= 30) return true;
        return false;
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
