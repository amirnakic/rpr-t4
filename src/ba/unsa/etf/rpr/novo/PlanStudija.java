package ba.unsa.etf.rpr.novo;

import java.util.List;
import java.util.Map;

public class PlanStudija {
    private String smjer;
    Map<Integer, List<Student>> planStudija;

    public PlanStudija(String smjer, Map<Integer, List<Student>> studenti) {
        setSmjer(smjer);
        setPlanStudija(studenti);
    }

    public String getSmjer() {
        return smjer;
    }

    public void setSmjer(String smjer) {
        this.smjer = smjer;
    }

    public Map<Integer, List<Student>> getPlanStudija() {
        return planStudija;
    }

    public void setPlanStudija(Map<Integer, List<Student>> planStudija) {
        this.planStudija = planStudija;
    }
}
