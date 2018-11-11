package ba.unsa.etf.rpr.novo;

import java.util.Set;

public class Fakultet {
    private String imeFakulteta;
    private Set<Upis> upisani;

    public Fakultet(String imeFakulteta, Set<Upis> upisani) {
        setImeFakulteta(imeFakulteta);
        setUpisani(upisani);
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
