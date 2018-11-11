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

    public void dodajPredmet(Predmet p) throws IllegalArgumentException {
        if (getPlanStudija().get(p.getBrojSemestra()) == null)
            throw new IllegalArgumentException("Predmet ne pripada ovom planu studija.");
        List<Predmet> predmeti = getPlanStudija().get(p.getBrojSemestra());
        predmeti.add(p);
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
