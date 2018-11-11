package ba.unsa.etf.rpr.novo;

import java.util.List;
import java.util.Map;

public class PlanStudija {
    private String smjer;
    Map<Integer, List<Predmet>> planStudija;

    public PlanStudija(String smjer, Map<Integer, List<Predmet>> studenti) {
        setSmjer(smjer);
        setPlanStudija(studenti);
    }

    public int provjeriEctsBodove(List<Predmet> predmeti) {
        int brojEctsBodova = 0;
        for (Predmet p : predmeti)
            brojEctsBodova += p.getEcts();
        return brojEctsBodova;
    }

    public void dodajPredmet(Predmet p) throws IllegalArgumentException {
        if (getPlanStudija().get(p.getBrojSemestra()) == null)
            throw new IllegalArgumentException("Predmet ne pripada ovom planu studija.");
        List<Predmet> predmeti = getPlanStudija().get(p.getBrojSemestra());
        if (provjeriEctsBodove(predmeti) + p.getEcts() < 30)
            predmeti.add(p);
        else
            throw new IllegalArgumentException("Dodavanjem ovog predmeta bio bi prekoračen dozvoljeni broj ECTS bodova.");
    }

    public String getSmjer() {
        return smjer;
    }

    public void setSmjer(String smjer) {
        this.smjer = smjer;
    }

    public Map<Integer, List<Predmet>> getPlanStudija() {
        return planStudija;
    }

    public void setPlanStudija(Map<Integer, List<Predmet>> planStudija) {
        this.planStudija = planStudija;
    }
}
