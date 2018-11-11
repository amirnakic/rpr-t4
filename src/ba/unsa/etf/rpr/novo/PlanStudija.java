package ba.unsa.etf.rpr.novo;

import java.util.List;
import java.util.Map;

public class PlanStudija {
    Map<Integer, List<Predmet>> planStudija;

    public PlanStudija(Map<Integer, List<Predmet>> studenti) {
        setPlanStudija(studenti);
    }

    public void dodajPredmet(Predmet p) throws IllegalArgumentException {
        if (getPlanStudija().get(p.getBrojSemestra()) == null)
            throw new IllegalArgumentException("Predmet ne pripada ovom planu studija.");
        List<Predmet> predmeti = getPlanStudija().get(p.getBrojSemestra());
        predmeti.add(p);
    }

    public void ukloniPredmet(Predmet p) throws IllegalArgumentException {
        List<Predmet> predmeti = getPlanStudija().get(p.getBrojSemestra());
        if (predmeti.contains(p))
            predmeti.remove(p);
        else throw new IllegalArgumentException("Nepostojeći predmet.");
    }

    public int dajBrojEctsBodovaUSemestru(int brojSemestra) throws IllegalArgumentException {
        int brojEctsBodovaUSemestru = 0;
        if (getPlanStudija().get(brojSemestra) == null)
            throw new IllegalArgumentException("Semestar nije evidentiran.");
        for (Predmet p : getPlanStudija().get(brojSemestra))
            brojEctsBodovaUSemestru += p.getEcts();
        return brojEctsBodovaUSemestru;
    }

    public Map<Integer, List<Predmet>> getPlanStudija() {
        return planStudija;
    }

    public void setPlanStudija(Map<Integer, List<Predmet>> planStudija) {
        this.planStudija = planStudija;
    }
}
