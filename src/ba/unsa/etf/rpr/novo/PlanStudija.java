package ba.unsa.etf.rpr.novo;

import java.util.List;
import java.util.Map;

public class PlanStudija {
    Map<Integer, List<Predmet>> planStudija;

    public PlanStudija(Map<Integer, List<Predmet>> studenti) {
        setPlanStudija(studenti);
    }

    public Map<Integer, List<Predmet>> getPlanStudija() {
        return planStudija;
    }

    public void setPlanStudija(Map<Integer, List<Predmet>> planStudija) {
        this.planStudija = planStudija;
    }
}
