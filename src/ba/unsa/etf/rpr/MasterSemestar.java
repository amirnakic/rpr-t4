package ba.unsa.etf.rpr;

import java.util.ArrayList;
import java.util.List;

public class MasterSemestar extends Semestar {
    private List<ObavezniMasterPredmet> obavezniPredmeti;
    private List<IzborniMasterPredmet> izborniPredmeti;

    public MasterSemestar(int brojSemestra, int ectsBodovi, int brojObaveznihPredmeta, int brojIzbornihPredmeta) {
        super(brojSemestra, ectsBodovi, brojObaveznihPredmeta, brojIzbornihPredmeta);
        obavezniPredmeti = new ArrayList<>(this.getBROJ_OBAVEZNIH_PREDMETA());
        izborniPredmeti = new ArrayList<>(this.getBROJ_IZBORNIH_PREDMETA());
    }

    
}
